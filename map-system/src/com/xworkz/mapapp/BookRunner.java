package com.xworkz.mapapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BookRunner {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Love hypothesis");
        map.put(2,"Hunting Adaline");
        map.put(3,"Twisted Love");
        map.put(4,"Shatter Ma");
        map.put(5,"Wimpy kid");

        System.out.println(map);
        System.out.println();

        map.forEach((key,value)-> System.out.println("Key:"+key+" Value:"+value));
        System.out.println();

        Set<Map.Entry<Integer,String >> entries=map.entrySet();
        for (Map.Entry<Integer,String> entry:entries){
            System.out.println(entry);
        }
        System.out.println();

        Iterator<Map.Entry<Integer,String>> itr=entries.iterator();
        while (itr.hasNext()){
            Map.Entry<Integer,String> entry=itr.next();
            System.out.println("Key:"+entry.getKey()+" Value:"+entry.getKey());
        }
        System.out.println();
    }
}
