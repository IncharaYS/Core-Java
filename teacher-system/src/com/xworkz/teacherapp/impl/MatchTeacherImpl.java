package com.xworkz.teacherapp.impl;

import com.xworkz.teacherapp.teacher.Teacher;

public class MatchTeacherImpl implements Teacher {
    @Override
    public void teach() {
        System.out.println("Teacher teaches maths");
    }

    @Override
    public void evaluate() {
        System.out.println("Teacher evaluates maths result");
    }

    @Override
    public void guide() {
        System.out.println("Math Teacher guides");
    }
}
