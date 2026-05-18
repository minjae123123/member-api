package com.memberapi.service;

import com.memberapi.dto.request.CreateMemberRequest;
import com.memberapi.dto.response.MemberResponse;
import com.memberapi.entity.Member;
import com.memberapi.repository.MemberRepository;
import com.memberapi.s3.S3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final S3Service s3Service;

    @Transactional
    public MemberResponse createMember(CreateMemberRequest request) {
        Member member = new Member(
                request.getName(),
                request.getAge(),
                request.getMbti()
        );

        Member savedMember = memberRepository.save(member);

        return new MemberResponse(
                savedMember.getId(),
                savedMember.getName(),
                savedMember.getAge(),
                savedMember.getMbti());
    }

    public MemberResponse getMember(Long id) {
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 팀원입니다."));

        return new MemberResponse(
                member.getId(),
                member.getName(),
                member.getAge(),
                member.getMbti());
    }

    @Transactional
    public String uploadProfileImage(Long memberId, MultipartFile file) {
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 팀원입니다."));

        String profileImageKey = s3Service.uploadProfileImage(memberId, file);

        member.updateProfileImageKey(profileImageKey);

        return profileImageKey;
    }

    public String getProfileImageUrl(Long memberId) {
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 팀원입니다."));

        if (member.getProfileImageKey() == null) {
            throw new IllegalArgumentException("프로필 이미지가 등록되지 않았습니다.");
        }

        return s3Service.getPresignedUrl(member.getProfileImageKey());
    }
}
