package com.xworkz.courseapp;

import com.xworkz.courseapp.course.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseRunner {
    public static void main(String[] args) {
        List<Course> courseList=new ArrayList<Course>();

        courseList.add(new Course(1,"Java",6,15000,"Devendra Singh","11:00","xworkz"));
        courseList.add(new Course(2,"Python",5,14000,"Tanushree","10:00","Xworkz"));
        courseList.add(new Course(3,"C Programming",4,12000,"Anita","12:00","Xworkz"));
        courseList.add(new Course(4,"C++",5,13000,"Ram","09:00","Xworkz"));
        courseList.add(new Course(5,"Data Structures",6,16000,"Devendra Singh","02:00","Xworkz"));
        courseList.add(new Course(6,"Spring Boot",8,18000,"Devendra Singh","03:00","Xworkz"));
        courseList.add(new Course(7,"HTML & CSS",3,8000,"Amith","9:00","Xworkz"));
        courseList.add(new Course(8,"JavaScript",4,9000,"Amith","10:00","Xworkz"));
        courseList.add(new Course(9,"ReactJS",6,17000,"Manish","11:00","Xworkz"));
        courseList.add(new Course(10,"Angular",6,17500,"Pooja","12:00","Xworkz"));

        System.out.println("Course list 1:");
        for(Course course:courseList){
            System.out.println(course);
        }
        System.out.println();

        List<Course> courseList2 =new ArrayList<Course>();


        courseList2.add(new Course(11,"NodeJS",5,16000,"Anand Kumar","10:30","Xworkz"));
        courseList2.add(new Course(12,"SQL",4,10000,"Sunil","8:30","Xworkz"));
        courseList2.add(new Course(13,"MongoDB",4,11000,"Swetha","03:30","Xworkz"));
        courseList2.add(new Course(14,"AWS Cloud",8,20000,"Sunita Iyer","02:30","Xworkz"));
        courseList2.add(new Course(15,"DevOps",7,22000,"Samith","09:30","Xworkz"));
        courseList2.add(new Course(16,"Machine Learning",10,25000,"Kiran","10:00","Xworkz"));
        courseList2.add(new Course(17,"Artificial Intelligence",10,26000,"Waseem khan","11:30","Xworkz"));
        courseList2.add(new Course(18,"Cyber Security",8,23000,"Rohit","12:30","Xworkz"));
        courseList2.add(new Course(19,"Data Science",9,24000,"Sneha Reddy","02:00","Xworkz"));
        courseList2.add(new Course(20,"Web Development",8,19000,"Amith","04:30","Xworkz"));

        System.out.println("Course list 2:");
        for(Course course:courseList2){
            System.out.println(course);
        }
        System.out.println();

        courseList.addAll(courseList2);
        System.out.println("Course list:");
        for(Course course:courseList){
            System.out.println(course);
        }
        System.out.println();


        Course course1=new Course(20,"Web Development",8,19000,"Amith","04:30","Xworkz");


        System.out.println("Does list contain course1:"+courseList.contains(course1));
        System.out.println("Does list contain courseList2:"+courseList.containsAll(courseList2));
        System.out.println();

        courseList.remove(course1);
        courseList.remove(16);

        System.out.println("Course list after remove(Object) and remove(index):");
        for(Course course:courseList){
            System.out.println(course);
        }
        System.out.println();

        courseList.removeAll(courseList2);
        System.out.println("Course list after removing courseList2:");
        for(Course course:courseList){
            System.out.println(course);
        }
        System.out.println();

        System.out.println("Does list contain course1:"+courseList.contains(course1));
        System.out.println("Does list contain courseList2:"+courseList.containsAll(courseList2));
        System.out.println();

        courseList.addAll(courseList2);
        courseList.retainAll(courseList2);

        System.out.println("Course list after retaining only courseList2:");
        for(Course course:courseList){
            System.out.println(course);
        }
        System.out.println();



    }
}
