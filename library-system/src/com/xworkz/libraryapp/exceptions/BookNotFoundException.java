package com.xworkz.libraryapp.exceptions;

public class BookNotFoundException extends RuntimeException{
    BookNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
