package com.example.spring_teste.dto;

import com.example.spring_teste.entities.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
