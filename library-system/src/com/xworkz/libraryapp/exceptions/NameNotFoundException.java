package com.xworkz.libraryapp.exceptions;

public class NameNotFoundException extends RuntimeException{
    NameNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
