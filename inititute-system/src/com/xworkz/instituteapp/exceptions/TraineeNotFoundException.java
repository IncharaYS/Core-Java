package com.xworkz.instituteapp.exceptions;

public class TraineeNotFoundException extends RuntimeException{
    TraineeNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
