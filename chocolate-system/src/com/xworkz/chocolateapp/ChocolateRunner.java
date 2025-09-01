package com.xworkz.chocolateapp;

import com.xworkz.chocolateapp.chocolate.Chocolate;
import com.xworkz.chocolateapp.diarymilk.Diarymilk;

public class ChocolateRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Chocolate chocolate=new Diarymilk();
        chocolate.chocolate();
        System.out.println("main ended");

    }
}
