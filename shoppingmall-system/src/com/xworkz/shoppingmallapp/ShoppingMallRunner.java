package com.xworkz.shoppingmallapp;

import com.xworkz.shoppingmallapp.mantrisquare.MantriSquare;
import com.xworkz.shoppingmallapp.shoppingmall.ShoppingMall;

public class ShoppingMallRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        ShoppingMall shoppingMall=new MantriSquare();
        shoppingMall.shoppingMall();
        System.out.println("main ended");
    }
}
