package com.xworkz.hotelapp;

import com.xworkz.hotelapp.impl.Hotel;
import com.xworkz.hotelapp.shanthisagar.ShanthiSagar;

public class HotelRunner {
    public static void main(String[] args) {
        Hotel hotel=new ShanthiSagar();
        hotel.bookRoom();
        hotel.checkIn();
        hotel.checkOut();
    }
}
