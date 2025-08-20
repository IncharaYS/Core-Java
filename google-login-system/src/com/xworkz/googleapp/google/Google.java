package com.xworkz.googleapp.google;

import com.xworkz.googleapp.user.GoogleUser;

public class Google {
    GoogleUser googleUser;

    public boolean createGoogleUser(GoogleUser googleUser) {

        boolean isGoogleUserCreated = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isConfirmPasswordValid = false;
        boolean isGenderValid = false;
        boolean isDateOfBirthValid = false;
        boolean isPhoneNoValid = false;
        boolean isUserNameValid = false;
        boolean isAddressValid=false;

        if(googleUser.getFirstName()!=null){
            isFirstNameValid=true;
        }
        else System.out.println("Entered First Name is Invalid");

        if(googleUser.getLastName()!=null)isLastNameValid=true;
        else System.out.println("Entered last name is Invalid");

        if (googleUser.getUserName()!=null)isUserNameValid=true;
        else System.out.println("Entered User name is invalid");

        if(googleUser.getEmail()!=null)isEmailValid=true;
        else System.out.println("Entered email is Invalid");

        if(googleUser.getGender()!=' ')isGenderValid=true;
        else System.out.println("Entered value for gender is Invalid");

        if(googleUser.getDateOfBirth()!=null)isDateOfBirthValid=true;
        else System.out.println("Entered date of birth is Invalid");

        if(googleUser.getPhoneNo()!=0.0)isPhoneNoValid=true;
        else System.out.println("Entered phone no is not Valid");

        if(googleUser.getAddress()!=null)isAddressValid=true;
        else System.out.println("Entered address is not valid");

        if (googleUser.getPassword()!=null)isPasswordValid=true;
        else System.out.println("Entered password is not valid");

        if(googleUser.getConfirmPassword()!=null){
            if(googleUser.getPassword()==googleUser.getConfirmPassword()){
                isConfirmPasswordValid = true;
            }
            else System.out.println("Entered confirm password do not match entered password");
        }
        else System.out.println("Entered confirm password is not Valid");
    if(isFirstNameValid&&isLastNameValid&&isEmailValid&&isUserNameValid&&isDateOfBirthValid&&isGenderValid&&isPhoneNoValid&&isPasswordValid&&isConfirmPasswordValid&&isAddressValid){
        isGoogleUserCreated=true;
        this.googleUser=googleUser;
    }
    return isGoogleUserCreated;
    }

    public void getUserDetails(){
        System.out.println("First name is:"+this.googleUser.getFirstName());
        System.out.println("Last name is:"+this.googleUser.getLastName());
        System.out.println("User name is:"+this.googleUser.getUserName());
        System.out.println("Email address is:"+this.googleUser.getEmail());
        System.out.println("Phone no is:"+this.googleUser.getPhoneNo());
        System.out.println("Gender is:"+this.googleUser.getGender());
        System.out.println("Date of birth is:"+this.googleUser.getDateOfBirth());
        System.out.println("Address is:"+this.googleUser.getAddress());
        System.out.println("Password is:"+this.googleUser.getPassword());
        System.out.println("Confirm password is:"+this.googleUser.getConfirmPassword());
    }
}
