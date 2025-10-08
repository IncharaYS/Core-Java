package com.xworkz.hospitalapp.exceptions;

public class PatientNotAddedException extends RuntimeException{
    PatientNotAddedException(String errorMsg){
        super(errorMsg);
    }
}
