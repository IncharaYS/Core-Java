package com.xworkz.fishapp.impl;

import com.xworkz.fishapp.fish.Fish;

public class GoldFishImpl implements Fish {
    @Override
    public void swim() {
        System.out.println("Gold fish swims");
    }

    @Override
    public void eat() {
        System.out.println("Gold fish eats");
    }

    @Override
    public void layEggs() {
        System.out.println("Gold fish lays eggs");
    }
}
