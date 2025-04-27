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
class Password extends LoginCredentials {
    private final String password;

    public Password(String credentialID, String password) {
        super(credentialID);
        this.password = password;
    }

    @Override
    public Map<String, Object> getCredentials() {
        Map<String, Object> credentialMap = new HashMap();
        credentialMap.put("password", this.password);
        credentialMap.put("credentialID", this.getCredentialID());
        return credentialMap;
    }
}
