package com.xworkz.employeeapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto implements Comparable<EmployeeDto>{
    private int employeeId;
    private String firstName;
    private String lastName;
    private String DateOfJoining;
    private String gender;
    private String department;
    private int age;
    private double salary;
    private String address;

    @Override
    public int compareTo(EmployeeDto o) {
        return this.employeeId-o.employeeId;
    }
}
