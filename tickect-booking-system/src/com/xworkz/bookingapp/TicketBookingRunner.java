package com.xworkz.bookingapp;

import com.xworkz.bookingapp.bookmyshow.BookMyShow;
import com.xworkz.bookingapp.impl.NavarangImpl;

public class TicketBookingRunner {
    public static void main(String[] args) {
        BookMyShow bookMyShow=new NavarangImpl();
        bookMyShow.bookTicket();
        bookMyShow.cancelTicket();
        bookMyShow.getTicketInfo();
    }
}
