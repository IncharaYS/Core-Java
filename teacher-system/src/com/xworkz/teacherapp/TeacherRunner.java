package com.xworkz.teacherapp;

import com.xworkz.teacherapp.impl.MatchTeacherImpl;
import com.xworkz.teacherapp.teacher.Teacher;

public class TeacherRunner {
    public static void main(String[] args) {
        Teacher teacher=new MatchTeacherImpl();
        teacher.teach();
        teacher.evaluate();
        teacher.guide();
    }
}
