package com.javaproject.registrationlogin.service;

import com.javaproject.registrationlogin.model.User;
import com.javaproject.registrationlogin.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
