package com.xworkz.pharmacyapp;

import com.xworkz.pharmacyapp.impl.LakshmiMedicalsImpl;
import com.xworkz.pharmacyapp.pharmacy.Pharmacy;

public class PharmacyRunner {
    public static void main(String[] args) {
        Pharmacy pharmacy=new LakshmiMedicalsImpl();
        pharmacy.checkStock();
        pharmacy.orderSupplies();
        pharmacy.sellMedicine();
    }
}
