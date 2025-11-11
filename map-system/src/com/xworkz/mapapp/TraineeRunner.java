package com.xworkz.mapapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TraineeRunner {
    public static void main(String[] args) {
        Map<Integer,String > map=new HashMap<>();
        map.put(1,"Inchara Y S");
        map.put(2,"Harsh");
        map.put(3,"Whiskey");
        map.put(4,"Pannaga");
        map.put(5,"Ramesh");

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
