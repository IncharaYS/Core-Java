package com.xworkz.fileapp;

import com.xworkz.fileapp.file.File;
import com.xworkz.fileapp.impl.PdfFileImpl;

public class FileRunner {
    public static void main(String[] args) {
        File file=new PdfFileImpl();
        file.open();
        file.edit();
        file.close();
        file.delete();
    }
}
