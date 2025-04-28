/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.thecinemaapp;

import java.time.LocalDateTime;
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
public class AuthServiceTest {
    
    public AuthServiceTest() {
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
     * Test of createSession method, of class AuthService.
     */
    @Test
    public void testCreateSession() {
        System.out.println("createSession");
        String email = "test@test.com";
        UserRole userRole = UserRole.USER;
        String password = "test password";
        AuthService authService = new AuthService();
        authService.createRegisteredUser(email, userRole, password);
        
        RegisteredUser user = authService.getUserByEmail(email);
        
        assertNull(user.getUserDetails().get("session"));
        
        
        LocalDateTime createdAt = LocalDateTime.now();
        Boolean rememberMe = false;
        authService.createSession(email, createdAt, rememberMe);
        
        assertNotNull(user.getUserDetails().get("session"));
        
        
    }

    /**
     * Test of validateCredentials method, of class AuthService.
     */
    @Test
    public void testValidateCredentials() {
        System.out.println("validateCredentials");
        String email = "test@test.com";
        UserRole userRole = UserRole.USER;
        String password = "test password";
        AuthService authService = new AuthService();
        authService.createRegisteredUser(email, userRole, password);
        
        RegisteredUser user = authService.getUserByEmail(email);
        Boolean result = authService.validateCredentials(user, password);
        assertTrue(result);
        
        result = authService.validateCredentials(user, "bad password");
        assertFalse(result);
    }

    /**
     * Test of getUserByEmail method, of class AuthService.
     */
    @Test
    public void testGetUserByEmail() {
        System.out.println("getUserByEmail");
        String email = "test@test.com";
        UserRole userRole = UserRole.USER;
        String password = "test password";
        AuthService authService = new AuthService();
        authService.createRegisteredUser(email, userRole, password);
        
        RegisteredUser user = authService.getUserByEmail(email);
        
        assertNotNull(user);
        assertTrue(user instanceof RegisteredUser);
        
        assertEquals(user.getUserDetails().get("email"), email);
        
        user = authService.getUserByEmail("bad EMAIL");
        
        assertNull(user);
    }

    /**
     * Test of setLoggedInStatus method, of class AuthService.
     */
    @Test
    public void testSetLoggedInStatus() {
        System.out.println("setLoggedInStatus");
        String email = "test@test.com";
        UserRole userRole = UserRole.USER;
        String password = "test password";
        AuthService authService = new AuthService();
        authService.createRegisteredUser(email, userRole, password);
        Boolean status = false;
        
        RegisteredUser user = authService.getUserByEmail(email);
        authService.setLoggedInStatus(email, status);
        
        assertEquals(user.getUserDetails().get("isLoggedIn"), false);
        
        
        status = true;
        authService.setLoggedInStatus(email, status);
        
         assertEquals(user.getUserDetails().get("isLoggedIn"), true);
    }

    /**
     * Test of getUserEmail method, of class AuthService.
     */
    @Test
    public void testGetUserEmail() {
        System.out.println("getUserEmail");
         String email = "test@test.com";
        UserRole userRole = UserRole.USER;
        String password = "test password";
        AuthService authService = new AuthService();
        authService.createRegisteredUser(email, userRole, password);
        
        RegisteredUser user = authService.getUserByEmail(email);
        
        String expResult = "test@test.com";
        String result = AuthService.getUserEmail(user);
        assertEquals(expResult, result);
    }

    /**
     * Test of getUserRole method, of class AuthService.
     */
    @Test
    public void testGetUserRole() {
        System.out.println("getUserRole");
         String email = "test@test.com";
        UserRole userRole = UserRole.USER;
        String password = "test password";
        AuthService authService = new AuthService();
        authService.createRegisteredUser(email, userRole, password);

        UserRole expResult = UserRole.USER;
        UserRole result = authService.getUserRole(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of createRegisteredUser method, of class AuthService.
     */
    @Test
    public void testCreateRegisteredUser() {
        System.out.println("createRegisteredUser");
        String email = "test@test.com";
        UserRole userRole = UserRole.USER;
        String password = "test password";
        AuthService authService = new AuthService();
        authService.createRegisteredUser(email, userRole, password);
        
        RegisteredUser user = authService.getUserByEmail(email);
        
        assertNotNull(user);
        
        assertEquals(user.getUserDetails().get("email"), "test@test.com");
    }
    
}
