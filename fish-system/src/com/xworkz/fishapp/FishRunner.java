package com.xworkz.fishapp;

import com.xworkz.fishapp.fish.Fish;
import com.xworkz.fishapp.impl.GoldFishImpl;

public class FishRunner {
    public static void main(String[] args) {
        Fish fish=new GoldFishImpl();
        fish.swim();
        fish.eat();
        fish.layEggs();
    }
}
