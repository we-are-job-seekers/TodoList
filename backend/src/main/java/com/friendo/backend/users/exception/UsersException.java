package com.friendo.backend.users.exception;

public class UsersException extends RuntimeException {
    private UsersErrorCode usersErrorCode;
    private String message;

    public UsersException(UsersErrorCode usersErrorCode) {
        this.usersErrorCode = usersErrorCode;
        this.message = usersErrorCode.getMessage();
    }
}
