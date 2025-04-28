/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thecinemaapp;
import java.util.*;

/**
 *
 * @author Ger Tobin
 */

public class RegisteredUser extends User {
    final private String userID;
    private Boolean isLoggedIn;
    private UserRole userRole;
    private LoginCredentials loginCredentials;
    private Session session;
    
    public RegisteredUser(String email, UserRole userRole, LoginCredentials loginCredentials) {
        super(email);
        this.userID = UUID.randomUUID().toString();
        this.isLoggedIn = false;
        this.userRole = userRole;
        this.loginCredentials = loginCredentials;
    }
    
     public void setIsLoggedIn(Boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }
    
    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
    
    public void setSession(Session session) {
        this.session = session;
    }
    
    public void setLoginCredentials(LoginCredentials loginCredentials) {
        this.loginCredentials = loginCredentials;
    }
    
    
    @Override
    public Map<String, Object> getUserDetails() {
        Map<String, Object> userDetails = super.getUserDetails();
        userDetails.put("userID", this.userID);
        userDetails.put("isLoggedIn", this.isLoggedIn);
        userDetails.put("userRole", this.userRole);
        userDetails.put("loginCredentials", this.loginCredentials.getCredentials());
        if (session != null) {
            userDetails.put("session", this.session.getSessionInfo());
        }
        return userDetails;
    }
    
}
