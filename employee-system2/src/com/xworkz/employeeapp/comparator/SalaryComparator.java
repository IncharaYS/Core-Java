package com.xworkz.employeeapp.comparator;

import com.xworkz.employeeapp.dto.EmployeeDto;

import java.util.Comparator;

public class SalaryComparator implements Comparator<EmployeeDto> {
    @Override
    public int compare(EmployeeDto o1, EmployeeDto o2) {
        return (int)(o1.getSalary()-o2.getSalary());
    }
}
