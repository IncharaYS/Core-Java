package com.xworkz.watchapp.validator;

import com.xworkz.watchapp.watch.Watch;

public class WatchValidator {
    public boolean validateWatch(Watch watch){
        boolean isWatchValidated=false;
        boolean  isWatchIdValid=false;
        boolean isColorValid=false;
        boolean isBrandValid=false;
        boolean isTypeValid=false;
        boolean isWaterResistantValueValid=false;
        boolean isHasValidityValueValid=false;
        boolean isPriceValid=false;

        if (watch.getWatchId()>0) isWatchIdValid=true;
        else System.out.println("Entered ID is not valid");

        if (watch.getBrand()!=null&&!watch.getBrand().isEmpty()) isBrandValid=true;
        else System.out.println("Entered brand is not valid");

        if (watch.getColor()!=null&&!watch.getColor().isEmpty()) isColorValid=true;
        else System.out.println("Entered color is not valid");

        if (watch.getPrice()>0) isPriceValid=true;
        else System.out.println("Entered price is not valid");

        if (watch.getIsWaterResistant()!=false) isWaterResistantValueValid=true;
        else System.out.println("Entered value for is water resistant is not valid");

        if (watch.getHasValidity()!=false) isHasValidityValueValid=true;
        else System.out.println("Entered value for has validity is not valid");

        if (watch.getType()!=null&&!watch.getType().isEmpty()) isTypeValid=true;
        else System.out.println("Entered type is not valid");

        if(isBrandValid&&isColorValid&&isWatchIdValid&&isPriceValid&&isTypeValid&&isHasValidityValueValid&&isWaterResistantValueValid){
            isWatchValidated=true;
        }
        return isWatchValidated;
    }
}
