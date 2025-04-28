/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.thecinemaapp;

import java.util.HashMap;
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
public class LoginCredentialsTest {
    
    public LoginCredentialsTest() {
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
     * Test of getCredentialID method, of class LoginCredentials.
     */
    @Test
    public void testGetCredentialID() {
        System.out.println("getCredentialID");
        LoginCredentials loginCredentials = new LoginCredentials("test credentials");
        String expResult = "test credentials";
        String result = loginCredentials.getCredentialID();
        assertEquals(expResult, result);

    }

    /**
     * Test of getCredentials method, of class LoginCredentials.
     */
    @Test
    public void testGetCredentials() {
        System.out.println("getCredentials");
        LoginCredentials loginCredentials = new LoginCredentials("test credentials");
        Map<String, Object> expResult = new HashMap<>();
        expResult.put("credentialID", "test credentials");
        
        Map<String, Object> result = loginCredentials.getCredentials();
        assertEquals(expResult, result);
    }
    
}
