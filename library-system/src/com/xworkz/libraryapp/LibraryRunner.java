package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.constants.Genre;
import com.xworkz.libraryapp.impl.LibraryImpl;

import java.util.Scanner;

public class LibraryRunner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of books to add to the library:");
        int size=sc.nextInt();
        LibraryImpl library=new LibraryImpl(size);
        System.out.println("Number of book details to be entered is:"+ library.books.length);

        for(int i=0;i<size;i++){
            System.out.println("Enter details of book "+(i+1));
            Book book=new Book();
            System.out.print("Enter the book id:");
            book.setBookId(sc.nextInt());sc.nextLine();
            System.out.print("Enter the book name:");
            book.setName(sc.nextLine());
            System.out.print("Enter the book author:");
            book.setBookAuthor(sc.nextLine());
            System.out.print("Enter the book publisher:");
            book.setPublisher(sc.nextLine());
            System.out.print("Enter the book price:");
            book.setPrice(sc.nextDouble());sc.nextLine();
            System.out.print("Enter the book genre:");
            book.setGenre(Genre.valueOf(sc.nextLine().toUpperCase()));
            library.addBook(book);
            System.out.println("---------------------------------------------------------");
        }


        library.getBookInfo();

        System.out.print("Enter Id of book to update price:");
        int id=sc.nextInt();sc.nextLine();
        System.out.print("Enter the updated name:");
        boolean isUpdated=library.updatePriceById(id,sc.nextDouble());
        if(isUpdated) System.out.println("Price updated successfully \n");
        else System.out.println("Failed to update price \n");

//        library.updateAuthorById(1,"James Clear");
//        library.updateGenreById(1,Genre.TRAVEL);
//        library.updatePriceById(1,60000);
//        library.updatePublisherById(1,"Publication house");


        System.out.print("Enter Id to fetch name:");
        System.out.println("Name for given id is:"+library.getNameById(sc.nextInt()));

//        library.getAuthorById(1);
//        library.getBookById(1);
//        library.getGenreById(2);
//        library.getPriceById(2);
//        library.getPublisherById(2);
//        library.getGenreByName("Atomic habits");
//        library.deleteBookByName("Atomic habits");

        System.out.println("Enter id to get book details");
        library.getBookById(sc.nextInt());

        System.out.print("Enter the id of book to delete it's details:");
        library.deleteBookById(sc.nextInt());
        library.getBookInfo();

    }
}
