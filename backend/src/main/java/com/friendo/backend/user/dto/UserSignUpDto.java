package com.friendo.backend.user.dto;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserSignUpDto {

    private String userId;

    private String userPassword;

    private String userNickname;

    private String userEmail;
}