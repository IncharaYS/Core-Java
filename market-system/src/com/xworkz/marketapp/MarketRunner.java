package com.xworkz.marketapp;

import com.xworkz.marketapp.market.Market;

public class MarketRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Market market1=new Market();
        market1.setMarketId(1);
        market1.setCrowded(true);
        market1.setType("All-week");
        market1.setLocation("Malleshwaram");
        market1.setBudgetFriendly(true);
        market1.setNoOfShops(56);

        System.out.println("Market Id is: "+market1.getMarketId());
        System.out.println("Market is crowded?: "+market1.getIsCrowded());
        System.out.println("Market type is: "+market1.getType());
        System.out.println("Market location is: "+market1.getLocation());
        System.out.println("Market is budget friendly?: "+market1.getIsBudgetFriendly());
        System.out.println("Market no of shops is: "+market1.getNoOfShops());

        System.out.println("main ended");
    }
}
