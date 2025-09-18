package com.xworkz.libraryapp;

import com.xworkz.libraryapp.impl.PublicLibraryImpl;
import com.xworkz.libraryapp.library.Library;

public class LibraryRunner {
    public static void main(String[] args) {
        Library library=new PublicLibraryImpl();
        library.addBook();
        library.issueBook();
        library.returnBook();
    }
}
