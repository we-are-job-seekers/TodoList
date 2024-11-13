package com.friendo.backend.user.repository;

import com.friendo.backend.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.reflect.Member;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<Member> findByuserId(String userNickname);
}
