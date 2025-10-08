package com.xworkz.shoppingmallapp.exception;

public class NameNotFoundException extends RuntimeException{
    public NameNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
