package com.xworkz.libraryapp.library;

public class Section {
    int sectionId;
    String sectionName;
    int noOfBooks;
    String location;
    Book book;

    Section(){

    }
    Section(int sectionId,String sectionName,int noOfBooks,String location,Book book){
       this.sectionId=sectionId;
       this.sectionName=sectionName;
       this.noOfBooks=noOfBooks;
       this.location=location;
       this.book=book;
    }
    public void getSectionInfo(){
        System.out.println("Section Id is: "+sectionId);
        System.out.println("Section name is: "+sectionName);
        System.out.println("Number of books is: "+noOfBooks);
        System.out.println("Section location is: "+location);
        System.out.println("Book info is: ");
        this.book.getBookInfo();
    }
}
