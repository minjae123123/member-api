package com.memberapi.controller;

import com.memberapi.dto.request.CreateMemberRequest;
import com.memberapi.dto.response.MemberResponse;
import com.memberapi.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/members")
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public MemberResponse createMember(@RequestBody CreateMemberRequest request) {
        log.info("[API - LOG] POST /api/members");
        return memberService.createMember(request);
    }

    @GetMapping("/{id}")
    public MemberResponse getMember(@PathVariable Long id) {
        log.info("[API - LOG] GET /api/members/{}", id);
        return memberService.getMember(id);

    }

    @PostMapping("/{id}/profile-image")
    public Map<String, String> uploadProfileImage(
            @PathVariable Long id,
            @RequestParam("file") MultipartFile file
    ) {
        log.info("[API - LOG] POST /api/members/{}/profile-image", id);

        String profileImageKey = memberService.uploadProfileImage(id, file);

        return Map.of("profileImageKey", profileImageKey);
    }

    @GetMapping("/{id}/profile-image")
    public Map<String, String> getProfileImageUrl(@PathVariable Long id) {
        log.info("[API - LOG] GET /api/members/{}/profile-image", id);

        String presignedUrl = memberService.getProfileImageUrl(id);

        return Map.of("presignedUrl", presignedUrl);
    }
}
