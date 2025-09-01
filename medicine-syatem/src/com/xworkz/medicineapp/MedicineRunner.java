package com.xworkz.medicineapp;

import com.xworkz.medicineapp.dolo.Dolo;
import com.xworkz.medicineapp.medicine.Medicine;

public class MedicineRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Medicine medicine=new Dolo();
        medicine.medicine();
        System.out.println("main ended");
    }
}
