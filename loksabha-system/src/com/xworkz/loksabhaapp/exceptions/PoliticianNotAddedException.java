package com.xworkz.loksabhaapp.exceptions;

public class PoliticianNotAddedException extends RuntimeException{
    PoliticianNotAddedException(String errorMsg){
        super(errorMsg);
    }
}
