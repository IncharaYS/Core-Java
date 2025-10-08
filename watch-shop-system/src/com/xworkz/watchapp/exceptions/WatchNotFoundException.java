package com.xworkz.watchapp.exceptions;

public class WatchNotFoundException extends RuntimeException{
    WatchNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
