package com.xworkz.policestationapp.exceptions;

public class IdNotFoundException extends RuntimeException{
    IdNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
