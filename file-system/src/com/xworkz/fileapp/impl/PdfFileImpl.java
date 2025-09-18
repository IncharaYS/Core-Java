package com.xworkz.fileapp.impl;

import com.xworkz.fileapp.file.File;

public class PdfFileImpl implements File {
    @Override
    public void open() {
        System.out.println("Opening PDF file");
    }

    @Override
    public void close() {
        System.out.println("Closing PDF file");
    }

    @Override
    public void delete() {
        System.out.println("Deleting PDF file");
    }

    @Override
    public void edit() {
        System.out.println("Editing PDF file");
    }
}
