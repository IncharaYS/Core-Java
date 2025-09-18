package com.xworkz.schoolapp.impl;

import com.xworkz.schoolapp.school.School;

public class JnanadeepaImpl implements School {
    @Override
    public void enrollStudent(String name) {
        System.out.println("Student "+name+" is enrolled");
    }

    @Override
    public void conductClass() {
        System.out.println("Classes are conducted");
    }

    @Override
    public void holdExam() {
        System.out.println("Exams are held");
    }
}
