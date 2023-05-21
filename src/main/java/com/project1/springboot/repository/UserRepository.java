package com.project1.springboot.repository;

import com.project1.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    //CRUD method
    Optional<User> findByEmail(String email);
}
