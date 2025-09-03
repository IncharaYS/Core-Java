package com.xworkz.shoppingmallapp;

import com.xworkz.shoppingmallapp.shop.Shop;
import com.xworkz.shoppingmallapp.shoppingmall.ShoppingMall;

public class ShoppingMallRunner {
    public static void main(String[] args) {
        Shop shop1=new Shop();
        shop1.setShopId(1);
        shop1.setArea(2000.00);
        shop1.setFloor(2);
        shop1.setName("Reliance");
        shop1.setOwner("Mukesh Ambani");
        shop1.setNoOfWorkers(37);

        ShoppingMall shoppingMall=new ShoppingMall();
        shoppingMall.addShop(shop1);

        Shop shop2=new Shop(2,"Zudio",3,5000.00,8,"Tata");
        shoppingMall.addShop(shop2);

        Shop shop3 = new Shop(3, "Lifestyle", 2, 15000.00, 12, "Landmark");
        shoppingMall.addShop(shop3);

        Shop shop4 = new Shop(4, "Pantaloons", 1, 12000.00, 10, "Aditya Birla");
        shoppingMall.addShop(shop4);

        Shop shop5 = new Shop(5, "Shoppers Stop", 4, 20000.00, 15, "K Raheja");
        shoppingMall.addShop(shop5);

        Shop shop6 = new Shop(6, "H&M", 2, 18000.00, 14, "Hennes & Mauritz");
        shoppingMall.addShop(shop6);

        Shop shop7 = new Shop(7, "Max Fashion", 3, 10000.00, 9, "Landmark");
        shoppingMall.addShop(shop7);

        Shop shop8 = new Shop(8, "Reliance Trends", 1, 13000.00, 11, "Reliance");
        shoppingMall.addShop(shop8);

        Shop shop9 = new Shop(9, "Fabindia", 2, 8000.00, 7, "Fabindia");
        shoppingMall.addShop(shop9);

        Shop shop10 = new Shop(10, "Marks & Spencer", 4, 22000.00, 16, "M&S");
        shoppingMall.addShop(shop10);

        Shop shop11 = new Shop(11, "Bata", 1, 6000.00, 6, "Bata India");
        shoppingMall.addShop(shop11);

        Shop shop12 = new Shop(12, "Woodland", 3, 7000.00, 8, "Aero Group");
        shoppingMall.addShop(shop12);

        Shop shop13 = new Shop(13, "Nike", 2, 25000.00, 18, "Nike Inc.");
        shoppingMall.addShop(shop13);

        Shop shop14 = new Shop(14, "Adidas", 2, 24000.00, 17, "Adidas AG");
        shoppingMall.addShop(shop14);

        Shop shop15 = new Shop(15, "Reebok", 3, 12000.00, 10, "Adidas");
        shoppingMall.addShop(shop15);

        shoppingMall.getShopInfo();

//        if(shoppingMall.addShop(shop)) shoppingMall.getShopInfo();
//        else System.out.println("Shop is not added");
    }
}
