package com.xworkz.watchapp;

import com.xworkz.watchapp.watch.Watch;
import com.xworkz.watchapp.watchshop.WatchShop;

public class WatchShopRunner {
    public static void main(String[] args) {
        Watch watch=new Watch();
        watch.setWatchId(1);
        watch.setBrand("Rolex");
        watch.setType("Analog");
        watch.setColor("Black");
        watch.setPrice(1000000.00);
        watch.setHasValidity(true);
        watch.setWaterResistant(true);

        WatchShop watchShop=new WatchShop();
        if(watchShop.addWatch(watch)) watchShop.getWatchInfo();
        else System.out.println("watch is not added");
    }
}
