package com.xworkz.shoppingmallapp.exception;

public class ShopNotFoundException extends Exception{
    public ShopNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
