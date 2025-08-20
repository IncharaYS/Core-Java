package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.user.AmazonUser;

public class AmazonRunner {
    public static void main(String[] args) {
        boolean isUserCreated=false;
        System.out.println("\nmain started\n");
        AmazonUser user1 = new AmazonUser();
        user1.setFirstName("Inchara");
        user1.setLastName("Y S");
        user1.setEmail("incharays07@gmail.com");
        user1.setAddress("Banglore");
        user1.setDateOfBirth("21/10/2003");
        user1.setPassword("Inchara123");
        user1.setConfirmPassword("Inchara123");
        user1.setPhoneNo(8764258790L);

        Amazon amazon1 = new Amazon();
       isUserCreated= amazon1.createAmazonUser(user1);
        if(isUserCreated)amazon1.getUserDetails();
        else System.out.println("User is not created");

        System.out.println("\nmain ended");
    }
    }
