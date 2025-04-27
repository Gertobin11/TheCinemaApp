/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thecinemaapp;

import java.util.ArrayList;
import java.time.*;

/**
 *
 * @author Ger Tobin
 */
public class AuthService {

    private ArrayList<RegisteredUser> users;

    public AuthService() {
        this.users = new ArrayList();
    }

    public void createSession(String email, LocalDateTime createdAt, Boolean rememberMe) {
        RegisteredUser user = getUserByEmail(email);
          LocalDateTime expiresAt = LocalDateTime.now();
        if (rememberMe) {
            expiresAt = expiresAt.plusMonths(3);
        }
        else {
            expiresAt = expiresAt.plusWeeks(1);
        }
        Session session = new Session(expiresAt);
        user.setSession(session);
 
        user.setSession(session);
    }

    public Boolean validateCredentials(RegisteredUser user, String password) {
        Object loginCredentialObject = user.getUserDetails().get("loginCredentials");
        if (loginCredentialObject instanceof LoginCredentials loginCredentials) {
            Object passwordObject = loginCredentials.getCredentials().get("password");
            if (passwordObject instanceof String savedPassword) {
                if (savedPassword.equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public RegisteredUser getUserByEmail(String email) {
        for (RegisteredUser user : users) {
            String userEmail = getUserEmail(user);
            if (userEmail.equalsIgnoreCase(userEmail)) {
                return user;
            }
        }
        return null;
    }
    
    public void setLoggedInStatus(String email, Boolean status) {
        RegisteredUser user = getUserByEmail(email);
        user.setIsLoggedIn(status);
    }

    static String getUserEmail(RegisteredUser user) {
        Object email = user.getUserDetails().get("email");
        if (email instanceof String string) {
            return string;

        } else {
            return null;
        }

    }
    
    public UserRole getUserRole(String email) {
        RegisteredUser user = getUserByEmail(email);
        Object userRoleObject = user.getUserDetails().get("userRole");
        if (userRoleObject instanceof UserRole userRole) {
            return userRole;
        }
        else return null;
    }
}
