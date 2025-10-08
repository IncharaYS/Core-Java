package com.xworkz.instituteapp.exceptions;

public class TraineeNotAddedException extends RuntimeException{
    TraineeNotAddedException(String errorMsg){
        super(errorMsg);
    }
}
