package com.xworkz.shoppingmallapp.validator;

import com.xworkz.shoppingmallapp.shop.Shop;

public class ShopValidator {
    public boolean validateShop(Shop shop){
        boolean isShopValidated=false;
        boolean isShopIdValid=false;
        boolean isNameValid=false;
        boolean isNoOfWorkersValid=false;
        boolean isFloorValid=false;
        boolean isOwnerValid=false;
        boolean isAreaValid=false;

        if (shop.getShopId()>0) isShopIdValid=true;
        else System.out.println("Shop ID is not valid");

        if (shop.getArea()>0) isAreaValid=true;
        else System.out.println("Entered shop area is not valid");

        if (shop.getFloor()>=0) isFloorValid=true;
        else System.out.println("Entered floor is not valid");

        if (shop.getNoOfWorkers()>0) isNoOfWorkersValid=true;
        else System.out.println("Entered no of workers is not valid");

        if (shop.getName()!=null&&!shop.getName().isEmpty()) isNameValid=true;
        else System.out.println("Entered shop name is not valid");

        if (shop.getOwner()!=null&&!shop.getOwner().isEmpty()) isOwnerValid=true;
        else System.out.println("Entered shop owner is not valid");

        if(isShopIdValid&&isAreaValid&&isFloorValid&&isNameValid&&isNoOfWorkersValid&&isOwnerValid){
            isShopValidated=true;
        }

        return isShopValidated;
    }
}
