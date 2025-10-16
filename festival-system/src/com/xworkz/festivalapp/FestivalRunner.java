package com.xworkz.festivalapp;

import com.xworkz.festivalapp.festival.Festival;
import java.util.ArrayList;
import java.util.List;

public class FestivalRunner {
    public static void main(String[] args) {
        List<Festival> festivalList=new ArrayList<>();

        festivalList.add(new Festival("Diwali","India","November",5,"Festival of Lights",true));
        festivalList.add(new Festival("Christmas","USA","December",2,"Birth of Jesus Christ",true));
        festivalList.add(new Festival("Eid al-Fitr","Saudi Arabia","April",3,"End of Ramadan",true));
        festivalList.add(new Festival("Holi","India","March",2,"Festival of Colors",true));
        festivalList.add(new Festival("Oktoberfest","Germany","September",16,"Beer Festival",false));
        festivalList.add(new Festival("Chinese New Year","China","February",7,"Lunar New Year Celebration",true));
        festivalList.add(new Festival("Thanksgiving","USA","November",1,"Harvest Celebration",true));
        festivalList.add(new Festival("Baisakhi","India","April",1,"Harvest Festival of Punjab",false));
        festivalList.add(new Festival("Navratri","India","October",9,"Worship of Goddess Durga",false));
        festivalList.add(new Festival("Ganesh Chaturthi","India","September",10,"Festival of Lord Ganesha",false));

        System.out.println("Festival list 1:");
        for(Festival festival:festivalList){
            System.out.println(festival);
        }
        System.out.println();

        List<Festival> festivalList2=new ArrayList<>();

        festivalList2.add(new Festival("Onam","India","August",10,"Harvest Festival of Kerala",false));
        festivalList2.add(new Festival("Pongal","India","January",4,"Harvest Festival of Tamil Nadu",false));
        festivalList2.add(new Festival("Raksha Bandhan","India","August",1,"Celebration of Sibling Bond",false));
        festivalList2.add(new Festival("Karva Chauth","India","November",1,"Fast for Husband’s Long Life",false));
        festivalList2.add(new Festival("Durga Puja","India","October",5,"Worship of Goddess Durga",true));
        festivalList2.add(new Festival("Ram Navami","India","April",1,"Birth of Lord Rama",false));
        festivalList2.add(new Festival("Janmashtami","India","August",2,"Birth of Lord Krishna",false));
        festivalList2.add(new Festival("Easter","USA","April",1,"Resurrection of Jesus Christ",true));
        festivalList2.add(new Festival("Lohri","India","January",1,"Winter Harvest Festival",false));
        festivalList2.add(new Festival("Bihu","India","April",3,"Assamese Harvest Festival",false));

        System.out.println("Festival list 2:");
        for(Festival festival:festivalList2){
            System.out.println(festival);
        }
        System.out.println();

        festivalList.addAll(festivalList2);
        System.out.println("Festival list:");
        for(Festival festival:festivalList){
            System.out.println(festival);
        }
        System.out.println();

        Festival festival1=new Festival("Holi","India","March",2,"Festival of Colors",true);
        Festival festival2=new Festival("Maha Shivaratri","India","February",1,"Night of Lord Shiva",false);
        festivalList.add(4,festival2);

        System.out.println("Does list contain festival1:"+festivalList.contains(festival1));
        System.out.println("Does list contain festivalList2:"+festivalList.containsAll(festivalList2));
        System.out.println();

        festivalList.remove(festival1);
        festivalList.remove(7);

        System.out.println("Festival list after remove(Object) and remove(index):");
        for(Festival festival:festivalList){
            System.out.println(festival);
        }
        System.out.println();

        festivalList.removeAll(festivalList2);
        System.out.println("Festival list after removing festivalList2:");
        for(Festival festival:festivalList){
            System.out.println(festival);
        }
        System.out.println();

        System.out.println("Does list contain festival1:"+festivalList.contains(festival1));
        System.out.println("Does list contain festivalList2:"+festivalList.containsAll(festivalList2));
        System.out.println();

        festivalList.addAll(festivalList2);
        festivalList.retainAll(festivalList2);

        System.out.println("Festival list after retaining only festivalList2:");
        for(Festival festival:festivalList){
            System.out.println(festival);
        }
        System.out.println();
    }
}
