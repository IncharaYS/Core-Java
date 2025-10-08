package com.xworkz.libraryapp.book;

import com.xworkz.libraryapp.constants.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {
    private int bookId;
    private String name;
    private String bookAuthor;
    private String publisher;
    private double price;
    private Genre genre;

    @Override
    public String toString(){
        return "Book-(bookId="+this.bookId+
                " , name="+this.name+
                " , bookAuthor="+this.bookAuthor+
                " , publisher="+this.publisher+
                " , price="+this.price+
                " , genre="+this.genre+
                ")";
    }

    @Override
    public boolean equals(Object o) {
       if(o instanceof Book){
           Book book=(Book) o;
           if(this.bookId==book.bookId && this.name.equals(book.name) && this.bookAuthor.equals(book.bookAuthor) && this.publisher.equals(book.publisher)
           && this.price==book.price && this.genre.equals(book.genre)){
               return true;
           }
       }
       return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, name, bookAuthor, publisher, price, genre);
    }
}
