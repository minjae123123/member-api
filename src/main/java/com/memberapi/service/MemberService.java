package com.memberapi.service;

import com.memberapi.dto.request.CreateMemberRequest;
import com.memberapi.dto.response.MemberResponse;
import com.memberapi.entity.Member;
import com.memberapi.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

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
}
