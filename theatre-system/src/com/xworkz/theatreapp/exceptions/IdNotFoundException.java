package com.xworkz.theatreapp.exceptions;

public class IdNotFoundException extends RuntimeException{
    IdNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
