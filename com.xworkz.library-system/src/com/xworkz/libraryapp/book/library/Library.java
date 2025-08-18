package com.xworkz.libraryapp.book.library;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.validator.BookValidator;

public class Library {
    Book book;
    public boolean addBook(Book book){
        boolean isBookAdded=false;
        boolean isBookInfoValid=false;

        BookValidator bookValidator=new BookValidator();
        if(bookValidator.validateBook(book)){
            isBookInfoValid=true;
            this.book=book;
            isBookAdded=true;
        }
        return isBookAdded;
    }
    public void getBookInfo(){
        System.out.println("Book Id is:"+this.book.getBookId());
        System.out.println("Book name is:"+this.book.getName());
        System.out.println("Book author is:"+this.book.getBookAuthor());
        System.out.println("Book publisher is:"+this.book.getPublisher());
        System.out.println("Book genre is:"+this.book.getGenre());
        System.out.println("Book price is:"+this.book.getPrice());
    }
}
