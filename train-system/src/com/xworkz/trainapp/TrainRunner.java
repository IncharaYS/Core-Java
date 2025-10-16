package com.xworkz.trainapp;

import com.xworkz.trainapp.train.Train;
import java.util.ArrayList;
import java.util.List;

public class TrainRunner {
    public static void main(String[] args) {
        List<Train> trainList = new ArrayList<>();

        trainList.add(new Train(1,"Rajdhani Express",12345,"New Delhi","Mumbai",20,2500.0));
        trainList.add(new Train(2,"Shatabdi Express",23456,"Mumbai","Pune",15,1200.0));
        trainList.add(new Train(3,"Duronto Express",34567,"Kolkata","Chennai",18,2000.0));
        trainList.add(new Train(4,"Garib Rath",45678,"Delhi","Bangalore",22,900.0));
        trainList.add(new Train(5,"Humsafar Express",56789,"Patna","Ahmedabad",16,1800.0));
        trainList.add(new Train(6,"Sampark Kranti",67890,"Bhopal","Delhi",14,1500.0));
        trainList.add(new Train(7,"Intercity Express",78901,"Chennai","Hyderabad",12,1000.0));
        trainList.add(new Train(8,"Jan Shatabdi",89012,"Mumbai","Surat",10,800.0));
        trainList.add(new Train(9,"Express",90123,"Kolkata","Bhubaneswar",13,1100.0));
        trainList.add(new Train(10,"Superfast Express",11234,"Delhi","Lucknow",17,1300.0));

        System.out.println("Train list 1:");
        for(Train train:trainList){
            System.out.println(train);
        }
        System.out.println();
        System.out.println("Size of Train list 1:"+trainList.size());

        List<Train> trainList2 = new ArrayList<>();

        trainList2.add(new Train(11,"Mahanagar Express",22345,"Mumbai","Ahmedabad",15,1250.0));
        trainList2.add(new Train(12,"Kanchanjunga Express",33456,"Sealdah","Agartala",20,1800.0));
        trainList2.add(new Train(13,"Coimbatore Express",44567,"Coimbatore","Bangalore",12,900.0));
        trainList2.add(new Train(14,"Lucknow Mail",55678,"Lucknow","Delhi",16,1100.0));
        trainList2.add(new Train(15,"Konkan Kanya Express",66789,"Mumbai","Goa",14,950.0));
        trainList2.add(new Train(16,"Himalayan Queen",77890,"Shimla","Kalka",10,700.0));
        trainList2.add(new Train(17,"Deccan Queen",88901,"Mumbai","Pune",13,1000.0));
        trainList2.add(new Train(18,"Shalimar Express",99012,"Kolkata","Delhi",18,1400.0));
        trainList2.add(new Train(19,"Nizamuddin Express",10123,"Delhi","Hyderabad",17,1300.0));
        trainList2.add(new Train(20,"Howrah Mail",11235,"Kolkata","Mumbai",20,1600.0));

        System.out.println("Train list 2:");
        for(Train train:trainList2){
            System.out.println(train);
        }
        System.out.println();
        System.out.println("Size of Train list 2:"+trainList2.size());

        trainList.addAll(trainList2);
        System.out.println("Full train list:");
        for(Train train:trainList){
            System.out.println(train);
        }
        System.out.println();

        Train train1 = new Train(6,"Sampark Kranti",67890,"Bhopal","Delhi",14,1500.0);
        Train train2 = new Train(21,"Vande Bharat Express",12321,"Delhi","Mumbai",16,2500.0);
        trainList.add(4,train2);

        System.out.println("Does list contain train1:"+trainList.contains(train1));
        System.out.println("Does list contain trainList2:"+trainList.containsAll(trainList2));
        System.out.println();

        trainList.remove(train1);
        trainList.remove(7);

        System.out.println("Train list after remove(Object) and remove(index):");
        for(Train train:trainList){
            System.out.println(train);
        }
        System.out.println();

        trainList.removeAll(trainList2);
        System.out.println("Train list after removing trainList2:");
        for(Train train:trainList){
            System.out.println(train);
        }
        System.out.println();

        System.out.println("Does list contain train1:"+trainList.contains(train1));
        System.out.println("Does list contain trainList2:"+trainList.containsAll(trainList2));
        System.out.println();

        trainList.addAll(trainList2);
        trainList.retainAll(trainList2);

        System.out.println("Train list after retaining only trainList2:");
        for(Train train:trainList){
            System.out.println(train);
        }
        System.out.println();
    }
}
