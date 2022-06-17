package com.javaproject.registrationlogin.web;

import com.javaproject.registrationlogin.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {UserRegistrationController.class})
@ExtendWith(SpringExtension.class)
class UserRegistrationControllerTest {
    @Autowired
    private UserRegistrationController userRegistrationController;

    @MockBean
    private UserService userService;

    /**
     * Method under test: {@link UserRegistrationController#registerUserAccount(com.javaproject.registrationlogin.web.dto.UserRegistrationDto)}
     */
    @Test
    void testRegisterUserAccount() throws Exception {
        SecurityMockMvcRequestBuilders.FormLoginRequestBuilder requestBuilder = SecurityMockMvcRequestBuilders.formLogin();
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(this.userRegistrationController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isNotFound());
    }

    /**
     * Method under test: {@link UserRegistrationController#userRegistrationDto()}
     */
    @Test
    void testUserRegistrationDto() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by userRegistrationDto()
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        this.userRegistrationController.userRegistrationDto();
    }

    /**
     * Method under test: {@link UserRegistrationController#showRegistrationForm()}
     */
    @Test
    void testShowRegistrationForm() throws Exception {
        SecurityMockMvcRequestBuilders.FormLoginRequestBuilder requestBuilder = SecurityMockMvcRequestBuilders.formLogin();
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(this.userRegistrationController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().isNotFound());
    }
}

