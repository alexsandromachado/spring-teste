package com.example.spring_teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.spring_teste.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    UserDetails findByLogin(String login);
}