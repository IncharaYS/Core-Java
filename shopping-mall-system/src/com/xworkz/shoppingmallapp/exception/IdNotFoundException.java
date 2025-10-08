package com.xworkz.shoppingmallapp.exception;

public class IdNotFoundException extends RuntimeException{

    public IdNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
