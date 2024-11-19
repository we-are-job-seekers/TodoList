package com.friendo.backend.users.service;

import com.friendo.backend.users.dto.UsersJoinDto;
import com.friendo.backend.users.exception.UsersErrorCode;
import com.friendo.backend.users.exception.UsersException;
import com.friendo.backend.users.model.Users;
import com.friendo.backend.users.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UsersRepository usersRepository;

    //회원가입
    public boolean checkUsersId(String userId) {

        return usersRepository.existsByUserId(userId);
    }

    public boolean checkUsersEmail(String userEmail) {

        return usersRepository.existsByUserEmail(userEmail);
    }

    public boolean checkUsersNickname(String userNickname) {
        return usersRepository.existsByUserNickname(userNickname);
    }

    public void joinUsers(UsersJoinDto usersJoinDto) {
        if(checkUsersId(usersJoinDto.getUserId())) {
            throw new UsersException(UsersErrorCode.EXISTS_USERS_ID);
        }
        else if(checkUsersEmail(usersJoinDto.getUserEmail())) {
            throw new UsersException(UsersErrorCode.EXISTS_USERS_EMAIL);
        }
        else if(checkUsersNickname(usersJoinDto.getUserNickname())) {
            throw new UsersException(UsersErrorCode.EXISTS_USERS_NICKNAME);
        }
        else usersRepository.save(usersJoinDto.toEntity());
    }

    //아이디 찾기
    public Optional<Users> findUserByUserNameAndUserEmail(String userName, String userEmail) {
        Optional<Users> findUser = usersRepository.findByUserNameAndUserEmail(userName, userEmail);

        return findUser;
    }

}
