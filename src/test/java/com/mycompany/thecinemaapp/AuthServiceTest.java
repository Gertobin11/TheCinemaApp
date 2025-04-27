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
        String email = "";
        LocalDateTime createdAt = null;
        Boolean rememberMe = null;
        AuthService instance = new AuthService();
        instance.createSession(email, createdAt, rememberMe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateCredentials method, of class AuthService.
     */
    @Test
    public void testValidateCredentials() {
        System.out.println("validateCredentials");
        RegisteredUser user = null;
        String password = "";
        AuthService instance = new AuthService();
        Boolean expResult = null;
        Boolean result = instance.validateCredentials(user, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserByEmail method, of class AuthService.
     */
    @Test
    public void testGetUserByEmail() {
        System.out.println("getUserByEmail");
        String email = "";
        AuthService instance = new AuthService();
        RegisteredUser expResult = null;
        RegisteredUser result = instance.getUserByEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoggedInStatus method, of class AuthService.
     */
    @Test
    public void testSetLoggedInStatus() {
        System.out.println("setLoggedInStatus");
        String email = "";
        Boolean status = null;
        AuthService instance = new AuthService();
        instance.setLoggedInStatus(email, status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserEmail method, of class AuthService.
     */
    @Test
    public void testGetUserEmail() {
        System.out.println("getUserEmail");
        RegisteredUser user = null;
        String expResult = "";
        String result = AuthService.getUserEmail(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserRole method, of class AuthService.
     */
    @Test
    public void testGetUserRole() {
        System.out.println("getUserRole");
        String email = "";
        AuthService instance = new AuthService();
        UserRole expResult = null;
        UserRole result = instance.getUserRole(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
