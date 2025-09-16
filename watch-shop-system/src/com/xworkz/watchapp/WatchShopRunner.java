package com.xworkz.watchapp;

import com.xworkz.watchapp.constants.HasValidity;
import com.xworkz.watchapp.constants.IsWaterResistant;
import com.xworkz.watchapp.constants.Type;
import com.xworkz.watchapp.watch.Watch;
import com.xworkz.watchapp.watchshop.WatchShop;

import java.util.Scanner;

public class WatchShopRunner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of watches to be added:");
        int size=sc.nextInt();
        WatchShop watchShop=new WatchShop(size);
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

        watchShop.getWatchInfo();

        System.out.print("Enter Id of watch to update color:");
        int id=sc.nextInt();sc.nextLine();
        System.out.print("Enter the updated color:");
        boolean isUpdated=watchShop.updateColorById(id,sc.nextLine());
        if(isUpdated) System.out.println("color updated successfully \n");
        else System.out.println("Failed to update color\n");


        System.out.print("Enter Id to fetch brand:");
        System.out.println("brand for given id is:"+watchShop.getBrandById(sc.nextInt()));


        System.out.println("Enter id to get watch details");
        watchShop.getWatchById(sc.nextInt());

        System.out.print("Enter watch id to delete it:");
        watchShop.deleteWatchById(sc.nextInt());
        watchShop.getWatchInfo();

       /* Watch watch1=new Watch();
        watch1.setWatchId(1);
        watch1.setBrand("Rolex");
        watch1.setType("Analog");
        watch1.setColor("Black");
        watch1.setPrice(1000000.00);
        watch1.setHasValidity(true);
        watch1.setWaterResistant(true);

        WatchShop watchShop=new WatchShop();
        watchShop.addWatch(watch1);

        Watch watch2=new Watch(2,900.00,"Black","Sonata",true,"Analog",true);
        watchShop.addWatch(watch2);

        Watch watch3 = new Watch(3, 1500.00, "Gold", "Fossil", true, "Analog", true);
        watchShop.addWatch(watch3);

        Watch watch4 = new Watch(4, 2000.00, "Blue", "Casio", true, "Digital", true);
        watchShop.addWatch(watch4);

        Watch watch5 = new Watch(5, 750.00, "Brown", "Timex", true, "Analog", true);
        watchShop.addWatch(watch5);

        Watch watch6 = new Watch(6, 2500.00, "Black", "Seiko", true, "Automatic", true);
        watchShop.addWatch(watch6);

        Watch watch7 = new Watch(7, 1800.00, "White", "Citizen", true, "Solar", true);
        watchShop.addWatch(watch7);

        Watch watch8 = new Watch(8, 1100.00, "Green", "Fastrack", true, "Digital", true);
        watchShop.addWatch(watch8);

        Watch watch9 = new Watch(9, 3000.00, "Grey", "Rolex", true, "Analog", true);
        watchShop.addWatch(watch9);

        watchShop.getWatchInfo();


        /*if(watchShop.addWatch(watch)) watchShop.getWatchInfo();
        else System.out.println("watch is not added");*/
    }
}
