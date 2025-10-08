package com.xworkz.watchapp.exceptions;

import com.xworkz.watchapp.impl.WatchShopImpl;

public class WatchNotAddedException extends RuntimeException{
    WatchNotAddedException(String errorMsg){
        super(errorMsg);
    }
}
