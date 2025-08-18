package com.xworkz.shoppingmallapp.shoppingmall;

import com.xworkz.shoppingmallapp.shop.Shop;
import com.xworkz.shoppingmallapp.validator.ShopValidator;

public class ShoppingMall {
    Shop shop;
    public boolean addShop(Shop shop){
        boolean isShopAdded=false;

        ShopValidator shopValidator=new ShopValidator();
        if(shopValidator.validateShop(shop)){
            this.shop=shop;
            isShopAdded=true;
        }
        return isShopAdded;
    }
    public void getShopInfo(){
        System.out.println("Shop ID is: "+this.shop.getShopId());
        System.out.println("Shop name is: "+this.shop.getName());
        System.out.println("Shop area is: "+this.shop.getArea());
        System.out.println("Shop floor is: "+this.shop.getFloor());
        System.out.println("Shop no of workers is: "+this.shop.getNoOfWorkers());
        System.out.println("Shop owner is: "+this.shop.getOwner());
    }
}
