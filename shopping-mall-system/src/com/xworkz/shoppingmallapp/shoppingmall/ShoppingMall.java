package com.xworkz.shoppingmallapp.shoppingmall;

import com.xworkz.shoppingmallapp.ShoppingMallRunner;
import com.xworkz.shoppingmallapp.constants.Floor;
import com.xworkz.shoppingmallapp.shop.Shop;
import com.xworkz.shoppingmallapp.validator.ShopValidator;

import java.util.Objects;

public class ShoppingMall {

    public ShoppingMall(int size){
        this.shops=new Shop[size];
    }

    public Shop[] shops;
    public int index;

    public boolean addShop(Shop shop){
        boolean isShopAdded=false;

        ShopValidator shopValidator=new ShopValidator();
        if(shopValidator.validateShop(shop)){
            shops[index++]=shop;
            isShopAdded=true;
        }
        return isShopAdded;
    }

    public boolean updateNameById(int existingId,String updatedName){
        boolean isNameUpdated=false;
        for(Shop shop:this.shops){
            if(shop.getShopId()==existingId){
                shop.setName(updatedName);
                isNameUpdated=true;
                System.out.println("Name of shop "+shop.getShopId()+" updated to:"+shop.getName());
            }
            if(!isNameUpdated) System.out.println("Shop Id "+existingId+" does not exist");
        }

        return isNameUpdated;
    }

    public boolean updateFloorById(int existingId,Floor updatedFloor){
        boolean isFloorUpdated=false;
        for(Shop shop:this.shops){
            if(shop.getShopId()==existingId){
                shop.setFloor(updatedFloor);
                isFloorUpdated=true;
                System.out.println("Floor of shop "+shop.getShopId()+" updated to:"+shop.getFloor());
            }
            if(!isFloorUpdated) System.out.println("Shop Id "+existingId+" does not exist");
        }

        return isFloorUpdated;
    }

    public boolean updateAreaById(int existingId,double updatedArea){
        boolean isAreaUpdated=false;
        for(Shop shop:this.shops){
            if(shop.getShopId()==existingId){
                shop.setArea(updatedArea);
                isAreaUpdated=true;
                System.out.println("Area of shop "+shop.getShopId()+" updated to:"+shop.getArea());
            }
            if(!isAreaUpdated) System.out.println("Shop Id "+existingId+" does not exist");
        }

        return isAreaUpdated;
    }

    public boolean updateNoOfWorkersById(int existingId,int updatedNoOfWorkers){
        boolean isWorkersUpdated=false;
        for(Shop shop:this.shops){
            if(shop.getShopId()==existingId){
                shop.setNoOfWorkers(updatedNoOfWorkers);
                isWorkersUpdated=true;
                System.out.println("No of workers in shop "+shop.getShopId()+" updated to:"+shop.getNoOfWorkers());
            }
            if(!isWorkersUpdated) System.out.println("Shop Id "+existingId+" does not exist");
        }

        return isWorkersUpdated;
    }

    public boolean updateOwnerById(int existingId,String updatedOwner){
        boolean isOwnerUpdated=false;
        for(Shop shop:this.shops){
            if(shop.getShopId()==existingId){
                shop.setOwner(updatedOwner);
                isOwnerUpdated=true;
                System.out.println("Owner of shop "+shop.getShopId()+" updated to:"+shop.getOwner());
            }
            if(!isOwnerUpdated) System.out.println("Shop Id "+existingId+" does not exist");
        }

        return isOwnerUpdated;
    }

    public String getNameById(int existingShopId){
        boolean isIdFound=false;
        for(Shop shop:shops){
            if(shop.getShopId()==existingShopId){
                isIdFound=true;
                return shop.getName();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    public Floor getFloorById(int existingShopId){
        boolean isIdFound=false;
        for(Shop shop:shops){
            if(shop!=null&&shop.getShopId()==existingShopId){
                isIdFound=true;
                return shop.getFloor();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    public double getAreaById(int existingShopId){
        boolean isIdFound=false;
        for(Shop shop:shops){
            if(shop!=null&&shop.getShopId()==existingShopId){
                isIdFound=true;
                return shop.getArea();
            }
        }
        System.out.println("Id entered is not found");
        return 0;
    }

    public int getNoOfWorkersById(int existingShopId){
        boolean isIdFound=false;
        for(Shop shop:shops){
            if(shop!=null&&shop.getShopId()==existingShopId){
                isIdFound=true;
                return shop.getNoOfWorkers();
            }
        }
        System.out.println("Id entered is not found");
        return 0;
    }

    public String getOwnerById(int existingShopId){
        boolean isIdFound=false;
        for(Shop shop:shops){
            if(shop!=null&&shop.getShopId()==existingShopId){
                isIdFound=true;
                return shop.getOwner();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    public Floor getFloorByName(String existingName){
        boolean isIdFound=false;
        for(Shop shop:shops){
            if(shop!=null&&shop.getName().equals(existingName)){
                isIdFound=true;
                return shop.getFloor();
            }
        }
        System.out.println("Name not found");
        return null;
    }


    public void deleteShopByOwner(String owner){
        boolean isDeleted=false;
        for(int i=0;i<shops.length;i++){
            if(Objects.equals(shops[i].getOwner(), owner) &&shops[i]!=null){
                for (int j=i;j<shops.length-1;j++) {
                    shops[j]=shops[j+1];
                }
                shops[shops.length - 1] = null;
                System.out.println("Shop with owner "+owner+" is deleted \n");
                isDeleted=true;
                break;
            }
        }
        if(!isDeleted) System.out.println("No Shop with owner "+owner+" is found");
    }

    public void deleteShopById(int id){
        boolean isDeleted=false;
        for(int i=0;i<shops.length;i++){
            if(shops[i].getShopId()==id&&shops[i]!=null){
                for (int j=i;j<shops.length-1;j++) {
                    shops[j]=shops[j+1];
                }
                shops[shops.length - 1] = null;
                System.out.println("Shop with id "+id+" is deleted \n");
                isDeleted=true;
                break;
            }
        }
        if(!isDeleted) System.out.println("No Shop with id "+id+" is found");
    }

    public Shop getShopById(int existingId){
        Shop shopc=null;
        for(Shop shop:shops){
            if(shop.getShopId()==existingId){
                shopc=shop;
                System.out.println("Shop details are:");
                getShopDetails(shop);
            }
        }
        return shopc;
    }

    public void getShopDetails(Shop shop){
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
            System.out.println("Shop not found");
            System.out.println("----------------------------------------------------------");
        }
    }

    public void getShopInfo() {
        System.out.println("Shop details are:");
        for (Shop shop : shops) {
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
                System.out.println("Shop not found");
                System.out.println("----------------------------------------------------------");
            }
        }
    }
}
