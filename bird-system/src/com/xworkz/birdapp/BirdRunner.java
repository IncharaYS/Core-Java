package com.xworkz.birdapp;

import com.xworkz.birdapp.bird.Bird;
import com.xworkz.birdapp.impl.SparrowImpl;

public class BirdRunner {
    public static void main(String[] args) {
        Bird bird=new SparrowImpl();
        bird.fly();
        bird.buildNest();
        bird.sing();
    }
}
