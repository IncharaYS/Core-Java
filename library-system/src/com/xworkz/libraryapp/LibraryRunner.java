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

       /* Book book1=new Book();
        book1.setBookId(1);
        book1.setBookAuthor("Ana Hung");
        book1.setName("Twisted Love");
        book1.setPublisher("Piatkus");
        book1.setGenre("Fantasy");
        book1.setPrice(350.00);

        LibraryImpl library=new LibraryImpl();
        library.addBook(book1);

        Book book2=new Book(2,"Atomic habits","James Clear","james publications",250.00,"Self improvement");
        library.addBook(book2);

        Book book3=new Book(3,"The Alchemist","Paulo Coelho","HarperOne",300.00,"Fiction");
        library.addBook(book3);

        Book book4=new Book(4,"Rich Dad Poor Dad","Robert Kiyosaki","Plata Publishing",280.00,"Personal Finance");
        library.addBook(book4);

        Book book5=new Book(5,"The Power of Now","Eckhart Tolle","New World LibraryImpl",320.00,"Spirituality");
        library.addBook(book5);

        Book book6=new Book(6,"Think and Grow Rich","Napoleon Hill","The Ralston Society",270.00,"Motivation");
        library.addBook(book6);

        Book book7=new Book(7,"Deep Work","Cal Newport","Grand Central Publishing",350.00,"Productivity");
        library.addBook(book7);

        Book book8=new Book(8,"Sapiens","Yuval Noah Harari","Harper",400.00,"History");
        library.addBook(book8);

        Book book9=new Book(9,"Educated","Tara Westover","Random House",360.00,"Memoir");
        library.addBook(book9);

        Book book10=new Book(10,"Ikigai","Héctor García","Penguin",290.00,"Self improvement");
        library.addBook(book10);

        Book book11=new Book(11,"Zero to One","Peter Thiel","Crown Business",310.00,"Business");
        library.addBook(book11);

        Book book12=new Book(12,"The 5 AM Club","Robin Sharma","HarperCollins",330.00,"Motivation");
        library.addBook(book12);

        Book book13=new Book(13,"The Subtle Art of Not Giving a F*ck","Mark Manson","HarperOne",340.00,"Self improvement");
        library.addBook(book13);

        Book book14=new Book(14,"Start with Why","Simon Sinek","Portfolio",295.00,"Leadership");
        library.addBook(book14);


        library.getBookInfo();

       /* if(library.addBook(book)){
            library.getBookInfo();
        }
        else System.out.println("Book is not added");*/
    }
}
