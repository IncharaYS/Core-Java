package com.xworkz.policestationapp.exceptions;

public class NameNotFoundException extends RuntimeException{
    NameNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
