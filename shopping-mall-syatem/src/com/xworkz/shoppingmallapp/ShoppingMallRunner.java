package com.xworkz.shoppingmallapp;

import com.xworkz.shoppingmallapp.shop.Shop;
import com.xworkz.shoppingmallapp.shoppingmall.ShoppingMall;

public class ShoppingMallRunner {
    public static void main(String[] args) {
        Shop shop=new Shop();
        shop.setShopId(1);
        shop.setArea(2000.00);
        shop.setFloor(2);
        shop.setName("Reliance");
        shop.setOwner("Mukesh Ambani");
        shop.setNoOfWorkers(37);

        ShoppingMall shoppingMall=new ShoppingMall();
        if(shoppingMall.addShop(shop)) shoppingMall.getShopInfo();
        else System.out.println("Shop is not added");
    }
}
