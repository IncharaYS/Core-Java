package com.xworkz.postofficeapp;

import com.xworkz.postofficeapp.impl.CityPostOfficeImpl;
import com.xworkz.postofficeapp.postoffice.PostOffice;

public class PostOfficeRunner {
    public static void main(String[] args) {
        PostOffice postOffice=new CityPostOfficeImpl();
        postOffice.manageMailbox();
        postOffice.receiveParcel();
        postOffice.sendLetter();
    }
}
