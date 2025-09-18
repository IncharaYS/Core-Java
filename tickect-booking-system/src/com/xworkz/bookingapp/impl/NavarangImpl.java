package com.xworkz.bookingapp.impl;

import com.xworkz.bookingapp.bookmyshow.BookMyShow;

public class NavarangImpl implements BookMyShow {
    @Override
    public void bookTicket() {
        System.out.println("Book ticket at navarang theatre");
    }

    @Override
    public void cancelTicket() {
        System.out.println("Cancel booked ticket");
    }

    @Override
    public void getTicketInfo() {
        System.out.println("Ticked info fetched");
    }
}
