package com.xworkz.tyreapp;

import com.xworkz.tyreapp.tyre.Tyre;

public class TyreRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Tyre tyre1=new Tyre();
        tyre1.setTyreId(1);
        tyre1.setBrand("CEAT");
        tyre1.setPrice(1200.00);
        tyre1.setSize('M');
        tyre1.setSeasons("All round");
        tyre1.setRimSize(30);

        System.out.println("Tyre ID is: "+tyre1.getTyreId());
        System.out.println("Tyre brand is: "+tyre1.getBrand());
        System.out.println("Tyre price is: "+tyre1.getPrice());
        System.out.println("Tyre size is: "+tyre1.getSize());
        System.out.println("Tyre seasons is: "+tyre1.getSeasons());
        System.out.println("Tyre rim size is: "+tyre1.getRimSize());

        System.out.println("main ended");
    }
}
