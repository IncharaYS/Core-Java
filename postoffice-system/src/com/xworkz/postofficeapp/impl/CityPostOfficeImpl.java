package com.xworkz.postofficeapp.impl;

import com.xworkz.postofficeapp.postoffice.PostOffice;


public class CityPostOfficeImpl implements PostOffice {
    @Override
    public void sendLetter() {
        System.out.println("Send letter through city post office");
    }

    @Override
    public void receiveParcel() {
        System.out.println("Receive letter through city post office");
    }

    @Override
    public void manageMailbox() {
        System.out.println("Manage main box at city post office");
    }
}
