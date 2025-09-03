package com.xworkz.libraryapp.validator;

import com.xworkz.libraryapp.book.Book;

public class BookValidator {
    public boolean validateBook(Book book){
        boolean isBookAdded=false;
        boolean isBookIdValid=false;
        boolean isBookNameValid=false;
        boolean isBookAuthorNameValid=false;
        boolean isBookPublisherValid=false;
        boolean isBookPriceValid=false;
        boolean isBookGenreValid=false;

        if (book.getBookId()>0) isBookIdValid=true;
        else System.out.println("Entered book Id is not valid");

        if (book.getName()!=null&&!book.getName().isEmpty()) isBookNameValid=true;
        else System.out.println("Book name is not valid");

        if (book.getBookAuthor()!=null&&!book.getBookAuthor().isEmpty()) isBookAuthorNameValid=true;
        else System.out.println("Entered book author is not valid");

        if (book.getPublisher()!=null&&!book.getPublisher().isEmpty()) isBookPublisherValid=true;
        else System.out.println("Entered publisher name is not valid");

        if (book.getGenre()!=null&&!book.getGenre().isEmpty()) isBookGenreValid=true;
        else System.out.println("Entered book genre is noot valid");

        if (book.getPrice()>0) isBookPriceValid=true;
        else System.out.println("Entered price is not valid");

        if (isBookIdValid&&isBookNameValid&&isBookPublisherValid&&isBookPriceValid&&isBookAuthorNameValid&&isBookGenreValid){
            isBookAdded=true;
        }

        return isBookAdded;
    }
}
