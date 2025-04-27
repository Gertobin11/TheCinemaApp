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
public class LoginCredentials {
    private final String credentialID;

    public LoginCredentials(String credentialID) {
        this.credentialID = credentialID;
    }

    public String getCredentialID() {
        return credentialID;
    }

    public  Map<String, Object> getCredentials() {
        Map<String, Object> credentials = new HashMap<>();
        credentials.put("credentialID", this.credentialID);
        return credentials;
    }
}
