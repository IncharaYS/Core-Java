package com.xworkz.furnitureapp.table;

import com.xworkz.furnitureapp.furniture.Furniture;

public class Table extends Furniture
{
    @Override public void furniture (){
        System.out.println("Child method invoked");
    }
}
