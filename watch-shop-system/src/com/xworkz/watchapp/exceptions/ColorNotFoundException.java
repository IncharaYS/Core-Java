package com.xworkz.watchapp.exceptions;

public class ColorNotFoundException extends RuntimeException{
    ColorNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
