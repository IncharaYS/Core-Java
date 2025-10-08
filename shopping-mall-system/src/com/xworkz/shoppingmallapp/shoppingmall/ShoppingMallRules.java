package com.xworkz.shoppingmallapp.shoppingmall;

import com.xworkz.shoppingmallapp.constants.Floor;
import com.xworkz.shoppingmallapp.exception.ShopNotFoundException;
import com.xworkz.shoppingmallapp.shop.Shop;

public interface ShoppingMallRules {
    boolean addShop(Shop shop);
    boolean updateNameById(int existingId,String updatedName);
    boolean updateFloorById(int existingId, Floor updatedFloor);
    boolean updateAreaById(int existingId,double updatedArea);
    boolean updateNoOfWorkersById(int existingId,int updatedNoOfWorkers);
    boolean updateOwnerById(int existingId,String updatedOwner);
    boolean updateAreaByName(String name,double updatedArea);
    String getNameById(int existingShopId);
    Floor getFloorById(int existingShopId);
    double getAreaById(int existingShopId);
    int getNoOfWorkersById(int existingShopId);
    String getOwnerById(int existingShopId);
    Floor getFloorByName(String existingName);
    void deleteShopByOwner(String owner);
    void deleteShopById(int id);
    void getShopById(int existingId);
    void getShopDetails(Shop shop) throws ShopNotFoundException;
    void getShopInfo();

}
