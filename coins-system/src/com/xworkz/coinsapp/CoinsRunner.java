package com.xworkz.coinsapp;

import com.xworkz.coinsapp.coins.Coins;

public class CoinsRunner {
    public static void main(String[] args) {
        System.out.println("main stared");

        Coins coin1=new Coins();

        coin1.setCoinId(1);
        coin1.setCurrency("Rupee");
        coin1.setPrice(10.00);
        coin1.setWeight(2.31);

        System.out.println("Coin Id is: "+coin1.getCoinId());
        System.out.println("Coin currency is: "+coin1.getCurrency());
        System.out.println("Coin price is: "+coin1.getPrice());
        System.out.println("Coin weight is: "+coin1.getWeight());

        System.out.println("main ended");
    }
}
