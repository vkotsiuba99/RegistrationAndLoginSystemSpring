package com.javaproject.registrationlogin.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;

class UserTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link User#User()}
     *   <li>{@link User#setEmail(String)}
     *   <li>{@link User#setFirstName(String)}
     *   <li>{@link User#setId(Long)}
     *   <li>{@link User#setLastName(String)}
     *   <li>{@link User#setPassword(String)}
     *   <li>{@link User#setRoles(Collection)}
     *   <li>{@link User#getEmail()}
     *   <li>{@link User#getFirstName()}
     *   <li>{@link User#getId()}
     *   <li>{@link User#getLastName()}
     *   <li>{@link User#getPassword()}
     *   <li>{@link User#getRoles()}
     * </ul>
     */
    @Test
    void testConstructor() {
        User actualUser = new User();
        actualUser.setEmail("jane.doe@example.org");
        actualUser.setFirstName("Jane");
        actualUser.setId(123L);
        actualUser.setLastName("Doe");
        actualUser.setPassword("iloveyou");
        ArrayList<Role> roleList = new ArrayList<>();
        actualUser.setRoles(roleList);
        assertEquals("jane.doe@example.org", actualUser.getEmail());
        assertEquals("Jane", actualUser.getFirstName());
        assertEquals(123L, actualUser.getId().longValue());
        assertEquals("Doe", actualUser.getLastName());
        assertEquals("iloveyou", actualUser.getPassword());
        assertSame(roleList, actualUser.getRoles());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link User#User(String, String, String, String, Collection)}
     *   <li>{@link User#setEmail(String)}
     *   <li>{@link User#setFirstName(String)}
     *   <li>{@link User#setId(Long)}
     *   <li>{@link User#setLastName(String)}
     *   <li>{@link User#setPassword(String)}
     *   <li>{@link User#setRoles(Collection)}
     *   <li>{@link User#getEmail()}
     *   <li>{@link User#getFirstName()}
     *   <li>{@link User#getId()}
     *   <li>{@link User#getLastName()}
     *   <li>{@link User#getPassword()}
     *   <li>{@link User#getRoles()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        ArrayList<Role> roleList = new ArrayList<>();
        User actualUser = new User("Jane", "Doe", "jane.doe@example.org", "iloveyou", roleList);
        actualUser.setEmail("jane.doe@example.org");
        actualUser.setFirstName("Jane");
        actualUser.setId(123L);
        actualUser.setLastName("Doe");
        actualUser.setPassword("iloveyou");
        ArrayList<Role> roleList1 = new ArrayList<>();
        actualUser.setRoles(roleList1);
        assertEquals("jane.doe@example.org", actualUser.getEmail());
        assertEquals("Jane", actualUser.getFirstName());
        assertEquals(123L, actualUser.getId().longValue());
        assertEquals("Doe", actualUser.getLastName());
        assertEquals("iloveyou", actualUser.getPassword());
        Collection<Role> roles = actualUser.getRoles();
        assertSame(roleList1, roles);
        assertEquals(roleList, roles);
    }
}

