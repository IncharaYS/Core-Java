package com.xworkz.pharmacyapp.impl;

import com.xworkz.pharmacyapp.pharmacy.Pharmacy;

public class LakshmiMedicalsImpl implements Pharmacy {
    @Override
    public void sellMedicine() {
        System.out.println("Selling medicines at Lakshmi medicals");
    }

    @Override
    public void checkStock() {
        System.out.println("Checking stocks at Lakshmi medicals");
    }

    @Override
    public void orderSupplies() {
        System.out.println("ordering supplies at Lakshmi medicals");
    }
}
