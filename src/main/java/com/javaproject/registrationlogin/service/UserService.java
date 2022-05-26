package com.javaproject.registrationlogin.service;

import com.javaproject.registrationlogin.model.User;
import com.javaproject.registrationlogin.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
