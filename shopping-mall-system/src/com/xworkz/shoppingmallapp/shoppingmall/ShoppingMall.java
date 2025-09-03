package com.xworkz.shoppingmallapp.shoppingmall;

import com.xworkz.shoppingmallapp.ShoppingMallRunner;
import com.xworkz.shoppingmallapp.shop.Shop;
import com.xworkz.shoppingmallapp.validator.ShopValidator;

public class ShoppingMall {
    Shop[] shops=new Shop[15];
    int index;

    public boolean addShop(Shop shop){
        boolean isShopAdded=false;

        ShopValidator shopValidator=new ShopValidator();
        if(shopValidator.validateShop(shop)){
            shops[index++]=shop;
            isShopAdded=true;
        }
        return isShopAdded;
    }
    public void getShopInfo() {
        for (Shop shop : shops) {
            System.out.println("Shop ID is: " +shop.getShopId());
            System.out.println("Shop name is: " +shop.getName());
            System.out.println("Shop area is: " +shop.getArea());
            System.out.println("Shop floor is: " +shop.getFloor());
            System.out.println("Shop no of workers is: " +shop.getNoOfWorkers());
            System.out.println("Shop owner is: " +shop.getOwner()+"\n");
        }
    }
}
