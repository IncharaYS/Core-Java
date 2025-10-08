package com.xworkz.shoppingmallapp.exception;
//unchecked-extends RuntimeException
//checked-extends Exception

public class ShopNotAddedException extends RuntimeException{

    public ShopNotAddedException(String errorMessage){
        super(errorMessage);
    }
}
