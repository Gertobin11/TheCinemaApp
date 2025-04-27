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
public class User {
    private final String email;
    
    public User(String email) {
        this.email = email;
    }
    
    public Map<String, Object> getUserDetails() {
        Map<String, Object> userDetails = new HashMap<>();
        userDetails.put("email", this.email);
        return userDetails;
    }
}
