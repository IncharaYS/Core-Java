package com.xworkz.airlineapp;

import com.xworkz.airlineapp.airline.Airlines;
import com.xworkz.airlineapp.impl.AirIndiaImpl;

public class AirlineRunner {
    public static void main(String[] args) {
        Airlines airlines=new AirIndiaImpl();
        airlines.bookTicket();
        airlines.cancelTicket();
        airlines.checkIn();
    }
}
