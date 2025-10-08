package com.xworkz.amazonapp.exception;

public class ProductNotFoundException extends Exception{
    ProductNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
