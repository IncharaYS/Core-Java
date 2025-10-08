package com.xworkz.amazonapp.exception;

public class BrandNotFoundException extends Exception{
    public BrandNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
