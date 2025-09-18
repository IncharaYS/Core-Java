package com.xworkz.employeeapp;

import com.xworkz.employeeapp.employee.Employee;
import com.xworkz.employeeapp.impl.ManagerImpl;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee=new ManagerImpl();
        employee.work();
        employee.attendMeeting();
        employee.getSalary();
    }
}
