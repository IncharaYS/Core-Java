package com.xworkz.passportapp;

import com.xworkz.passportapp.passportseva.PassportSeva;
import com.xworkz.passportapp.user.PassportUser;

public class PassportRunner {
    public static void main(String[] args) {

        System.out.println("main started");
        boolean isUserCreated=false;

        PassportUser passportUser = new PassportUser();
        passportUser.setCpvLocation("PO");
        passportUser.setDcdrLocation("Banglore");
        passportUser.setGivenName("Inchara");
        passportUser.setSurName("Y S");
        passportUser.setDob("21/10/2003");
        passportUser.setEmail("incharays07@gmail.com");
        passportUser.setIsEmailLoginSame(true);
        passportUser.setLoginId("incharays07@gmail.com");
        passportUser.setPwd("Inchara123");
        passportUser.setHintQuestion("Birth place");
        passportUser.setConformPwd("Inchara123");
        passportUser.setHintAnswer("Shivamogga");
        passportUser.setCaptcha("KFUG245");

        PassportSeva passportSeva = new PassportSeva();
        isUserCreated=passportSeva.createPassportUser(passportUser);
        if(isUserCreated)passportSeva.getUserDetails();
        else System.out.println("User is not created");

        System.out.println("main ended");
    }
}
