package com.xworkz.farmapp;

import com.xworkz.farmapp.farm.Farm;
import com.xworkz.farmapp.impl.OrganicFarmIml;

public class FarmRunner {
    public static void main(String[] args) {
        Farm farm=new OrganicFarmIml();
        farm.cultivate();
        farm.harvest();
        farm.sellProduce();
    }
}
