package com.friendo.backend.user.dto;

import lombok.Setter;

@Setter
public class UserSignUpDto {

    private String userId;

    private String userPassword;

    private String userNickname;

    private String userEmail;
}