package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.library.Library;

public class LibraryRunner {
    public static void main(String[] args) {
        Book book1=new Book();
        book1.setBookId(1);
        book1.setBookAuthor("Ana Hung");
        book1.setName("Twisted Love");
        book1.setPublisher("Piatkus");
        book1.setGenre("Fantasy");
        book1.setPrice(350.00);

        Library library=new Library();
        library.addBook(book1);

        Book book2=new Book(2,"Atomic habits","James Clear","james publications",250.00,"Self improvement");
        library.addBook(book2);

        Book book3=new Book(3,"The Alchemist","Paulo Coelho","HarperOne",300.00,"Fiction");
        library.addBook(book3);

        Book book4=new Book(4,"Rich Dad Poor Dad","Robert Kiyosaki","Plata Publishing",280.00,"Personal Finance");
        library.addBook(book4);

        Book book5=new Book(5,"The Power of Now","Eckhart Tolle","New World Library",320.00,"Spirituality");
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
