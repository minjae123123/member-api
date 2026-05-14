package com.memberapi.dto.response;

import lombok.Getter;

@Getter
public class MemberResponse {
    private Long id;
    private String name;
    private int age;
    private String mbti;

    public MemberResponse(Long id, String name, int age, String mbti) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mbti = mbti;
    }
}
