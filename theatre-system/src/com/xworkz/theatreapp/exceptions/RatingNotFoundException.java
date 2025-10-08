package com.xworkz.theatreapp.exceptions;

public class RatingNotFoundException extends RuntimeException{
    RatingNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
