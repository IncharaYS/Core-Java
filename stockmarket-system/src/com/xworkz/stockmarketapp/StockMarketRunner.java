package com.xworkz.stockmarketapp;

import com.xworkz.stockmarketapp.stockmarket.StockMarket;

public class StockMarketRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        StockMarket stock1=new StockMarket();
        stock1.setMarketId(1);
        stock1.setName("Reliance");
        stock1.setPrice(1300.00);
        stock1.setQuantity(30);

        System.out.println("Stock ID is: "+stock1.getMarketId());
        System.out.println("Stock name is: "+stock1.getName());
        System.out.println("Stock price is: "+stock1.getPrice());
        System.out.println("Stock quantity is: "+stock1.getQuantity());

        System.out.println("main ended");
    }
}
