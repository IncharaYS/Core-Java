package com.xworkz.loksabhaapp.exceptions;

public class PoliticianNotFoundException extends RuntimeException{
    PoliticianNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
