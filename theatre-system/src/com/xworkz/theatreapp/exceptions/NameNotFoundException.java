package com.xworkz.theatreapp.exceptions;

public class NameNotFoundException extends RuntimeException{
    NameNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
