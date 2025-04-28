/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thecinemaapp;

import java.util.Scanner;

/**
 *
 * @author gerto
 */
public class TheCinemaApp {

    public static void main(String[] args) {
        String email = "test@test.com";
        String password = "test password";
        Boolean authenticated = false;
        Boolean rememberMe = false;
        
        Scanner keyboard = new Scanner(System.in);
        
        AuthController authController = new AuthController();
        authController.registerUser(email, password, UserRole.USER);
        
        System.out.println("Welcome to The Cinema App\n");
        System.out.println("Welcome to the login screen");
        System.out.println("Please use these login details to login successfully yo the app\n");
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("\n ############\n");
        
        while (!authenticated) {
            System.out.println("Please enter your email");
            String enteredEmail = keyboard.next();
            
            System.out.println("Please enter your password: ");
            String enteredPassword = keyboard.next();
            
            System.out.println("Do you want a long term login? Enter y else n: ");
            String rememberMeInput = keyboard.next();
            if (rememberMeInput.equalsIgnoreCase("y")) {
                rememberMe = true;
            }
            
            
            if (authController.validateLogin(enteredEmail, enteredPassword)) {
                authController.login(enteredEmail, enteredPassword, rememberMe);
            }
            
            
        }
        
    }
}
