package com.xworkz.radioapp;

import com.xworkz.radioapp.radio.Radio;

public class RadioRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Radio radio1=new Radio();
        radio1.setRadioId(1);
        radio1.setIsOn(true);
        radio1.setIsWireless(true);
        radio1.setPrice(4500.00);
        radio1.setRange(300);

        System.out.println("Radio Id is: "+radio1.getRadioId());
        System.out.println("Radio is ON?: "+radio1.getIsOn());
        System.out.println("Radio is wireless?: "+radio1.getIsWireless());
        System.out.println("Radio price is: "+radio1.getPrice());
        System.out.println("Radio range is: "+radio1.getRange()+" m");

        System.out.println("main ended");
    }
}
