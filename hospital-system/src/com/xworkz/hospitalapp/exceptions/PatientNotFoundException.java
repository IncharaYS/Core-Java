package com.xworkz.hospitalapp.exceptions;

public class PatientNotFoundException extends RuntimeException{
    PatientNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
