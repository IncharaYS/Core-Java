package com.xworkz.mapapp;

import com.xworkz.mapapp.dto.EmployeeDto;

import java.util.*;

public class OptionalRunner {
    public static void main(String[] args) {
        List<EmployeeDto> employeeList=new ArrayList<>();

        employeeList.add(null);
        employeeList.add(new EmployeeDto(3,"Inchara","Y S","2025","Female","IT",22,450000,"Mariappanpalya"));
        employeeList.add(new EmployeeDto(1,"Rashmi","Mathad","2025","Female","IT",21,450000,"Mariappanpalya"));
        employeeList.add(new EmployeeDto(2,"Sam","Sham","2022","Male","HR",32,800000,"Bangalore"));
        employeeList.add(new EmployeeDto(2,"Tom","Holand","2022","Male","HR",22,300000,"Bangalore"));
        employeeList.add(new EmployeeDto(4,"Shriharsha","K M","2023","Male","IT",21,600000,"Hyderabad"));
        employeeList.add(new EmployeeDto(4,"Harsha","Bhatt","2023","Male","IT",21,650000,"Delhi"));
        employeeList.add(new EmployeeDto(5,"Rakshita","Poojary","2025","Female","HR",22,350000,"Shivamogga"));
        employeeList.add(new EmployeeDto(6,"Kiran","Kumar","2024","Male","Accounting",28,550000,"Mangalore"));
        employeeList.add(new EmployeeDto(7,"Anusha","Shetty","2023","Female","HR",24,400000,"Udupi"));
        employeeList.add(new EmployeeDto(8,"Rohit","Patil","2022","Male","IT",26,700000,"Bangalore"));
        employeeList.add(new EmployeeDto(9,"Divya","Rao","2025","Female","HR",23,380000,"Mysore"));
        employeeList.add(new EmployeeDto(10,"Sanjay","Naik","2024","Male","Accounting",30,800000,"Mumbai"));
        employeeList.add(new EmployeeDto(11,"Pooja","Kulkarni","2023","Female","IT",25,600000,"Pune"));
        employeeList.add(new EmployeeDto(12,"Arjun","Gowda","2022","Male","Accounting",29,500000,"Chennai"));
        employeeList.add(new EmployeeDto(13,"Sneha","Hegde","2025","Female","HR",27,450000,"Bangalore"));
        employeeList.add(new EmployeeDto(14,"Vikas","Reddy","2023","Male","IT",24,480000,"Hyderabad"));
        employeeList.add(new EmployeeDto(15,"Meghana","Pai","2019","Female","Finance",22,420000,"Mangalore"));
        employeeList.add(new EmployeeDto(15,"Jagan","Pai","2019","Female","Finance",22,420000,"Mangalore"));


        EmployeeDto employeeDto=new EmployeeDto(20,"Sana","Ram","2025","Female","HR",21,350000,"Bangalore");
        Optional<EmployeeDto> optionalEmployeeDto=Optional.of(employeeDto);
        System.out.println(optionalEmployeeDto);
        System.out.println(optionalEmployeeDto.get());

        EmployeeDto nullEmployeeDto=null;
        try {
            System.out.println(Optional.of(nullEmployeeDto));
        }catch (NullPointerException npe){ System.out.println("Null pointer exception");}

        System.out.println(Optional.ofNullable(nullEmployeeDto));

        System.out.println(Optional.ofNullable(nullEmployeeDto).orElse(new EmployeeDto()));
        try {
            System.out.println(Optional.ofNullable(nullEmployeeDto).orElseThrow(NullPointerException::new));
        }catch (NullPointerException npe){ System.out.println("Null pointer exception");}

        System.out.println(Optional.ofNullable(nullEmployeeDto).orElseGet(EmployeeDto::new));
        System.out.println(Optional.ofNullable(employeeDto).orElseGet(EmployeeDto::new));

        System.out.println(Optional.of(employeeDto).isPresent());
        System.out.println(Optional.ofNullable(null).isPresent());

    }
}
