package com.xworkz.mapapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ProductRunner {
    public static void main(String[] args) {
        Map<Integer,String > map=new HashMap<>();
        map.put(1,"Broom");
        map.put(2,"Chair");
        map.put(3,"Light");
        map.put(4,"Realme P3 pro");
        map.put(5,"Laptop");

        System.out.println(map);
        System.out.println();

        map.forEach((key,value)-> System.out.println("Key:"+key+" Value:"+value));
        System.out.println();

        Set<Map.Entry<Integer,String>> entries=map.entrySet();
        for(Map.Entry<Integer,String> entry:entries){
            System.out.println(entry);
        }
        System.out.println();

        Iterator<Map.Entry<Integer,String>> itr=entries.iterator();
        while(itr.hasNext()){
            Map.Entry<Integer,String> entry=itr.next();
            System.out.println("Key:"+entry.getKey()+" Value:"+entry.getValue());
        }
        System.out.println();
    }
}
