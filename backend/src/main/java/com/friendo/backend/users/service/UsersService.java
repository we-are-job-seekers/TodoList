package com.friendo.backend.users.service;

import com.friendo.backend.users.dto.UsersJoinDto;
import com.friendo.backend.users.model.Users;
import com.friendo.backend.users.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UsersRepository usersRepository;

    public boolean checkUsersId(String userId) {

        return usersRepository.existsByUserId(userId);
    }

    public boolean checkUsersEmail(String userEmail) {

        return usersRepository.existsByUserEmail(userEmail);
    }

    public Optional<Users> findUserByUserNameAndUserEmail(String userName, String userEmail) {
        Optional<Users> findUser = usersRepository.findByUserNameAndUserEmail(userName, userEmail);

        return findUser;
    }

    public void joinUsers(UsersJoinDto usersJoinDto) {

        usersRepository.save(usersJoinDto.toEntity());
    }
}
