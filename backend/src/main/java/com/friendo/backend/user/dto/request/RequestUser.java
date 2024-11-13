package com.friendo.backend.user.dto.request;

import java.sql.Timestamp;

public class RequestUser {
    private String userId;
    private String userPassword;
    private String userNickname;
    private String userEmail;
    private Timestamp userCreatedAt;
    private Timestamp userChangedAt;
    private Boolean activated;
}
