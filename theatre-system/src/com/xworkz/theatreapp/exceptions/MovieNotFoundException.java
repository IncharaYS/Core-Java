package com.xworkz.theatreapp.exceptions;

public class MovieNotFoundException extends RuntimeException{
    MovieNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
