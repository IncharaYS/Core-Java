package com.xworkz.shoppingmallapp.impl;

import com.xworkz.shoppingmallapp.constants.Floor;
import com.xworkz.shoppingmallapp.exception.*;
import com.xworkz.shoppingmallapp.shop.Shop;
import com.xworkz.shoppingmallapp.shoppingmall.ShoppingMallRules;
import com.xworkz.shoppingmallapp.validator.ShopValidator;

import java.util.Objects;

public class ShoppingMallImpl implements ShoppingMallRules {

    public ShoppingMallImpl(int size){
        this.shops=new Shop[size];
    }

    public Shop[] shops;
    public int index;

    @Override
    public boolean addShop(Shop shop){
        boolean isShopAdded=false;
        try{
        ShopValidator shopValidator=new ShopValidator();
        if(shopValidator.validateShop(shop)){
            shops[index++]=shop;
            isShopAdded=true;
            return isShopAdded;
        }
        else{
            ShopNotAddedException shopNotAddedException=new ShopNotAddedException("Shop is not added");
            throw shopNotAddedException;
        }
        }
        catch(ShopNotAddedException snae){
            System.out.println("Invalid shop details,Shop not added");
        snae.printStackTrace();
        }
        return isShopAdded;
    }

    @Override
    public boolean updateNameById(int existingId,String updatedName){
        boolean isNameUpdated=false;
        try {
            for (Shop shop : this.shops) {
                if (shop.getShopId() == existingId) {
                    shop.setName(updatedName);
                    isNameUpdated = true;
                    System.out.println("Name of shop " + shop.getShopId() + " updated to:" + shop.getName());
                    return isNameUpdated;
                }
            }

            if(!isNameUpdated){
                IdNotFoundException idNotFoundException = new IdNotFoundException("Given shop id does not exist");
                throw idNotFoundException;
            }
        }

        catch(IdNotFoundException infe){
                //System.out.println("Shop Id " + existingId + " does not exist");
            System.out.println("Shop Id " + existingId + " does not exist");
            infe.printStackTrace();
            }
        return isNameUpdated;
    }


    @Override
    public boolean updateFloorById(int existingId,Floor updatedFloor){
        boolean isFloorUpdated=false;
        try {
            for (Shop shop : this.shops) {
                if (shop.getShopId() == existingId) {
                    shop.setFloor(updatedFloor);
                    isFloorUpdated = true;
                    System.out.println("Floor of shop " + shop.getShopId() + " updated to:" + shop.getFloor());
                    return isFloorUpdated;
                }
            }
            if (!isFloorUpdated){
//                    System.out.println("Shop Id " + existingId + " does not exist");
                throw new IdNotFoundException("Given shop id does not exist");
            }
        }
        catch(IdNotFoundException infe){
            System.out.println("Shop Id " + existingId + " does not exist");
            infe.printStackTrace();
        }
        return isFloorUpdated;
    }

    @Override
    public boolean updateAreaById(int existingId,double updatedArea){
        boolean isAreaUpdated=false;
        try {
            for (Shop shop : this.shops) {
                if (shop.getShopId() == existingId) {
                    shop.setArea(updatedArea);
                    isAreaUpdated = true;
                    System.out.println("Area of shop " + shop.getShopId() + " updated to:" + shop.getArea());
                    return isAreaUpdated;
                }
                if (!isAreaUpdated) {
                    throw new IdNotFoundException("Given id does not exist");
                }
            }
        }
        catch(IdNotFoundException infe){
            System.out.println("Shop Id " + existingId + " does not exist");
            infe.printStackTrace();
        }

        return isAreaUpdated;
    }

    @Override
    public boolean updateAreaByName(String name,double updatedArea){
        boolean isAreaUpdated=false;
        try {
            for (Shop shop : this.shops) {
                if (Objects.equals(shop.getName(), name)) {
                    shop.setArea(updatedArea);
                    isAreaUpdated = true;
                    System.out.println("Area of shop " + shop.getName() + " updated to:" + shop.getArea());
                    return isAreaUpdated;
                }
                if (!isAreaUpdated) {
                   throw new NameNotFoundException("Given name is not found");
                }
            }
        }
        catch(NameNotFoundException nnfe){
            System.out.println("Shop name " + name + " does not exist");
            nnfe.printStackTrace();
        }
        return isAreaUpdated;
    }


    @Override
    public boolean updateNoOfWorkersById(int existingId,int updatedNoOfWorkers){
        boolean isWorkersUpdated=false;
        try {
            for (Shop shop : this.shops) {
                if (shop.getShopId() == existingId) {
                    shop.setNoOfWorkers(updatedNoOfWorkers);
                    isWorkersUpdated = true;
                    System.out.println("No of workers in shop " + shop.getShopId() + " updated to:" + shop.getNoOfWorkers());
                    return isWorkersUpdated;
                }
                if (!isWorkersUpdated){
                    throw new IdNotFoundException("Given id not found");
                }
            }
        }
        catch (IdNotFoundException infe){
            System.out.println("Shop Id " + existingId + " does not exist");
            infe.printStackTrace();
        }
        return isWorkersUpdated;
    }

    @Override
    public boolean updateOwnerById(int existingId,String updatedOwner){
        boolean isOwnerUpdated=false;
        try {
            for (Shop shop : this.shops) {
                if (shop.getShopId() == existingId) {
                    shop.setOwner(updatedOwner);
                    isOwnerUpdated = true;
                    System.out.println("Owner of shop " + shop.getShopId() + " updated to:" + shop.getOwner());
                }
                if (!isOwnerUpdated){
                    throw new IdNotFoundException("Given Id not found");
                }
            }
        }
        catch(IdNotFoundException infe){
            System.out.println("Shop Id " + existingId + " does not exist");
            infe.printStackTrace();
        }

        return isOwnerUpdated;
    }

    @Override
    public String getNameById(int existingShopId){
        boolean isIdFound=false;
        try {
            for (Shop shop : shops) {
                if (shop.getShopId() == existingShopId) {
                    isIdFound = true;
                    return shop.getName();
                }
            }
            throw new IdNotFoundException("Given Id not found");
        }
        catch(IdNotFoundException infe) {
            System.out.println("Id entered "+existingShopId+" is not found");
            infe.printStackTrace();
        }
        return null;
    }

    @Override
    public Floor getFloorById(int existingShopId){
        boolean isIdFound=false;
        try {
            for (Shop shop : shops) {
                if (shop != null && shop.getShopId() == existingShopId) {
                    isIdFound = true;
                    return shop.getFloor();
                }
            }
            throw new IdNotFoundException("Given Id not found");
        }
        catch(IdNotFoundException infe) {
            System.out.println("Id entered "+existingShopId+" is not found");
            infe.printStackTrace();
        }
        return null;
    }

    @Override
    public double getAreaById(int existingShopId){
        boolean isIdFound=false;
        try {
            for (Shop shop : shops) {
                if (shop != null && shop.getShopId() == existingShopId) {
                    isIdFound = true;
                    return shop.getArea();
                }
            }
            throw new IdNotFoundException("Given Id not found");
        }
        catch (IdNotFoundException infe) {
            System.out.println("Id entered "+existingShopId+" is not found");
            infe.printStackTrace();
        }
        return 0;
    }

    @Override
    public int getNoOfWorkersById(int existingShopId){
        boolean isIdFound=false;
        try {
            for (Shop shop : shops) {
                if (shop != null && shop.getShopId() == existingShopId) {
                    isIdFound = true;
                    return shop.getNoOfWorkers();
                }
            }
            throw new IdNotFoundException("Given id not found");
        }
        catch (IdNotFoundException infe) {
            System.out.println("Id entered is not found");
            infe.printStackTrace();
        }
        return 0;
    }

    @Override
    public String getOwnerById(int existingShopId){
        boolean isIdFound=false;
        try {
            for (Shop shop : shops) {
                if (shop != null && shop.getShopId() == existingShopId) {
                    isIdFound = true;
                    return shop.getOwner();
                }
            }
            throw new IdNotFoundException("Given id not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("Id entered is not found");
            infe.printStackTrace();
            }
        return null;
    }

    @Override
    public Floor getFloorByName(String existingName){
        boolean isIdFound=false;
        try {
            for (Shop shop : shops) {
                if (shop != null && shop.getName().equals(existingName)) {
                    isIdFound = true;
                    return shop.getFloor();
                }
            }
            throw new NameNotFoundException("Given name is not found");
        }
        catch (NameNotFoundException nnfe) {
            System.out.println("Name not found");
            nnfe.printStackTrace();
        }
        return null;

    }

    @Override
    public void deleteShopByOwner(String owner){
        boolean isDeleted=false;
        try {
            for (int i = 0; i < shops.length; i++) {
                if (Objects.equals(shops[i].getOwner(), owner) && shops[i] != null) {
                    for (int j = i; j < shops.length - 1; j++) {
                        shops[j] = shops[j + 1];
                    }
                    shops[shops.length - 1] = null;
                    System.out.println("Shop with owner " + owner + " is deleted \n");
                    isDeleted = true;
                    break;
                }
            }
            if (!isDeleted){
                throw new OwnerNotFoundException("Given owner not found");
            }
        }
        catch (OwnerNotFoundException onfe){
            System.out.println("No Shop with owner " + owner + " is found");
            onfe.printStackTrace();
        }
    }

    @Override
    public void deleteShopById(int id){
        boolean isDeleted=false;
        try {
            for (int i = 0; i < shops.length; i++) {
                if (shops[i].getShopId() == id && shops[i] != null) {
                    for (int j = i; j < shops.length - 1; j++) {
                        shops[j] = shops[j + 1];
                    }
                    shops[shops.length - 1] = null;
                    System.out.println("Shop with id " + id + " is deleted \n");
                    isDeleted = true;
                    break;
                }
            }
            if (!isDeleted){
                throw new IdNotFoundException("Given id is not found");
            }
        }
        catch (IdNotFoundException infe){
            infe.printStackTrace();
            System.out.println("No Shop with id " + id + " is found");
        }
    }

    @Override
    public void getShopById(int existingId){
        Shop shopc=null;
        try {
            for (Shop shop : shops) {
                if (shop.getShopId() == existingId) {
                    shopc = shop;
                    System.out.println("Shop details are:");
                    try {
                        getShopDetails(shop);
                    } catch (ShopNotFoundException snfe) {
                        System.out.println("Shop is not found");
                        snfe.printStackTrace();
                    }
                }
            }
            if(shopc==null) throw new IdNotFoundException("Given Id not found");
        }
        catch (IdNotFoundException infe){
            infe.printStackTrace();
            System.out.println("No Shop with id " + existingId + " is found");
        }
//        return shopc;
    }

    @Override
    public void getShopDetails(Shop shop)throws ShopNotFoundException{
        if (shop != null) {
            System.out.println("Shop ID is: " + shop.getShopId());
            System.out.println("Shop name is: " + shop.getName());
            System.out.println("Shop area is: " + shop.getArea());
            System.out.println("Shop floor is: " + shop.getFloor());
            System.out.println("Shop no of workers is: " + shop.getNoOfWorkers());
            System.out.println("Shop owner is: " + shop.getOwner());
            System.out.println("----------------------------------------------------------");
        }
        else {
            throw new ShopNotFoundException("Shop not found");
        }
    }

    @Override
    public void getShopInfo() {
        System.out.println("Shop details are:");
        for (Shop shop : shops) {
            try {
                if (shop != null) {
                    System.out.println("Shop ID is: " + shop.getShopId());
                    System.out.println("Shop name is: " + shop.getName());
                    System.out.println("Shop area is: " + shop.getArea());
                    System.out.println("Shop floor is: " + shop.getFloor());
                    System.out.println("Shop no of workers is: " + shop.getNoOfWorkers());
                    System.out.println("Shop owner is: " + shop.getOwner());
                    System.out.println("----------------------------------------------------------");
                }
            }
            catch (NullPointerException npe){
                System.out.println("Shop not found");
                npe.printStackTrace();
            }
        }
    }
}
