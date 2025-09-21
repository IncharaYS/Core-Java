package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.constants.Genre;

public interface LibraryRules {
    boolean addBook(Book book);
    void updateNameById(int id,String name);
    boolean updateAuthorById(int existingId,String updatedAuthor);
    boolean updatePublisherById(int existingId,String updatedPublisher);
    boolean updatePriceById(int existingId,double updatedPrice);
    boolean updateGenreById(int existingId, Genre updatedGenre);
    String getNameById(int existingBookId);
    String getAuthorById(int existingBookId);
    String getPublisherById(int existingBookId);
    double getPriceById(int existingBookId);
    Genre getGenreById(int existingBookId);
    Genre getGenreByName(String existingName);
    void deleteBookByName(String name);
    void deleteBookById(int id);
    Book getBookById(int existingId);
    void getBookDetails(Book book);
    void getBookInfo();
}
