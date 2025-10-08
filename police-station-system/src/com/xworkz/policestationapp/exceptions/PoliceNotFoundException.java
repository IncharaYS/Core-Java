package com.xworkz.policestationapp.exceptions;

public class PoliceNotFoundException extends RuntimeException{
    PoliceNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
