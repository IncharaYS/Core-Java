package com.xworkz.libraryapp.library;

import java.sql.SQLOutput;

public class Book {
    int bookId;
    String name;
    String author;
    double price;
    String genre;

    Book(){

    }

    Book(int bookId,String name,String author,double price,String genre){
        this.bookId=bookId;
        this.name=name;
        this.author=author;
        this.price=price;
        this.genre=genre;
    }

    public void getBookInfo(){
        System.out.println("Book Id is: "+bookId);
        System.out.println("Book name is: "+name);
        System.out.println("Book author is: "+author);
        System.out.println("Book price is: "+price);
        System.out.println("Book genre is: "+genre);
    }

}
