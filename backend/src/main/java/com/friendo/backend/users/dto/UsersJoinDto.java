package com.friendo.backend.users.dto;

import com.friendo.backend.users.model.Users;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class UsersJoinDto {

    @NotBlank(message = "아이디를 입력해주세요.")
    private String userId;

    @NotBlank(message = "비밀번호를 입력해주세요.")
    @Size(min = 8, max = 20, message = "비밀번호는 8자 이상 20자 이하로 입력해주세요.")
    private String userPassword;

    @NotBlank(message = "이름을 입력해주세요.")
    private String userName;

    @NotBlank(message = "닉네임을 입력해주세요.")
    @Size(min = 2, max = 10, message = "닉네임은 2자 이상 10자 이하로 입력해주세요.")
    private String userNickname;

    @NotBlank(message = "이메일 주소를 입력해주세요.")
    @Email(message = "올바른 이메일 주소를 입력해주세요.")
    private String userEmail;

    @NotBlank
    private Boolean activated = false;

    @NotBlank
    private LocalDateTime userCreatedAt = LocalDateTime.now();

    @Builder(toBuilder = true)
    public UsersJoinDto(String userId, String userPassword, String userName, String userNickname, String userEmail, Boolean activated, LocalDateTime userCreatedAt) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userNickname = userNickname;
        this.userEmail = userEmail;
        this.activated = activated;
        this.userCreatedAt = userCreatedAt;
    }

    public Users toEntity() {
        return Users.builder()
                .userId(this.userId)
                .userPassword(this.userPassword)
                .userName(this.userName)
                .userNickname(this.userNickname)
                .userEmail(this.userEmail)
                .activated(this.activated)
                .userCreatedAt(this.userCreatedAt)
                .build();
    }
}
