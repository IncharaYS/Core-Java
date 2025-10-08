package com.xworkz.watchapp.exceptions;

import com.xworkz.watchapp.constants.Type;

public class TypeNotFoundException extends RuntimeException{
    TypeNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
