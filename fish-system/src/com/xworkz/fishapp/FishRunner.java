package com.xworkz.fishapp;

import com.xworkz.fishapp.fish.Fish;

public class FishRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Fish fish1=new Fish();
        fish1.setFishId(1);
        fish1.setName("Cod");
        fish1.setLength(30.00);
        fish1.setColor("Brown");

        System.out.println("Fish Id is: "+fish1.getFishId());
        System.out.println("Fish name is: "+fish1.getName());
        System.out.println("Fish length is: "+fish1.getLength());
        System.out.println("Fish color is: "+fish1.getColor());

        System.out.println("main ended");
    }
}
