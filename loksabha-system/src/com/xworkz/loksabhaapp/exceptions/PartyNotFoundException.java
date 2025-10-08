package com.xworkz.loksabhaapp.exceptions;

public class PartyNotFoundException extends RuntimeException{
    PartyNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
