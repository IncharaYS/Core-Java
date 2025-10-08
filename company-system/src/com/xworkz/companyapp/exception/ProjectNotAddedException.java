package com.xworkz.companyapp.exception;

public class ProjectNotAddedException extends RuntimeException{
    public ProjectNotAddedException(String errorMessage){
        super(errorMessage);
    }
}
