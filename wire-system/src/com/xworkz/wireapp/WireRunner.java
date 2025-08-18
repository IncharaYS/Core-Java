package com.xworkz.wireapp;

import com.xworkz.wireapp.wire.Wire;

public class WireRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Wire wire1=new Wire();
        wire1.setWireId(1);
        wire1.setBrand("Hevells");
        wire1.setColor("Black");
        wire1.setLength(40);
        wire1.setPrice(50.00);

        System.out.println("Wire ID is: "+wire1.getWireId());
        System.out.println("Wire brand is: "+wire1.getBrand());
        System.out.println("Wire color is: "+wire1.getColor());
        System.out.println("Wire length is: "+wire1.getLength());
        System.out.println("Wire price is: "+wire1.getPrice());

        System.out.println("main ended");
    }
}
