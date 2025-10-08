package com.xworkz.amazonapp.exception;

public class ProductNotAddedException extends Exception{
    public ProductNotAddedException(String errorMessage){
        super(errorMessage);
    }
}
