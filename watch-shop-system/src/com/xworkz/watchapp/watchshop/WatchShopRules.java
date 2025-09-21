package com.xworkz.watchapp.watchshop;

import com.xworkz.watchapp.constants.HasValidity;
import com.xworkz.watchapp.constants.IsWaterResistant;
import com.xworkz.watchapp.constants.Type;
import com.xworkz.watchapp.watch.Watch;

public interface WatchShopRules {
    boolean addWatch(Watch watch);
    boolean updatePriceById(int existingId,double updatedPrice);
    boolean updateColorById(int existingId,String updatedColor);
    boolean updateBrandById(int existingId,String updatedBrand);
    boolean updateValidityById(int existingId, HasValidity updatedValidity);
    boolean updateTypeById(int existingId, Type updatedType);
    boolean updateWaterResistantById(int existingId, IsWaterResistant updatedWaterResistant);
    double getPriceById(int existingWatchId);
    String getColorById(int existingWatchId);
    String getBrandById(int existingWatchId);
    HasValidity getValidityById(int existingWatchId);
    Type getTypeById(int existingWatchId);
    IsWaterResistant getWaterResistantById(int existingWatchId);
    String getBrandByColor(String existingColor);
    void deleteWatchByType(Type type);
    void deleteWatchById(int id);
    Watch getWatchById(int existingId);
    void getWatchDetails(Watch watch);
    void getWatchInfo();
}
