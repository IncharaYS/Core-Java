package com.xworkz.scackapp;

import com.xworkz.scackapp.impl.BingoImpl;
import com.xworkz.scackapp.snacks.Snack;

public class SnackRunner {
    public static void main(String[] args) {
        Snack snack=new BingoImpl();
        snack.openPack();
        snack.eat();
        snack.share();
    }
}
