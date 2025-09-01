package com.xworkz.harbourapp;

import com.xworkz.harbourapp.harbour.Harbour;
import com.xworkz.harbourapp.newmangalore.NewMangalore;

public class HarbourRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Harbour harbour=new NewMangalore();
        harbour.harbour();
        System.out.println("main ended");
    }
}
