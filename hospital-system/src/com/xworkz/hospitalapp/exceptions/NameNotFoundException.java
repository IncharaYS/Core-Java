package com.xworkz.hospitalapp.exceptions;

public class NameNotFoundException extends RuntimeException{
    NameNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
