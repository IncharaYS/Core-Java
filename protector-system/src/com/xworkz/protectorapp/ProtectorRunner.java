package com.xworkz.protectorapp;

import com.xworkz.protectorapp.protector.Protector;
import com.xworkz.protectorapp.soldier.Soldier;

import java.net.SocketImpl;

public class ProtectorRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Protector protector=new Soldier();
        protector.protector();
        System.out.println("main ended");
    }
}
