package com.xworkz.mapapp;

import com.xworkz.mapapp.dto.EmployeeDto;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeRunner {
    public static void main(String[] args) {
        Map<EmployeeDto,Integer> map=new HashMap<>();
        map.put(new EmployeeDto(3,"Inchara","Y S","2025","Female","IT",22,450000,"Mariappanpalya"),1);
        map.put(new EmployeeDto(3,"Inchara","Y S","2025","Female","IT",22,450000,"Mariappanpalya"),2);

        System.out.println(map);

    }
}
