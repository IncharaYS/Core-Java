package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.book.library.Library;

public class LibraryRunner {
    public static void main(String[] args) {
        Book book=new Book();
        book.setBookId(1);
        book.setBookAuthor("Ana Hung");
        book.setName("Twisted Live");
        book.setPublisher("Piatkus");
        book.setGenre("Fantasy");
        book.setPrice(350.00);

        Library library=new Library();
        if(library.addBook(book)){
            library.getBookInfo();
        }
        else System.out.println("Book is not added");
    }
}
