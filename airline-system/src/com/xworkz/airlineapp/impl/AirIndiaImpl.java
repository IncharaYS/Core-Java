package com.xworkz.airlineapp.impl;

import com.xworkz.airlineapp.airline.Airlines;

public class AirIndiaImpl implements Airlines {
    @Override
    public void bookTicket() {
        System.out.println("Ticket booking");
    }

    @Override
    public void cancelTicket() {
        System.out.println("Ticket calculation");
    }

    @Override
    public void checkIn() {
        System.out.println("CheckIn");
    }
}
