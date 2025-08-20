package com.xworkz.googleapp;

import com.xworkz.googleapp.google.Google;
import com.xworkz.googleapp.user.GoogleUser;
import jdk.nashorn.internal.parser.JSONParser;

public class GoogleRunner {
    public static void main(String[] args) {
        boolean isUserCreated=false;
        System.out.println("\nmain started\n");
        GoogleUser user1=new GoogleUser();
        user1.setFirstName("Inchara");
        user1.setLastName("Y S");
        user1.setEmail("incharays07@gmail.com");
        user1.setGender('F');
        user1.setAddress("Banglore");
        user1.setDateOfBirth("21/10/2003");
        user1.setUserName("Inchara");
        user1.setPassword("Inchara123");
        user1.setConfirmPassword("Inchara123");
        user1.setPhoneNo(8764258790L);

        Google google1=new Google();
        isUserCreated=google1.createGoogleUser(user1);
        if(isUserCreated) google1.getUserDetails();
        else System.out.println("User is not created");

        System.out.println("\nmain ended");

    }
}
