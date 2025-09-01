package com.xworkz.plasticapp;

import com.xworkz.plasticapp.bottle.Bottle;
import com.xworkz.plasticapp.plastic.Plastic;

public class PlasticRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Plastic plastic=new Bottle();
        plastic.plastic();
        System.out.println("main ended");
    }
}
