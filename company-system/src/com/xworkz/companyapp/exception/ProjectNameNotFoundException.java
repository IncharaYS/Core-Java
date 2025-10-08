package com.xworkz.companyapp.exception;

public class ProjectNameNotFoundException extends RuntimeException{
    public ProjectNameNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
