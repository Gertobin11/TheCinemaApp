/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.thecinemaapp;

import java.util.*;
import java.time.*;
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
public class SessionTest {
    
    public SessionTest() {
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
     * Test of getSessionInfo method, of class Session.
     */
    @Test
    public void testGetSessionInfo() {
        System.out.println("getSessionInfo");
        LocalDateTime expectedExpiry = LocalDateTime.of(2025, 04, 28, 10, 00);
        Session session = new Session(expectedExpiry);
       
        assertEquals(3, session.getSessionInfo().size());
        
        assertEquals(expectedExpiry, session.getSessionInfo().get("expiresAt"));
        assertTrue(session.getSessionInfo().get("createdAt") instanceof LocalDateTime);
        assertTrue(session.getSessionInfo().get("sessionID") instanceof String);
        String sessionID = (String) session.getSessionInfo().get("sessionID");
        assertTrue(sessionID.length() == 36);
    }
    
}
