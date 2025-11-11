package com.xworkz.mapapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapRunner {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Baba");
        map.put(2,"Babi");
        map.put(3,"Babu");
        map.put(4,"Inchara");
        map.put(5,"Harsha");
        map.put(6,"Whiskey");

        System.out.println(map);
        System.out.println();


        map.forEach((key,value)->{
            System.out.print("Key:"+key);
            System.out.println(" Value:"+value);
        });
        System.out.println();


        Set<Map.Entry<Integer,String>> entries=map.entrySet();
        for (Map.Entry<Integer,String> entry:entries){
            System.out.println(entry);
        }
        System.out.println();

        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry);
        }
        System.out.println();

        Iterator<Map.Entry<Integer,String>> itr=entries.iterator();
        while (itr.hasNext()){
            Map.Entry<Integer,String> entry=itr.next();
            System.out.print("Key:"+entry.getKey());
            System.out.println(" Value:"+entry.getKey());
        }



    }
}
