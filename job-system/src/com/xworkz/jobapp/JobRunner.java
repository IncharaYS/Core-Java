package com.xworkz.jobapp;

import com.xworkz.jobapp.job.Job;
import java.util.ArrayList;
import java.util.List;

public class JobRunner {
    public static void main(String[] args) {
        List<Job> jobList=new ArrayList<>();

        jobList.add(new Job(1,"Software Engineer","TCS",600000.0,"Bangalore","Full-Time",2));
        jobList.add(new Job(2,"Data Analyst","Infosys",550000.0,"Hyderabad","Full-Time",1));
        jobList.add(new Job(3,"System Administrator","Wipro",500000.0,"Chennai","Full-Time",3));
        jobList.add(new Job(4,"Web Developer","Accenture",650000.0,"Pune","Full-Time",2));
        jobList.add(new Job(5,"Network Engineer","Tech Mahindra",480000.0,"Delhi","Full-Time",2));
        jobList.add(new Job(6,"DevOps Engineer","IBM",750000.0,"Bangalore","Full-Time",3));
        jobList.add(new Job(7,"UI/UX Designer","Cognizant",620000.0,"Mumbai","Full-Time",2));
        jobList.add(new Job(8,"Project Manager","Capgemini",900000.0,"Chennai","Full-Time",5));
        jobList.add(new Job(9,"Database Administrator","Oracle",850000.0,"Hyderabad","Full-Time",4));
        jobList.add(new Job(10,"Cybersecurity Analyst","HCL",700000.0,"Noida","Full-Time",3));

        System.out.println("Job list 1:");
        for(Job job:jobList){
            System.out.println(job);
        }
        System.out.println();
        System.out.println("Size of Job list 1:"+jobList.size());

        List<Job> jobList2=new ArrayList<>();

        jobList2.add(new Job(11,"Cloud Architect","Amazon",1500000.0,"Bangalore","Full-Time",6));
        jobList2.add(new Job(12,"AI Engineer","Google",1800000.0,"Hyderabad","Full-Time",5));
        jobList2.add(new Job(13,"Business Analyst","Deloitte",750000.0,"Pune","Full-Time",3));
        jobList2.add(new Job(14,"QA Tester","Mindtree",500000.0,"Mysore","Full-Time",2));
        jobList2.add(new Job(15,"Product Manager","Flipkart",1400000.0,"Bangalore","Full-Time",5));
        jobList2.add(new Job(16,"Game Developer","Ubisoft",800000.0,"Pune","Full-Time",3));
        jobList2.add(new Job(17,"Data Scientist","Microsoft",1700000.0,"Hyderabad","Full-Time",4));
        jobList2.add(new Job(18,"Technical Writer","Zoho",600000.0,"Chennai","Full-Time",2));
        jobList2.add(new Job(19,"Marketing Executive","Swiggy",550000.0,"Bangalore","Full-Time",2));
        jobList2.add(new Job(20,"Sales Manager","Ola",950000.0,"Mumbai","Full-Time",4));

        System.out.println("Job list 2:");
        for(Job job:jobList2){
            System.out.println(job);
        }
        System.out.println();
        System.out.println("Size of Job list 2:"+jobList.size());

        jobList.addAll(jobList2);
        System.out.println("Full job list:");
        for(Job job:jobList){
            System.out.println(job);
        }
        System.out.println();

        Job job1=new Job(6,"DevOps Engineer","IBM",750000.0,"Bangalore","Full-Time",3);
        Job job2=new Job(21,"Content Strategist","Zomato",650000.0,"Delhi","Full-Time",3);
        jobList.add(4,job2);

        System.out.println("Does list contain job1:"+jobList.contains(job1));
        System.out.println("Does list contain jobList2:"+jobList.containsAll(jobList2));
        System.out.println();

        jobList.remove(job1);
        jobList.remove(7);

        System.out.println("Job list after remove(Object) and remove(index):");
        for(Job job:jobList){
            System.out.println(job);
        }
        System.out.println();

        jobList.removeAll(jobList2);
        System.out.println("Job list after removing jobList2:");
        for(Job job:jobList){
            System.out.println(job);
        }
        System.out.println();

        System.out.println("Does list contain job1:"+jobList.contains(job1));
        System.out.println("Does list contain jobList2:"+jobList.containsAll(jobList2));
        System.out.println();

        jobList.addAll(jobList2);
        jobList.retainAll(jobList2);

        System.out.println("Job list after retaining only jobList2:");
        for(Job job:jobList){
            System.out.println(job);
        }
        System.out.println();
    }
}
