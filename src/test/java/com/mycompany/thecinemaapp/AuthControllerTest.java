/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.thecinemaapp;

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
public class AuthControllerTest {
    
    public AuthControllerTest() {
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
     * Test of login method, of class AuthController.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        
        String email = "test@test.com";
        UserRole userRole = UserRole.USER;
        String password = "test password";
        AuthController authController = new AuthController();
        authController.registerUser(email, password, userRole);

        Boolean rememberMe = true;
        Boolean result = authController.login(email, password, rememberMe);
        assertTrue(result);
        
       result = authController.login(email, "Bad password", rememberMe);
       assertFalse(result);
        
    }

    /**
     * Test of validateLogin method, of class AuthController.
     */
    @Test
    public void testValidateLogin() {
        System.out.println("validateLogin");
        String email = "bad email";
        String password = "good password";
        AuthController authController = new AuthController();
        Boolean expResult = false;
        Boolean result = authController.validateLogin(email, password);
        assertEquals(expResult, result);
        
        email = "test@test.com";
        password = "f";
        expResult = false;
        result = authController.validateLogin(email, password);
        assertEquals(expResult, result);

        
        email = "test@test.com";
        password = "this is a good password";
        expResult = true;
        result = authController.validateLogin(email, password);
        assertEquals(expResult, result);
    }

    /**
     * Test of registerUser method, of class AuthController.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String email = "test@test.com";
        String password = "test password";
        UserRole role = UserRole.USER;
        AuthController authController = new AuthController();
        Boolean expResult = true;
        Boolean result = authController.registerUser(email, password, role);
        assertEquals(expResult, result);
    }
    
}
