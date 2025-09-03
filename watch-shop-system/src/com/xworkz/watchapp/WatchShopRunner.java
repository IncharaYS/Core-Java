package com.xworkz.watchapp;

import com.xworkz.watchapp.watch.Watch;
import com.xworkz.watchapp.watchshop.WatchShop;

public class WatchShopRunner {
    public static void main(String[] args) {
        Watch watch1=new Watch();
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
