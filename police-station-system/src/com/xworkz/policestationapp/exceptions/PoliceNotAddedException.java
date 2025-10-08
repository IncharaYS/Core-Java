package com.xworkz.policestationapp.exceptions;

public class PoliceNotAddedException extends RuntimeException{
    PoliceNotAddedException(String errorMsg){
        super(errorMsg);
    }
}
