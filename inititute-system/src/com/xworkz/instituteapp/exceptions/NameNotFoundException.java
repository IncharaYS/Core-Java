package com.xworkz.instituteapp.exceptions;

public class NameNotFoundException extends RuntimeException{
    NameNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
