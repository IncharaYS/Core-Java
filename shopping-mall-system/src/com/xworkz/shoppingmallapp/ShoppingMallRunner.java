package com.xworkz.shoppingmallapp;

import com.xworkz.shoppingmallapp.constants.Floor;
import com.xworkz.shoppingmallapp.shop.Shop;
import com.xworkz.shoppingmallapp.impl.ShoppingMallImpl;

import java.util.Scanner;

public class ShoppingMallRunner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of shops to add:");
        int size=sc.nextInt();
        ShoppingMallImpl shoppingMall=new ShoppingMallImpl(size);
        System.out.println("Number of shops to be added is:"+shoppingMall.shops.length);
        for (int i=0;i<size;i++){
            System.out.println("Enter details of shop "+(i+1));
            Shop shop=new Shop();
            System.out.print("Enter shop id:");
            shop.setShopId(sc.nextInt());
            System.out.print("Enter shop name:");sc.nextLine();
            shop.setName(sc.nextLine());
            System.out.print("Enter shop floor:");
            shop.setFloor(Floor.valueOf(sc.nextLine().toUpperCase()));
            System.out.print("Enter shop area:");
            shop.setArea(sc.nextDouble());
            System.out.print("Enter no of workers:");
            shop.setNoOfWorkers(sc.nextInt());
            System.out.print("Enter shop owner:");sc.nextLine();
            shop.setOwner(sc.nextLine());
            shoppingMall.addShop(shop);
            System.out.println("---------------------------------------------------");
        }

        shoppingMall.getShopInfo();

        System.out.print("Enter Id of shop to update name:");
        int id=sc.nextInt();sc.nextLine();
        System.out.print("Enter the updated name:");
        boolean isUpdated=shoppingMall.updateNameById(id,sc.nextLine());
        if(isUpdated) System.out.println("Name updated successfully \n");
        else System.out.println("Failed to update name\n");

//        shoppingMall.updateAreaById(1,2354545);
//        shoppingMall.updateFloorById(2,Floor.FIFTH);
//        shoppingMall.updateNoOfWorkersById(1,89);
//        shoppingMall.updateOwnerById(2,"Ranveer");

        System.out.print("Enter Id to fetch name:");
        System.out.println("Name for given id is:"+shoppingMall.getNameById(sc.nextInt()));

//        shoppingMall.getAreaById(1);
//        shoppingMall.getOwnerById(1);
//        shoppingMall.getFloorById(1);
//        shoppingMall.getNoOfWorkersById(2);
//        shoppingMall.getFloorByName("Zudio");
//        shoppingMall.deleteShopByOwner("Ranveer");

        System.out.println("Enter id to get shop details");
        shoppingMall.getShopById(sc.nextInt());

        System.out.print("Enter shop id to delete it's details:");
        shoppingMall.deleteShopById(sc.nextInt());
        shoppingMall.getShopInfo();

        /*Shop shop1=new Shop();
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
//        else System.out.println("Shop is not added");*/
    }
}
