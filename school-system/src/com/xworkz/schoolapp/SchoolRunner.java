package com.xworkz.schoolapp;

import com.xworkz.schoolapp.impl.JnanadeepaImpl;
import com.xworkz.schoolapp.school.School;

public class SchoolRunner {
    public static void main(String[] args) {
        School school=new JnanadeepaImpl();
        school.enrollStudent("Inchara Y S");
        school.conductClass();
        school.holdExam();
    }
}
