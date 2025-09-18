package com.xworkz.employeeapp.impl;

import com.xworkz.employeeapp.employee.Employee;

public class ManagerImpl implements Employee {
    @Override
    public void work() {
        System.out.println("Manager works");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Manager attends meeting");
    }

    @Override
    public void getSalary() {
        System.out.println("Manager gets salary");
    }
}
