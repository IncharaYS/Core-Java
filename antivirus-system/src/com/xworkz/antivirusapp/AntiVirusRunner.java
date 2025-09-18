package com.xworkz.antivirusapp;

import com.xworkz.antivirusapp.antivirus.AntiVirus;
import com.xworkz.antivirusapp.impl.NortonImpl;

public class AntiVirusRunner {
    public static void main(String[] args) {
        AntiVirus antiVirus=new NortonImpl();
        antiVirus.scan();
        antiVirus.removeThreats();
        antiVirus.update();
    }
}
