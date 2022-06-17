package com.javaproject.registrationlogin.web.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UserRegistrationDtoTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link UserRegistrationDto#UserRegistrationDto()}
     *   <li>{@link UserRegistrationDto#setEmail(String)}
     *   <li>{@link UserRegistrationDto#setFirstName(String)}
     *   <li>{@link UserRegistrationDto#setLastName(String)}
     *   <li>{@link UserRegistrationDto#setPassword(String)}
     *   <li>{@link UserRegistrationDto#getEmail()}
     *   <li>{@link UserRegistrationDto#getFirstName()}
     *   <li>{@link UserRegistrationDto#getLastName()}
     *   <li>{@link UserRegistrationDto#getPassword()}
     * </ul>
     */
    @Test
    void testConstructor() {
        UserRegistrationDto actualUserRegistrationDto = new UserRegistrationDto();
        actualUserRegistrationDto.setEmail("jane.doe@example.org");
        actualUserRegistrationDto.setFirstName("Jane");
        actualUserRegistrationDto.setLastName("Doe");
        actualUserRegistrationDto.setPassword("iloveyou");
        assertEquals("jane.doe@example.org", actualUserRegistrationDto.getEmail());
        assertEquals("Jane", actualUserRegistrationDto.getFirstName());
        assertEquals("Doe", actualUserRegistrationDto.getLastName());
        assertEquals("iloveyou", actualUserRegistrationDto.getPassword());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link UserRegistrationDto#UserRegistrationDto(String, String, String, String)}
     *   <li>{@link UserRegistrationDto#setEmail(String)}
     *   <li>{@link UserRegistrationDto#setFirstName(String)}
     *   <li>{@link UserRegistrationDto#setLastName(String)}
     *   <li>{@link UserRegistrationDto#setPassword(String)}
     *   <li>{@link UserRegistrationDto#getEmail()}
     *   <li>{@link UserRegistrationDto#getFirstName()}
     *   <li>{@link UserRegistrationDto#getLastName()}
     *   <li>{@link UserRegistrationDto#getPassword()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        UserRegistrationDto actualUserRegistrationDto = new UserRegistrationDto("Jane", "Doe", "jane.doe@example.org",
                "iloveyou");
        actualUserRegistrationDto.setEmail("jane.doe@example.org");
        actualUserRegistrationDto.setFirstName("Jane");
        actualUserRegistrationDto.setLastName("Doe");
        actualUserRegistrationDto.setPassword("iloveyou");
        assertEquals("jane.doe@example.org", actualUserRegistrationDto.getEmail());
        assertEquals("Jane", actualUserRegistrationDto.getFirstName());
        assertEquals("Doe", actualUserRegistrationDto.getLastName());
        assertEquals("iloveyou", actualUserRegistrationDto.getPassword());
    }
}

