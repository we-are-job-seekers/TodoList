package com.friendo.backend.users.repository;

import com.friendo.backend.users.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    boolean existsByUserId(String userId);

    boolean existsByUserEmail(String userEmail);

    Optional<Users> findById(Long Id);

    Optional<Users> findByUserNameAndUserEmail(String userName, String userEmail);
}