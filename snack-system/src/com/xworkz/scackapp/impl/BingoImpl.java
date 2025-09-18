package com.xworkz.scackapp.impl;

import com.xworkz.scackapp.snacks.Snack;

public class BingoImpl implements Snack {
    @Override
    public void openPack() {
        System.out.println("Opening bingo pack");
    }

    @Override
    public void eat() {
        System.out.println("Eating bingo");
    }

    @Override
    public void share() {
        System.out.println("Sharing bingo");
    }
}
