package com.xworkz.libraryapp.impl;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.constants.Genre;
import com.xworkz.libraryapp.library.LibraryRules;
import com.xworkz.libraryapp.validator.BookValidator;

import java.util.Objects;

public class LibraryImpl implements LibraryRules {

    public LibraryImpl(int size){
        this.books=new Book[size];
    }

    public Book[] books;
    public int index;


    @Override
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

    @Override
    public void updateNameById(int id,String name){
        boolean isUpdated=false;
        for(Book book:books){
            if(book.getBookId()==id){
                isUpdated=true;
                book.setName(name);
                System.out.println("Book with id "+id+" name updated to "+book.getName());
            }
        }
        if(!isUpdated) System.out.println(("Book with given id "+id+ " not found"));
    }

    @Override
    public boolean updateAuthorById(int existingId,String updatedAuthor){
        boolean isAuthorUpdated=false;
        for(Book book:this.books){
            if(book.getBookId()==existingId){
                book.setBookAuthor(updatedAuthor);
                isAuthorUpdated=true;
                System.out.println("Author of book "+book.getBookId()+" updated to:"+book.getBookAuthor());
            }
            if(!isAuthorUpdated) System.out.println("Book Id "+existingId+" does not exist");
        }

        return isAuthorUpdated;
    }

    @Override
    public boolean updatePublisherById(int existingId,String updatedPublisher){
        boolean isPublisherUpdated=false;
        for(Book book:this.books){
            if(book.getBookId()==existingId){
                book.setPublisher(updatedPublisher);
                isPublisherUpdated=true;
                System.out.println("Publisher of book "+book.getBookId()+" updated to:"+book.getPublisher());
            }
            if(!isPublisherUpdated) System.out.println("Book Id "+existingId+" does not exist");
        }

        return isPublisherUpdated;
    }

    @Override
    public boolean updatePriceById(int existingId,double updatedPrice){
        boolean isPriceUpdated=false;
        for(Book book:this.books){
            if(book.getBookId()==existingId){
                book.setPrice(updatedPrice);
                isPriceUpdated=true;
                System.out.println("Price of book "+book.getBookId()+" updated to:"+book.getPrice());
            }
            if(!isPriceUpdated) System.out.println("Book Id "+existingId+" does not exist");
        }

        return isPriceUpdated;
    }

    @Override
    public boolean updateGenreById(int existingId,Genre updatedGenre){
        boolean isGenreUpdated=false;
        for(Book book:this.books){
            if(book.getBookId()==existingId){
                book.setGenre(updatedGenre);
                isGenreUpdated=true;
                System.out.println("Genre of book "+book.getBookId()+" updated to:"+book.getGenre());
            }
            if(!isGenreUpdated) System.out.println("Book Id "+existingId+" does not exist");
        }

        return isGenreUpdated;
    }

    @Override
    public String getNameById(int existingBookId){
        boolean isIdFound=false;
        for(Book book:books){
            if(book.getBookId()==existingBookId){
                isIdFound=true;
                return book.getName();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    @Override
    public String getAuthorById(int existingBookId){
        boolean isIdFound=false;
        for(Book book:books){
            if(book!=null&&book.getBookId()==existingBookId){
                isIdFound=true;
                return book.getBookAuthor();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    @Override
    public String getPublisherById(int existingBookId){
        boolean isIdFound=false;
        for(Book book:books){
            if(book!=null&&book.getBookId()==existingBookId){
                isIdFound=true;
                return book.getPublisher();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    @Override
    public double getPriceById(int existingBookId){
        boolean isIdFound=false;
        for(Book book:books){
            if(book!=null&&book.getBookId()==existingBookId){
                isIdFound=true;
                return book.getPrice();
            }
        }
        System.out.println("Id entered is not found");
        return 0;
    }

    @Override
    public Genre getGenreById(int existingBookId){
        boolean isIdFound=false;
        for(Book book:books){
            if(book!=null&&book.getBookId()==existingBookId){
                isIdFound=true;
                return book.getGenre();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    @Override
    public Genre getGenreByName(String existingName){
        boolean isIdFound=false;
        for(Book book:books){
            if(book!=null&&book.getName().equals(existingName)){
                isIdFound=true;
                return book.getGenre();
            }
        }
        System.out.println("Name not found");
        return null;
    }

    @Override
    public void deleteBookByName(String name){
        boolean isDeleted=false;
        for(int i=0;i< books.length;i++){
            if(Objects.equals(books[i].getName(), name) &&books[i]!=null){
                for (int j=i;j<books.length-1;j++) {
                    books[j]=books[j+1];
                }
                books[books.length - 1] = null;
                System.out.println("Book with name "+name+" is deleted \n");
                isDeleted=true;
                break;
            }
        }
        if(!isDeleted) System.out.println("No book with namde "+name+" is found");
    }

    @Override
    public void deleteBookById(int id){
        boolean isDeleted=false;
        for(int i=0;i< books.length;i++){
            if(books[i].getBookId()==id&&books[i]!=null){
                for (int j=i;j<books.length-1;j++) {
                    books[j]=books[j+1];
                }
                books[books.length - 1] = null;
                System.out.println("Book with id "+id+" is deleted \n");
                isDeleted=true;
                break;
            }
        }
        if(!isDeleted) System.out.println("No book with id "+id+" is found");
    }

    @Override
    public Book getBookById(int existingId){
        Book bookc=null;
        for(Book book:books){
            if(book.getBookId()==existingId){
                bookc=book;
                System.out.println("Book details are:");
                getBookDetails(book);
            }
        }
        return bookc;
    }

    @Override
    public void getBookDetails(Book book){
        if (book != null) {
            System.out.println("Book Id is:" + book.getBookId());
            System.out.println("Book name is:" + book.getName());
            System.out.println("Book author is:" + book.getBookAuthor());
            System.out.println("Book publisher is:" + book.getPublisher());
            System.out.println("Book genre is:" + book.getGenre());
            System.out.println("Book price is:" + book.getPrice());
            System.out.println("--------------------------------------------------");
        } else {
            System.out.println("No book found");
            System.out.println("--------------------------------------------------");
        }
    }

    @Override
    public void getBookInfo() {
        System.out.println("Book details are:");
        for (Book book : books) {
            if (book != null) {
                System.out.println("Book Id is:" + book.getBookId());
                System.out.println("Book name is:" + book.getName());
                System.out.println("Book author is:" + book.getBookAuthor());
                System.out.println("Book publisher is:" + book.getPublisher());
                System.out.println("Book genre is:" + book.getGenre());
                System.out.println("Book price is:" + book.getPrice());
                System.out.println("--------------------------------------------------");
            } else {
                System.out.println("No book found");
                System.out.println("--------------------------------------------------");
            }
        }
    }
}
