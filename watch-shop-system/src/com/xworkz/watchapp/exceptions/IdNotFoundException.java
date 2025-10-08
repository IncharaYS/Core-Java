package com.xworkz.watchapp.exceptions;

public class IdNotFoundException extends RuntimeException{
    IdNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
