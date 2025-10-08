package com.xworkz.watchapp;

import com.xworkz.watchapp.constants.HasValidity;
import com.xworkz.watchapp.constants.IsWaterResistant;
import com.xworkz.watchapp.constants.Type;
import com.xworkz.watchapp.impl.WatchShopImpl;
import com.xworkz.watchapp.watch.Watch;

import java.util.Scanner;

public class WatchShopRunner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of watches to be added:");
        int size=sc.nextInt();
        WatchShopImpl watchShop=new WatchShopImpl(size);
        System.out.println("Number of watch details to be entered is:"+watchShop.watches.length);

        for(int i=0;i<size;i++){
            Watch watch=new Watch();
            System.out.println("Enter details of watch "+(i+1));
            System.out.print("Enter the watch id:");
            watch.setWatchId(sc.nextInt());
            System.out.print("Enter the watch price:");
            watch.setPrice(sc.nextDouble());sc.nextLine();
            System.out.print("Enter the watch color:");
            watch.setColor(sc.nextLine());
            System.out.print("Enter the watch brand:");
            watch.setBrand(sc.nextLine());
            System.out.print("Enter the watch type:");
            watch.setType(Type.valueOf(sc.nextLine().toUpperCase()));
            System.out.print("Does watch have validity?:");
            watch.setHasValidity(HasValidity.valueOf(sc.nextLine().toUpperCase()));
            System.out.print("Is watch water resistant?:");
            watch.setIsWaterResistant(IsWaterResistant.valueOf(sc.nextLine().toUpperCase()));
            watchShop.addWatch(watch);
            System.out.println("----------------------------------------------------------------");
        }
        System.out.println();

        System.out.print("Enter Id of watch to update color:");
        int id=sc.nextInt();sc.nextLine();
        System.out.print("Enter the updated color:");
        boolean isUpdated=watchShop.updateColorById(id,sc.nextLine());
        if(isUpdated) System.out.println("color updated successfully \n");
        else System.out.println("Failed to update color\n");

//        watchShop.updateBrandById(1,"Titan");
//        watchShop.updatePriceById(1,899);
//        watchShop.updateTypeById(1,Type.DIGITAL);
//        watchShop.updateValidityById(1,HasValidity.NO);
//        watchShop.updateWaterResistantById(2,IsWaterResistant.YES);

        System.out.print("Enter Id to fetch brand:");
        System.out.println("brand for given id is:"+watchShop.getBrandById(sc.nextInt()));

//        watchShop.getBrandByColor("Green");
//        watchShop.getColorById(2);
//        watchShop.getPriceById(2);
//        watchShop.getTypeById(2);
//        watchShop.getValidityById(1);
//        watchShop.getWaterResistantById(2);
//        watchShop.deleteWatchByType(Type.DIGITAL);


        System.out.println("Enter id to get watch details");
        watchShop.getWatchById(sc.nextInt());

        System.out.print("Enter watch id to delete it:");
        watchShop.deleteWatchById(sc.nextInt());

    }
}
