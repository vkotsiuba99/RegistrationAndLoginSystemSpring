package com.javaproject.registrationlogin.service;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.javaproject.registrationlogin.model.User;
import com.javaproject.registrationlogin.repository.UserRepository;
import com.javaproject.registrationlogin.web.dto.UserRegistrationDto;

import java.util.ArrayList;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {UserServiceImpl.class, BCryptPasswordEncoder.class})
@ExtendWith(SpringExtension.class)
class UserServiceImplTest {
    @MockBean
    private UserRepository userRepository;

    @Autowired
    private UserServiceImpl userServiceImpl;

    /**
     * Method under test: {@link UserServiceImpl#save(UserRegistrationDto)}
     */
    @Test
    void testSave() {
        User user = new User();
        user.setEmail("jane.doe@example.org");
        user.setFirstName("Jane");
        user.setId(123L);
        user.setLastName("Doe");
        user.setPassword("iloveyou");
        user.setRoles(new ArrayList<>());
        when(this.userRepository.save((User) any())).thenReturn(user);
        assertSame(user,
                this.userServiceImpl.save(new UserRegistrationDto("Jane", "Doe", "jane.doe@example.org", "iloveyou")));
        verify(this.userRepository).save((User) any());
    }

    /**
     * Method under test: {@link UserServiceImpl#save(UserRegistrationDto)}
     */
    @Test
    void testSave2() {
        when(this.userRepository.save((User) any())).thenThrow(new UsernameNotFoundException("ROLE_USER"));
        assertThrows(UsernameNotFoundException.class,
                () -> this.userServiceImpl.save(new UserRegistrationDto("Jane", "Doe", "jane.doe@example.org", "iloveyou")));
        verify(this.userRepository).save((User) any());
    }

    /**
     * Method under test: {@link UserServiceImpl#loadUserByUsername(String)}
     */
    @Test
    void testLoadUserByUsername() throws UsernameNotFoundException {
        when(this.userRepository.findByEmail((String) any()))
                .thenThrow(new UsernameNotFoundException("Invalid username or password"));
        assertThrows(UsernameNotFoundException.class, () -> this.userServiceImpl.loadUserByUsername("janedoe"));
        verify(this.userRepository).findByEmail((String) any());
    }
}

