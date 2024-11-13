package com.friendo.backend.user.service;

import com.friendo.backend.user.dto.UserSignUpDto;
import com.friendo.backend.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Member;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    UserRepository userRepository;

    /* 회원가입 */

    public void userIdValidate(String userId) {
        List<Member> findMember = userRepository.findByuserId(userId);
        if(!findMember.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 아이디입니다.");
        }
    }
    public Long SignUp(UserSignUpDto userSignUpDto) {
        userIdValidate(userSignUpDto.getUserId());
//        userRepository.save(userSignUpDto);
//        return userSignUpDto.getUserId();
        return 123L;
    }




}
