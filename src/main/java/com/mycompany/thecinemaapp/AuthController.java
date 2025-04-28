/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thecinemaapp;

import java.time.LocalDateTime;

/**
 *
 * @author Ger Tobin
 */
public class AuthController {
    
    private AuthService authService = new AuthService();
    
    public AuthController() {
        
    }
    
    public Boolean registerUser(String email, String password, UserRole role) {
        authService.createRegisteredUser(email, role, password);
        return true;
    }
    
    public Boolean login(String email, String password, Boolean rememeberMe) {
        RegisteredUser user = authService.getUserByEmail(email);
        if (authService.validateCredentials(user, password)){
            authService.createSession(email, LocalDateTime.MAX, rememeberMe);
            authService.setLoggedInStatus(email, rememeberMe);
            UserRole userRole = authService.getUserRole(email);
            System.out.println("You have successfully logged in");
            return true;
        }
        else {
            System.out.println("Login unsuccessful");
            return false;
        }
    }
    
    public Boolean validateLogin(String email, String password) {
        if (email.length() < 5) {
            System.out.println("Email must be at least 5 characters long");
            return false;
        }
        if(!email.contains("@")) {
            System.out.println("Email must contain an @ character");
            return false;
        }
        
        // just a basic check
        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters long");
            return false;
        }
        
        return true;
    }
}
