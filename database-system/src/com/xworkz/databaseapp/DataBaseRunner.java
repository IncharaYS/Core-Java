package com.xworkz.databaseapp;

import com.xworkz.databaseapp.database.DataBase;
import com.xworkz.databaseapp.impl.MySqlImpl;

public class DataBaseRunner {
    public static void main(String[] args) {
        DataBase dataBase=new MySqlImpl();
        dataBase.connect();
        dataBase.query();
        dataBase.disconnect();
    }
}
