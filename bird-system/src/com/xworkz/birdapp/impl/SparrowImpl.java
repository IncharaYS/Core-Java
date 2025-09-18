package com.xworkz.birdapp.impl;

import com.xworkz.birdapp.bird.Bird;

public class SparrowImpl implements Bird {
    @Override
    public void fly() {
        System.out.println("sparrow flies");
    }

    @Override
    public void sing() {
        System.out.println("Sparrow sings");
    }

    @Override
    public void buildNest() {
        System.out.println("sparrow builds nests");
    }
}
