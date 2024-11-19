package com.friendo.backend.users.controller;

import com.friendo.backend.users.dto.UsersFindIdDto;
import com.friendo.backend.users.dto.UsersJoinDto;
import com.friendo.backend.users.model.Users;
import com.friendo.backend.users.service.UsersService;
import jakarta.persistence.JoinColumn;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
@Slf4j
public class UsersController {

    private final UsersService usersService;
    @GetMapping("/test")
    public Timestamp test(){
        Timestamp time = new Timestamp(System.currentTimeMillis());
        return time;
    }

    @GetMapping("/userId")
    public String findUserId(@RequestParam("userId") String userId) {
        boolean b = usersService.checkUsersId(userId);
        System.out.println(b);

        return "ok";
    }

    @PostMapping("/join")
    public ResponseEntity<Object> Join(@RequestBody UsersJoinDto usersJoinDto) {
        usersService.joinUsers(usersJoinDto);

        return ResponseEntity.ok().build();
    }

    @PostMapping("/findId")
    public String FindId(@RequestBody UsersFindIdDto usersFindIdDto) {
        Users user = usersService.findUserByUserNameAndUserEmail(usersFindIdDto.getUserName(), usersFindIdDto.getUserEmail());

        return user.getUserId();
    }
}
