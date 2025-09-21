package com.xworkz.watchapp.impl;

import com.xworkz.watchapp.constants.HasValidity;
import com.xworkz.watchapp.constants.IsWaterResistant;
import com.xworkz.watchapp.validator.WatchValidator;
import com.xworkz.watchapp.watch.Watch;
import com.xworkz.watchapp.constants.Type;
import com.xworkz.watchapp.watchshop.WatchShopRules;

import java.util.Objects;

public class WatchShopImpl implements WatchShopRules {

    public WatchShopImpl(int size){
        this.watches=new Watch[size];
    }

    public Watch[] watches;
    public int index;

    @Override
    public boolean addWatch(Watch watch){
        boolean isWatchAdded=false;

        WatchValidator watchValidator=new WatchValidator();
        if(watchValidator.validateWatch(watch)){
            isWatchAdded=true;
            watches[index++]=watch;
        }
        return isWatchAdded;
    }

    @Override
    public boolean updatePriceById(int existingId,double updatedPrice){
        boolean isPriceUpdated=false;
        for(Watch watch:this.watches){
            if(watch.getWatchId()==existingId){
                watch.setPrice(updatedPrice);
                isPriceUpdated=true;
                System.out.println("Price of watch "+watch.getWatchId()+" updated to:"+watch.getPrice());
            }
            if(!isPriceUpdated) System.out.println("Watch Id "+existingId+" does not exist");
        }

        return isPriceUpdated;
    }

    @Override
    public boolean updateColorById(int existingId,String updatedColor){
        boolean isColorUpdated=false;
        for(Watch watch:this.watches){
            if(watch.getWatchId()==existingId){
                watch.setColor(updatedColor);
                isColorUpdated=true;
                System.out.println("Color of watch "+watch.getWatchId()+" updated to:"+watch.getColor());
            }
            if(!isColorUpdated) System.out.println("Watch Id "+existingId+" does not exist");
        }

        return isColorUpdated;
    }

    @Override
    public boolean updateBrandById(int existingId,String updatedBrand){
        boolean isBrandUpdated=false;
        for(Watch watch:this.watches){
            if(watch.getWatchId()==existingId){
                watch.setBrand(updatedBrand);
                isBrandUpdated=true;
                System.out.println("Brand of watch "+watch.getWatchId()+" updated to:"+watch.getBrand());
            }
            if(!isBrandUpdated) System.out.println("Watch Id "+existingId+" does not exist");
        }

        return isBrandUpdated;
    }

    @Override
    public boolean updateValidityById(int existingId, HasValidity updatedValidity){
        boolean isValidityUpdated=false;
        for(Watch watch:this.watches){
            if(watch.getWatchId()==existingId){
                watch.setHasValidity(updatedValidity);
                isValidityUpdated=true;
                System.out.println("Validity of watch "+watch.getWatchId()+" updated to:"+watch.getHasValidity());
            }
            if(!isValidityUpdated) System.out.println("Watch Id "+existingId+" does not exist");
        }

        return isValidityUpdated;
    }

    @Override
    public boolean updateTypeById(int existingId, Type updatedType){
        boolean isTypeUpdated=false;
        for(Watch watch:this.watches){
            if(watch.getWatchId()==existingId){
                watch.setType(updatedType);
                isTypeUpdated=true;
                System.out.println("Type of watch "+watch.getWatchId()+" updated to:"+watch.getType());
            }
            if(!isTypeUpdated) System.out.println("Watch Id "+existingId+" does not exist");
        }

        return isTypeUpdated;
    }

    @Override
    public boolean updateWaterResistantById(int existingId, IsWaterResistant updatedWaterResistant){
        boolean isWaterResistantUpdated=false;
        for(Watch watch:this.watches){
            if(watch.getWatchId()==existingId){
                watch.setIsWaterResistant(updatedWaterResistant);
                isWaterResistantUpdated=true;
                System.out.println("Water resistant status of watch "+watch.getWatchId()+" updated to:"+watch.getIsWaterResistant());
            }
            if(!isWaterResistantUpdated) System.out.println("Watch Id "+existingId+" does not exist");
        }

        return isWaterResistantUpdated;
    }

    @Override
    public double getPriceById(int existingWatchId){
        boolean isIdFound=false;
        for(Watch watch:watches){
            if(watch!=null&&watch.getWatchId()==existingWatchId){
                isIdFound=true;
                return watch.getPrice();
            }
        }
        System.out.println("Id entered is not found");
        return 0;
    }

    @Override
    public String getColorById(int existingWatchId){
        boolean isIdFound=false;
        for(Watch watch:watches){
            if(watch!=null&&watch.getWatchId()==existingWatchId){
                isIdFound=true;
                return watch.getColor();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    @Override
    public String getBrandById(int existingWatchId){
        boolean isIdFound=false;
        for(Watch watch:watches){
            if(watch!=null&&watch.getWatchId()==existingWatchId){
                isIdFound=true;
                return watch.getBrand();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    @Override
    public HasValidity getValidityById(int existingWatchId){
        boolean isIdFound=false;
        for(Watch watch:watches){
            if(watch!=null&&watch.getWatchId()==existingWatchId){
                isIdFound=true;
                return watch.getHasValidity();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    @Override
    public Type getTypeById(int existingWatchId){
        boolean isIdFound=false;
        for(Watch watch:watches){
            if(watch!=null&&watch.getWatchId()==existingWatchId){
                isIdFound=true;
                return watch.getType();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    @Override
    public IsWaterResistant getWaterResistantById(int existingWatchId){
        boolean isIdFound=false;
        for(Watch watch:watches){
            if(watch!=null&&watch.getWatchId()==existingWatchId){
                isIdFound=true;
                return watch.getIsWaterResistant();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    @Override
    public String getBrandByColor(String existingColor){
        boolean isIdFound=false;
        for(Watch watch:watches){
            if(watch!=null&&watch.getColor().equals(existingColor)){
                isIdFound=true;
                return watch.getBrand();
            }
        }
        System.out.println("Color not found");
        return null;
    }


    @Override
    public void deleteWatchByType(Type type){
        boolean isDeleted=false;
        for(int i=0;i<watches.length;i++){
            if(Objects.equals(watches[i].getType().toString(), type) &&watches[i]!=null){
                for (int j=i;j<watches.length-1;j++) {
                    watches[j]=watches[j+1];
                }
                watches[watches.length - 1] = null;
                System.out.println("Watch with type "+type+" is deleted \n");
                isDeleted=true;
                break;
            }
        }
        if(!isDeleted) System.out.println("No watch with type "+type+" is found");
    }

    @Override
    public void deleteWatchById(int id){
        boolean isDeleted=false;
        for(int i=0;i<watches.length;i++){
            if(watches[i].getWatchId()==id&&watches[i]!=null){
                for (int j=i;j<watches.length-1;j++) {
                    watches[j]=watches[j+1];
                }
                watches[watches.length - 1] = null;
                System.out.println("Watch with id "+id+" is deleted \n");
                isDeleted=true;
                break;
            }
        }
        if(!isDeleted) System.out.println("No watch with id "+id+" is found");
    }

    @Override
    public Watch getWatchById(int existingId){
        Watch watchc=null;
        for(Watch watch:watches){
            if(watch.getWatchId()==existingId){
                watchc=watch;
                System.out.println("Watch details are:");
                getWatchDetails(watch);
            }
        }
        return watchc;
    }

    @Override
    public void getWatchDetails(Watch watch){
        if (watch != null) {
            System.out.println("Watch ID is: " + watch.getWatchId());
            System.out.println("Watch type is: " + watch.getType());
            System.out.println("Watch color is: " + watch.getColor());
            System.out.println("Watch brand is: " + watch.getBrand());
            System.out.println("Watch price is: " + watch.getPrice());
            System.out.println("Watch has validity?: " + watch.getHasValidity());
            System.out.println("Watch is water resistant?: " + watch.getIsWaterResistant());
            System.out.println("----------------------------------------------------------------");
        }
        else {
            System.out.println("No watch found");
            System.out.println("----------------------------------------------------------------");
        }
    }

    @Override
    public void getWatchInfo() {
        System.out.println("Watch details are:");
        for (Watch watch : watches) {
            System.out.println("Watch details are:");
            if (watch != null) {
                System.out.println("Watch ID is: " + watch.getWatchId());
                System.out.println("Watch type is: " + watch.getType());
                System.out.println("Watch color is: " + watch.getColor());
                System.out.println("Watch brand is: " + watch.getBrand());
                System.out.println("Watch price is: " + watch.getPrice());
                System.out.println("Watch has validity?: " + watch.getHasValidity());
                System.out.println("Watch is water resistant?: " + watch.getIsWaterResistant());
                System.out.println("----------------------------------------------------------------");
            }
            else {
                System.out.println("No watch found");
                System.out.println("----------------------------------------------------------------");
            }
        }
    }
}
