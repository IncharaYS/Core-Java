package com.xworkz.universityapp;

import com.xworkz.universityapp.university.University;
import java.util.ArrayList;
import java.util.List;

public class UniversityRunner {
    public static void main(String[] args) {
        List<University> universityList = new ArrayList<>();

        universityList.add(new University("U001","Oxford University","Oxford, UK",1096,50,24000));
        universityList.add(new University("U002","Harvard University","Cambridge, USA",1636,60,21000));
        universityList.add(new University("U003","Stanford University","Stanford, USA",1885,70,17000));
        universityList.add(new University("U004","MIT","Cambridge, USA",1861,45,11500));
        universityList.add(new University("U005","University of Cambridge","Cambridge, UK",1209,65,19000));
        universityList.add(new University("U006","Yale University","New Haven, USA",1701,55,12500));
        universityList.add(new University("U007","Princeton University","Princeton, USA",1746,40,8200));
        universityList.add(new University("U008","Columbia University","New York, USA",1754,75,33000));
        universityList.add(new University("U009","University of Chicago","Chicago, USA",1890,50,16000));
        universityList.add(new University("U010","University of Toronto","Toronto, Canada",1827,80,65000));

        System.out.println("University list 1:");
        for(University university:universityList){
            System.out.println(university);
        }
        System.out.println();
        System.out.println("Size of University list 1:"+universityList.size());

        List<University> universityList2 = new ArrayList<>();

        universityList2.add(new University("U011","National University of Singapore","Singapore",1905,45,38000));
        universityList2.add(new University("U012","Australian National University","Canberra, Australia",1946,35,25000));
        universityList2.add(new University("U013","University of Tokyo","Tokyo, Japan",1877,60,28000));
        universityList2.add(new University("U014","Peking University","Beijing, China",1898,70,42000));
        universityList2.add(new University("U015","University of Melbourne","Melbourne, Australia",1853,50,52000));
        universityList2.add(new University("U016","University of Hong Kong","Hong Kong",1911,45,31000));
        universityList2.add(new University("U017","Seoul National University","Seoul, South Korea",1946,65,28000));
        universityList2.add(new University("U018","ETH Zurich","Zurich, Switzerland",1855,30,22000));
        universityList2.add(new University("U019","University of Edinburgh","Edinburgh, UK",1583,60,36000));
        universityList2.add(new University("U020","University of British Columbia","Vancouver, Canada",1908,75,67000));

        System.out.println("University list 2:");
        for(University university:universityList2){
            System.out.println(university);
        }
        System.out.println();
        System.out.println("Size of University list 2:"+universityList2.size());

        universityList.addAll(universityList2);
        System.out.println("Full university list:");
        for(University university:universityList){
            System.out.println(university);
        }
        System.out.println();

        University university1 = new University("U006","Yale University","New Haven, USA",1701,55,12500);
        University university2 = new University("U021","University of Delhi","Delhi, India",1922,90,65000);
        universityList.add(4,university2);

        System.out.println("Does list contain university1:"+universityList.contains(university1));
        System.out.println("Does list contain universityList2:"+universityList.containsAll(universityList2));
        System.out.println();

        universityList.remove(university1);
        universityList.remove(7);

        System.out.println("University list after remove(Object) and remove(index):");
        for(University university:universityList){
            System.out.println(university);
        }
        System.out.println();

        universityList.removeAll(universityList2);
        System.out.println("University list after removing universityList2:");
        for(University university:universityList){
            System.out.println(university);
        }
        System.out.println();

        System.out.println("Does list contain university1:"+universityList.contains(university1));
        System.out.println("Does list contain universityList2:"+universityList.containsAll(universityList2));
        System.out.println();

        universityList.addAll(universityList2);
        universityList.retainAll(universityList2);

        System.out.println("University list after retaining only universityList2:");
        for(University university:universityList){
            System.out.println(university);
        }
        System.out.println();
    }
}
