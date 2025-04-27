/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thecinemaapp;

import java.time.*;
import java.util.*;

/**
 *
 * @author Ger Tobin
 */
public class Session {
    private String sessionID;
    private LocalDateTime createdAt;
    private LocalDateTime expiresAt;
    
    public Session(LocalDateTime expires) {
        this.createdAt = LocalDateTime.now();
        this.expiresAt = expires;
        this.sessionID = UUID.randomUUID().toString();
    }

    public Map<String, Object> getSessionInfo() {
        Map<String, Object> sessionInfo = new HashMap<>();
        sessionInfo.put("sessionID", this.sessionID);
        sessionInfo.put("createdAt", this.createdAt);
        sessionInfo.put("expiresAt", this.expiresAt);
        return sessionInfo;
    }
    
}
