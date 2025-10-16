package com.xworkz.mobileapp;

import com.xworkz.mobileapp.mobile.Mobile;
import java.util.ArrayList;
import java.util.List;

public class MobileRunner {
    public static void main(String[] args) {
        List<Mobile> mobileList = new ArrayList<>();

        mobileList.add(new Mobile("1","Apple","iPhone 15",120000.0,256,true));
        mobileList.add(new Mobile("2","Samsung","Galaxy S23",90000.0,256,true));
        mobileList.add(new Mobile("3","OnePlus","11R",45000.0,128,true));
        mobileList.add(new Mobile("4","Xiaomi","Mi 13",40000.0,256,true));
        mobileList.add(new Mobile("5","Realme","GT Neo 3",35000.0,128,true));
        mobileList.add(new Mobile("6","Vivo","X90",60000.0,256,true));
        mobileList.add(new Mobile("7","Oppo","Reno 10",38000.0,128,true));
        mobileList.add(new Mobile("8","Motorola","Edge 40",32000.0,256,true));
        mobileList.add(new Mobile("9","Google","Pixel 8",85000.0,256,true));
        mobileList.add(new Mobile("10","Nothing","Phone 2",45000.0,256,true));

        System.out.println("Mobile list 1:");
        for(Mobile mobile:mobileList){
            System.out.println(mobile);
        }
        System.out.println();
        System.out.println("Size of Mobile list 1:"+mobileList.size());

        List<Mobile> mobileList2 = new ArrayList<>();

        mobileList2.add(new Mobile("11","Asus","ROG Phone 7",80000.0,512,true));
        mobileList2.add(new Mobile("12","Apple","iPhone 14",100000.0,128,true));
        mobileList2.add(new Mobile("13","Samsung","Galaxy A54",35000.0,128,true));
        mobileList2.add(new Mobile("14","OnePlus","Nord 3",33000.0,256,true));
        mobileList2.add(new Mobile("15","Poco","F5",30000.0,256,true));
        mobileList2.add(new Mobile("16","Redmi","Note 12 Pro",25000.0,128,true));
        mobileList2.add(new Mobile("17","Realme","11 Pro+",28000.0,256,true));
        mobileList2.add(new Mobile("18","iQOO","Neo 7",31000.0,256,true));
        mobileList2.add(new Mobile("19","Samsung","M14",15000.0,128,false));
        mobileList2.add(new Mobile("20","Lava","Agni 2",22000.0,256,true));

        System.out.println("Mobile list 2:");
        for(Mobile mobile:mobileList2){
            System.out.println(mobile);
        }
        System.out.println();
        System.out.println("Size of Mobile list 2:"+mobileList2.size());

        mobileList.addAll(mobileList2);
        System.out.println("Full mobile list:");
        for(Mobile mobile:mobileList){
            System.out.println(mobile);
        }
        System.out.println();

        Mobile mobile1 = new Mobile("6","Vivo","X90",60000.0,256,true);
        Mobile mobile2 = new Mobile("21","Apple","iPhone 15 Pro Max",160000.0,512,true);
        mobileList.add(4,mobile2);

        System.out.println("Does list contain mobile1:"+mobileList.contains(mobile1));
        System.out.println("Does list contain mobileList2:"+mobileList.containsAll(mobileList2));
        System.out.println();

        mobileList.remove(mobile1);
        mobileList.remove(7);

        System.out.println("Mobile list after remove(Object) and remove(index):");
        for(Mobile mobile:mobileList){
            System.out.println(mobile);
        }
        System.out.println();

        mobileList.removeAll(mobileList2);
        System.out.println("Mobile list after removing mobileList2:");
        for(Mobile mobile:mobileList){
            System.out.println(mobile);
        }
        System.out.println();

        System.out.println("Does list contain mobile1:"+mobileList.contains(mobile1));
        System.out.println("Does list contain mobileList2:"+mobileList.containsAll(mobileList2));
        System.out.println();

        mobileList.addAll(mobileList2);
        mobileList.retainAll(mobileList2);

        System.out.println("Mobile list after retaining only mobileList2:");
        for(Mobile mobile:mobileList){
            System.out.println(mobile);
        }
        System.out.println();
    }
}
