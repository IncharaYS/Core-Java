package com.xworkz.companyapp.exception;

public class IdNotFoundException extends RuntimeException{
    public IdNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
