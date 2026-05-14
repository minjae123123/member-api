package com.memberapi.controller;

import com.memberapi.dto.request.CreateMemberRequest;
import com.memberapi.dto.response.MemberResponse;
import com.memberapi.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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
}
