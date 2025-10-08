package com.xworkz.shoppingmallapp;

import com.xworkz.shoppingmallapp.constants.Floor;
import com.xworkz.shoppingmallapp.shop.Shop;
import com.xworkz.shoppingmallapp.impl.ShoppingMallImpl;

import java.util.Scanner;

public class ShoppingMallRunner {
    public static void main(String[] args) {
        System.out.println("main started");

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
            boolean added=shoppingMall.addShop(shop);
            if(!added){
                i--;
            }
            System.out.println("---------------------------------------------------");
        }

//        shoppingMall.getShopInfo();

        String input=null;
        do {
            System.out.println("Press 1 to update name by ID");
            System.out.println("Press 2 to update floor by ID");
            System.out.println("Press 3 to update area by ID");
            System.out.println("Press 4 to update area by name");
            System.out.println("Press 5 to update no of workers by ID");
            System.out.println("Press 6 to update owner by ID");
            System.out.println("Press 7 to get name by ID");
            System.out.println("Press 8 to get floor by ID");
            System.out.println("Press 9 to get area by ID");
            System.out.println("Press 10 to get no of workers by ID");
            System.out.println("Press 11 to get owner by ID");
            System.out.println("Press 12 to get floor by Name");
            System.out.println("Press 13 to get shop details by id");
            System.out.println("Press 14 to delete shop by ID");
            System.out.println("Press 15 to delete shop by owner");
            System.out.println("Press 16 to get all shop details");


            int option = sc.nextInt();
            switch (option) {
                case 1:
                System.out.print("Enter Id of shop to update name:");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the updated name:");
                shoppingMall.updateNameById(id, sc.nextLine());
                break;

                case 2:
                System.out.print("Enter Id of shop to update floor:");
                int idToUpdateFloor = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the updated floor:");
                shoppingMall.updateFloorById(idToUpdateFloor, Floor.valueOf(sc.nextLine().toUpperCase()));
                break;

                case 3:
                System.out.print("Enter Id of shop to update area:");
                int idToUpdateArea = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the updated area:");
                shoppingMall.updateAreaById(idToUpdateArea, sc.nextDouble());
                break;

                case 4:
                System.out.print("Enter name of shop to update area:");
                String nameToUpdateAreaByName = sc.nextLine();
                System.out.print("Enter the updated area:");
                shoppingMall.updateAreaByName(nameToUpdateAreaByName, sc.nextDouble());
                break;

                case 5:
                System.out.print("Enter Id of shop to update no of workers:");
                int idToUpdateNo = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the updated no of workers:");
                shoppingMall.updateNoOfWorkersById(idToUpdateNo, sc.nextInt());
                break;

                case 6:
                System.out.print("Enter Id of shop to update owner:");
                int idToUpdateOwner = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the updated owner name:");
                shoppingMall.updateOwnerById(idToUpdateOwner, sc.nextLine());
                break;

                case 7:
                System.out.print("Enter Id to fetch name:");
                String name = shoppingMall.getNameById(sc.nextInt());
                if (name != null) {
                    System.out.println("Name for given id is:" + name);
                }
                break;

                case 8:
                System.out.print("Enter Id to fetch floor:");
                Floor floor = shoppingMall.getFloorById(sc.nextInt());
                if (floor != null) {
                    System.out.println("Floor for given id is:" + floor);
                }
                break;

                case 9:
                System.out.print("Enter Id to fetch area:");
                double area = shoppingMall.getAreaById(sc.nextInt());
                if (area != 0) {
                    System.out.println("Area for given id is:" + area);
                }
                break;

                case 10:
                System.out.print("Enter Id to fetch no of workers:");
                int noOfWorkers = shoppingMall.getNoOfWorkersById(sc.nextInt());
                if (noOfWorkers != 0) {
                    System.out.println("No of workers for given id is:" + noOfWorkers);
                }
                break;

                case 11:
                System.out.print("Enter Id to fetch owner:");
                String owner = shoppingMall.getOwnerById(sc.nextInt());
                if (owner != null) {
                    System.out.println("Owner for given id is:" + owner);
                }
                break;

                case 12:
                System.out.print("Enter Name to fetch floor1:");
                Floor floor1 = shoppingMall.getFloorByName(sc.nextLine());
                if (floor1 != null) {
                    System.out.println("Floor for given name is:" + floor1);
                }
                break;


                case 13:
                System.out.println("Enter id to get shop details");
                shoppingMall.getShopById(sc.nextInt());
                break;

                case 14:
                System.out.print("Enter shop id to delete it's details:");
                shoppingMall.deleteShopById(sc.nextInt());
                break;

                case 15:
                System.out.print("Enter shop owner to delete details:");
                shoppingMall.deleteShopByOwner(sc.nextLine());
                break;

                case 16:
                shoppingMall.getShopInfo();
                break;

                default:
                    System.out.println("Enter valid option");
            }

            System.out.println("Do you want to continue Yes / No");
            input = sc.next();

        }
        while (input.equalsIgnoreCase("YES"));

        System.out.println("main ended");
    }
}
