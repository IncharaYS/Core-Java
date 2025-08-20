package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.user.AmazonUser;

public class Amazon {
    AmazonUser amazonUser;

    public boolean createAmazonUser(AmazonUser amazonUser) {

        boolean isAmazonUserCreated = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isConfirmPasswordValid = false;
        boolean isDateOfBirthValid = false;
        boolean isPhoneNoValid = false;
        boolean isAddressValid=false;

        if(amazonUser.getFirstName()!=null){
            isFirstNameValid=true;
        }
        else System.out.println("Entered First Name is Invalid");

        if(amazonUser.getLastName()!=null)isLastNameValid=true;
        else System.out.println("Entered last name is Invalid");

        if(amazonUser.getEmail()!=null)isEmailValid=true;
        else System.out.println("Entered email is Invalid");

        if(amazonUser.getDateOfBirth()!=null)isDateOfBirthValid=true;
        else System.out.println("Entered date of birth is Invalid");

        if(amazonUser.getPhoneNo()!=0.0)isPhoneNoValid=true;
        else System.out.println("Entered phone no is not Valid");

        if(amazonUser.getAddress()!=null)isAddressValid=true;
        else System.out.println("Entered address is not valid");

        if (amazonUser.getPassword()!=null)isPasswordValid=true;
        else System.out.println("Entered password is not valid");

        if(amazonUser.getConfirmPassword()!=null){
            if(amazonUser.getPassword()==amazonUser.getConfirmPassword()){
                isConfirmPasswordValid = true;
            }
            else System.out.println("Entered confirm password do not match entered password");
        }
        else System.out.println("Entered confirm password is not Valid");
        if(isFirstNameValid&&isLastNameValid&&isEmailValid&&isDateOfBirthValid&&isPhoneNoValid&&isPasswordValid&&isConfirmPasswordValid&&isAddressValid){
            isAmazonUserCreated =true;
            this.amazonUser=amazonUser;
        }
        return isAmazonUserCreated;
    }
    public void getUserDetails(){
        System.out.println("First name is:"+this.amazonUser.getFirstName());
        System.out.println("Last name is:"+this.amazonUser.getLastName());
        System.out.println("Email address is:"+this.amazonUser.getEmail());
        System.out.println("Phone no is:"+this.amazonUser.getPhoneNo());
        System.out.println("Date of birth is:"+this.amazonUser.getDateOfBirth());
        System.out.println("Address is:"+this.amazonUser.getAddress());
        System.out.println("Password is:"+this.amazonUser.getPassword());
        System.out.println("Confirm password is:"+this.amazonUser.getConfirmPassword());
    }

}
