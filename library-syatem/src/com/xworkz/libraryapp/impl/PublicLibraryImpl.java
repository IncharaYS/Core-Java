package com.xworkz.libraryapp.impl;

import com.xworkz.libraryapp.library.Library;

public class PublicLibraryImpl implements Library {
    @Override
    public void addBook() {
        System.out.println("Public library adds book");
    }

    @Override
    public void issueBook() {
        System.out.println("Public library issues book");
    }

    @Override
    public void returnBook() {
        System.out.println("Return books to public library");
    }
}
