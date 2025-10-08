package com.xworkz.libraryapp.exceptions;

public class BookNotAddedException extends RuntimeException{
    BookNotAddedException(String errorMsg){
        super(errorMsg);
    }
}
