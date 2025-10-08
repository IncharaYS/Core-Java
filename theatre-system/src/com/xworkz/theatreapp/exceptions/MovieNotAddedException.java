package com.xworkz.theatreapp.exceptions;

public class MovieNotAddedException extends RuntimeException{
    MovieNotAddedException(String errorMsg){
        super(errorMsg);
    }
}
