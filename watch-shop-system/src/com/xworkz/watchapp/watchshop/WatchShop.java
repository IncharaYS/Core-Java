package com.xworkz.watchapp.watchshop;

import com.xworkz.watchapp.validator.WatchValidator;
import com.xworkz.watchapp.watch.Watch;

public class WatchShop {
    Watch[] watchs=new Watch[9];
    int index;

    public boolean addWatch(Watch watch){
        boolean isWatchAdded=false;

        WatchValidator watchValidator=new WatchValidator();
        if(watchValidator.validateWatch(watch)){
            isWatchAdded=true;
            watchs[index++]=watch;
        }
        return isWatchAdded;
    }
    public void getWatchInfo() {
        for (Watch watch : watchs) {
            System.out.println("Watch ID is: " +watch.getWatchId());
            System.out.println("Watch type is: " + watch.getType());
            System.out.println("Watch color is: " + watch.getColor());
            System.out.println("Watch brand is: " + watch.getBrand());
            System.out.println("Watch price is: " + watch.getPrice());
            System.out.println("Watch has validity?: " + watch.isHasValidity());
            System.out.println("Watch is water resistant?: " + watch.isWaterResistant()+"\n");
        }
    }
}
