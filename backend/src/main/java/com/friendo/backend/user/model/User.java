package com.friendo.backend.user.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.sql.Timestamp;

@Entity
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String userId;

    @Column(nullable = false)
    private String userPassword;

    @Column(nullable = false)
    private String userNickname;

    @Column(nullable = false)
    private String userEmail;

    @Column(nullable = false)
    private Timestamp userCreatedAt;

    @Column(nullable = false)
    private Timestamp userChangedAt;

    @Column
    private Timestamp userDeletedAt;

    @Column(nullable = false)
    private Boolean activated;

    public void updatePassword(String userPassword){
        this.userPassword = userPassword;
    }

    public void updateEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void updateNickname(String userNickname) {
        this.userNickname = userNickname;
    }


}
