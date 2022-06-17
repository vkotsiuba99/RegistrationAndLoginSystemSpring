package com.javaproject.registrationlogin.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RoleTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Role#Role()}
     *   <li>{@link Role#setId(Long)}
     *   <li>{@link Role#setName(String)}
     *   <li>{@link Role#getId()}
     *   <li>{@link Role#getName()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Role actualRole = new Role();
        actualRole.setId(123L);
        actualRole.setName("Name");
        assertEquals(123L, actualRole.getId().longValue());
        assertEquals("Name", actualRole.getName());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Role#Role(String)}
     *   <li>{@link Role#setId(Long)}
     *   <li>{@link Role#setName(String)}
     *   <li>{@link Role#getId()}
     *   <li>{@link Role#getName()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        Role actualRole = new Role("Name");
        actualRole.setId(123L);
        actualRole.setName("Name");
        assertEquals(123L, actualRole.getId().longValue());
        assertEquals("Name", actualRole.getName());
    }
}

