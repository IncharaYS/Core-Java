package com.xworkz.flowerapp;

import com.xworkz.flowerapp.flower.Flower;
import com.xworkz.flowerapp.lotus.Lotus;

public class FlowerRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Flower flower=new Lotus();
        flower.flower();

        System.out.println("main ended");
    }
}
