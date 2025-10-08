package com.xworkz.loksabhaapp.exceptions;

public class IdNotFoundException extends RuntimeException{
    IdNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
