package com.xworkz.farmapp.impl;

import com.xworkz.farmapp.farm.Farm;

public class OrganicFarmIml implements Farm {
    @Override
    public void cultivate() {
        System.out.println("Cultivate crops in the farm organically");
    }

    @Override
    public void harvest() {
        System.out.println("Harvest crops");
    }

    @Override
    public void sellProduce() {
        System.out.println("Sell produce");
    }
}
