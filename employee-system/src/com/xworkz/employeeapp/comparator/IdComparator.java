package com.xworkz.employeeapp.comparator;

import com.xworkz.employeeapp.dto.EmployeeDto;

import java.util.Comparator;

public class IdComparator implements Comparator<EmployeeDto> {
    @Override
    public int compare(EmployeeDto o1, EmployeeDto o2) {
        return o1.getEmployeeId()-o2.getEmployeeId();
    }
}
