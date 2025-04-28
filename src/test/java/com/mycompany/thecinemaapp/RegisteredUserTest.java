/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.thecinemaapp;

import java.time.LocalDateTime;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gerto
 */
public class RegisteredUserTest {

    public RegisteredUserTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setIsLoggedIn method, of class RegisteredUser.
     */
    @Test
    public void testSetIsLoggedIn() {
        System.out.println("setIsLoggedIn");
        Boolean isLoggedIn = true;
        Password loginCredentials = new Password("test credentials", "testpassword");
        RegisteredUser user = new RegisteredUser("test@test.com", UserRole.USER, loginCredentials);

        user.setIsLoggedIn(isLoggedIn);

        assertTrue((boolean) user.getUserDetails().get("isLoggedIn"));

    }

    /**
     * Test of setUserRole method, of class RegisteredUser.
     */
    @Test
    public void testSetUserRole() {
        System.out.println("setUserRole");
        UserRole userRole = UserRole.MANAGER;
        Password loginCredentials = new Password("test credentials", "testpassword");
        RegisteredUser user = new RegisteredUser("test@test.com", UserRole.USER, loginCredentials);
        user.setUserRole(userRole);

        assertEquals((UserRole) user.getUserDetails().get("userRole"), UserRole.MANAGER);
    }

    /**
     * Test of setSession method, of class RegisteredUser.
     */
    @Test
    public void testSetSession() {
        System.out.println("setSession");
        Password loginCredentials = new Password("test credentials", "testpassword");
        RegisteredUser user = new RegisteredUser("test@test.com", UserRole.USER, loginCredentials);

        LocalDateTime expectedExpiry = LocalDateTime.of(2025, 04, 28, 10, 00);
        Session session = new Session(expectedExpiry);

        user.setSession(session);

        assertNotNull(user.getUserDetails().get("session"));

        Object storedSession = user.getUserDetails().get("session");

        assertEquals(storedSession, session.getSessionInfo());

    }

    /**
     * Test of setLoginCredentials method, of class RegisteredUser.
     */
    @Test
    public void testSetLoginCredentials() {
        System.out.println("setLoginCredentials");
        LoginCredentials loginCredentials = new LoginCredentials("test credentials");
        RegisteredUser user = new RegisteredUser("test@test.com", UserRole.USER, loginCredentials);

        Password newLoginCredentials = new Password("test password", "test password");

        user.setLoginCredentials(newLoginCredentials);

        Object storedLoginCredentials = user.getUserDetails().get("loginCredentials");

        assertEquals(storedLoginCredentials, newLoginCredentials.getCredentials());
    }

    /**
     * Test of getUserDetails method, of class RegisteredUser.
     */
    @Test
    public void testGetUserDetails() {
        System.out.println("getUserDetails");
        Password loginCredentials = new Password("test credentials", "testpassword");
        RegisteredUser user = new RegisteredUser("test@test.com", UserRole.USER, loginCredentials);

        // testing without a session
        
        assertEquals("test@test.com", user.getUserDetails().get("email"));
        assertEquals(UserRole.USER, user.getUserDetails().get("userRole"));
        assertEquals(loginCredentials.getCredentials(), user.getUserDetails().get("loginCredentials"));
        assertEquals(user.getUserDetails().get("session"), null);
        
        // testing with a session
        
        LocalDateTime expectedExpiry = LocalDateTime.of(2025, 04, 28, 10, 00);
        Session session = new Session(expectedExpiry);

        user.setSession(session);
        
        assertEquals("test@test.com", user.getUserDetails().get("email"));
        assertEquals(UserRole.USER, user.getUserDetails().get("userRole"));
        assertEquals(loginCredentials.getCredentials(), user.getUserDetails().get("loginCredentials"));
        assertEquals(user.getUserDetails().get("session"), session.getSessionInfo());
    }

}
