package com.friendo.backend.users.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UsersErrorCode {

    EXISTS_USERS_ID("이미 존재하는 아이디입니다."),
    EXISTS_USERS_EMAIL("이미 존재하는 이메일입니다."),
    EXISTS_USERS_NICKNAME("이미 존재하는 닉네임입니다."),
    ;

    private final String message;
}
