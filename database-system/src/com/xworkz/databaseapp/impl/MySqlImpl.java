package com.xworkz.databaseapp.impl;

import com.xworkz.databaseapp.database.DataBase;

public class MySqlImpl implements DataBase {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL");
    }

    @Override
    public void query() {
        System.out.println("Execute MySQL queries");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected to MySQL");
    }
}
