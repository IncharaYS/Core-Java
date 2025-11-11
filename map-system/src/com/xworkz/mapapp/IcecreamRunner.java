package com.xworkz.mapapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IcecreamRunner {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Vanilla");
        map.put(2,"Chocolate");
        map.put(3,"Strawberry");
        map.put(4,"Mint");
        map.put(5,"Butterscotch");
        map.put(6,"Pineapple");

        System.out.println(map);
        System.out.println();

        map.forEach((key,value)-> System.out.println("Key:"+key+" Value"+value));
        System.out.println();

        Set<Map.Entry<Integer,String>> entrys=map.entrySet();
        for(Map.Entry<Integer,String> entry:entrys){
            System.out.println(entry);
        }
        System.out.println();

        Set<Map.Entry<Integer,String>> entries=map.entrySet();
        Iterator<Map.Entry<Integer,String>> itr=entries.iterator();
        while (itr.hasNext()){
            Map.Entry<Integer,String> entry=itr.next();
            System.out.println("Key:"+entry.getKey()+" Value:"+entry.getValue());
        }
    }
}
