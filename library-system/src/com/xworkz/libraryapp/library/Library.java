package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.validator.BookValidator;

public class Library {
    Book[] books=new Book[14];
    int index;


    public boolean addBook(Book book){
        boolean isBookAdded=false;
        boolean isBookInfoValid=false;

        BookValidator bookValidator=new BookValidator();
        if(bookValidator.validateBook(book)){
            isBookInfoValid=true;
            books[index++]=book;
            isBookAdded=true;
        }
        return isBookAdded;
    }
    public void getBookInfo() {
        for (Book book : books) {
            System.out.println("Book Id is:" +book.getBookId());
            System.out.println("Book name is:" +book.getName());
            System.out.println("Book author is:" +book.getBookAuthor());
            System.out.println("Book publisher is:" +book.getPublisher());
            System.out.println("Book genre is:" +book.getGenre());
            System.out.println("Book price is:" +book.getPrice()+"\n");
        }
    }
}
