package com.xworkz.hotelapp.shanthisagar;

import com.xworkz.hotelapp.impl.Hotel;

public class ShanthiSagar implements Hotel {
    @Override
    public void bookRoom() {
        System.out.println("Room booking");
    }

    @Override
    public void checkIn() {
        System.out.println("Check in into room");
    }

    @Override
    public void checkOut() {
        System.out.println("Check out of room");
    }
}
