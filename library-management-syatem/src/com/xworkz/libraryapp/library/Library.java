package com.xworkz.libraryapp.library;

public class Library {
    int libraryId;
    String name;
    String location;
    boolean isPublic;
    Section section;

    Library(){

    }
    Library(int libraryId,String name,String location,boolean isPublic,Section section){
        this.libraryId=libraryId;
        this.name=name;
        this.location=location;
        this.isPublic=isPublic;
        this.section=section;
    }
    public void getLibraryInfo(){
        System.out.println("Library id is: "+libraryId);
        System.out.println("Library name is: "+name);
        System.out.println("Library location is: "+location);
        System.out.println("Is library public?: "+isPublic);
    }
}
