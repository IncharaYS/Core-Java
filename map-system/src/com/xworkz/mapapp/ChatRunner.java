package com.xworkz.mapapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ChatRunner {
    public static void main(String[] args) {
        Map<String,Double> map=new HashMap<>();
        map.put("Masalapuri", 35.0);
        map.put("Panipuri", 35.0);
        map.put("Bhelpuri", 30.0);
        map.put("Papad chat", 30.0);
        map.put("Gobi", 35.0);

        System.out.println(map);
        System.out.println();

        map.forEach((key,value)-> System.out.println("Key:"+key+" Value:"+value));
        System.out.println();

        Set<Map.Entry<String,Double>> entries=map.entrySet();
        for (Map.Entry<String,Double> entry:entries){
            System.out.println(entry);
        }
        System.out.println();

        Set<Map.Entry<String,Double>> entriess=map.entrySet();
        Iterator<Map.Entry<String,Double>> itr=entriess.iterator();
        while (itr.hasNext()){
            Map.Entry<String,Double> entry=itr.next();
            System.out.println("Key:"+entry.getKey()+" Value:"+entry.getValue());
        }
        System.out.println();
    }
}
