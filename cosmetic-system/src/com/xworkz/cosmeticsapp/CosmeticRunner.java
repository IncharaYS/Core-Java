package com.xworkz.cosmeticsapp;

import com.xworkz.cosmeticsapp.cosmetic.Cosmetic;
import com.xworkz.cosmeticsapp.lipstick.Lipstick;

public class CosmeticRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Cosmetic cosmetic=new Lipstick();
        cosmetic.cosmetic();
        System.out.println("main ended");

    }
}
