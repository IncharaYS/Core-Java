package com.xworkz.hospitalapp.exceptions;

public class IdNotFoundException extends RuntimeException{
    IdNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
