package com.xworkz.libraryapp.exceptions;

public class IdNotFoundException extends RuntimeException{
    IdNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
