package com.xworkz.watchapp.watchshop;

import com.xworkz.watchapp.validator.WatchValidator;
import com.xworkz.watchapp.watch.Watch;

public class WatchShop {
    Watch watch;
    public boolean addWatch(Watch watch){
        boolean isWatchAdded=false;

        WatchValidator watchValidator=new WatchValidator();
        if(watchValidator.validateWatch(watch)){
            isWatchAdded=true;
            this.watch=watch;
        }
        return isWatchAdded;
    }
    public void getWatchInfo(){
        System.out.println("Watch ID is: "+this.watch.getWatchId());
        System.out.println("Watch type is: "+this.watch.getType());
        System.out.println("Watch color is: "+this.watch.getColor());
        System.out.println("Watch brand is: "+this.watch.getBrand());
        System.out.println("Watch price is: "+this.watch.getPrice());
        System.out.println("Watch has validity?: "+this.watch.getHasValidity());
        System.out.println("Watch is water resistant?: "+this.watch.getIsWaterResistant());
    }
}
