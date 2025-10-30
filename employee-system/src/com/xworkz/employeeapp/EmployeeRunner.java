package com.xworkz.employeeapp;

import com.xworkz.employeeapp.comparator.IdComparator;
import com.xworkz.employeeapp.comparator.SalaryComparator;
import com.xworkz.employeeapp.dto.EmployeeDto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmployeeRunner {
    public static void main(String[] args) {
        List<EmployeeDto> employeeList=new ArrayList<>();

        employeeList.add(new EmployeeDto(3,"Inchara","Y S","25/10/25","Female","IT",22,450000,"Mariappanpalya"));
        employeeList.add(new EmployeeDto(1,"Rashmi","Mathad","22/10/25","Female","IT",21,450000,"Mariappanpalya"));
        employeeList.add(new EmployeeDto(2,"Sam","Sham","20/1/22","Male","HR",32,800000,"Bangalore"));
        employeeList.add(new EmployeeDto(2,"Tom","Holand","20/1/22","Male","HR",22,300000,"Bangalore"));
        employeeList.add(new EmployeeDto(4,"Shriharsha","K M","2/9/23","Male","IT",21,600000,"Hyderabad"));
        employeeList.add(new EmployeeDto(4,"Harsha","Bhatt","2/9/23","Male","IT",21,650000,"Delhi"));
        employeeList.add(new EmployeeDto(5,"Rakshita","Poojary","9/8/25","Female","HR",22,350000,"Shivamogga"));
        System.out.println("Employee list:");
        employeeList.forEach(System.out::println);
        System.out.println();


        System.out.println("Employees list sorted by id:");
        employeeList.stream()
                //(o1, o2) -> o1.getEmployeeId()-o2.getEmployeeId()
                //Comparator.comparingInt(EmployeeDto::getEmployeeId)
                .sorted(new IdComparator())
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Employees list sorted by first name:");
        employeeList.stream()
                .sorted((o1,o2)->o1.getFirstName().compareTo(o2.getFirstName()))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Employees list sorted by last name:");
        employeeList.stream()
                .sorted((o1,o2)->o1.getLastName().compareTo(o2.getLastName()))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Employees list sorted by gender:");
        employeeList.stream()
                .sorted(Comparator.comparing(EmployeeDto::getGender))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Employees list sorted by department:");
        employeeList.stream()
                .sorted(Comparator.comparing(EmployeeDto::getDepartment))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Employees list sorted by age:");
        employeeList.stream()
                .sorted(Comparator.comparing(EmployeeDto::getAge))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Employees list sorted by salary:");
        employeeList.stream()
                .sorted(Comparator.comparing(EmployeeDto::getSalary))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Employees list sorted by address:");
        employeeList.stream()
                .sorted(Comparator.comparing(EmployeeDto::getAddress))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Employees list sorted by date:");
        employeeList.stream()
                .sorted((o1,o2)->o1.getDateOfJoining().compareTo(o2.getDateOfJoining()))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Distinct departments are:");
        System.out.println(employeeList.stream().
                collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.counting())));
        System.out.println(employeeList.stream()
                .map(EmployeeDto::getDepartment)
                .collect(Collectors.toSet()));
        System.out.println();

        System.out.println("Employee with second highest salary:");
        System.out.println(employeeList.stream()
                .sorted(Comparator.comparing(EmployeeDto::getSalary).reversed())
                .skip(1)
                .findFirst().get());

        System.out.println("Employee with third highest salary:");
        System.out.println(employeeList.stream()
                .sorted(Comparator.comparing(EmployeeDto::getSalary).reversed())
                .skip(2)
                .findFirst().get());
        System.out.println();

        System.out.println("Number of male and female employees are:");
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(EmployeeDto::getGender, Collectors.counting())));
        System.out.println();

        System.out.println("Employee sorted based on salary and date of joining:");
        employeeList.stream()
                .sorted(Comparator.comparing(EmployeeDto::getSalary)
                        .thenComparing(EmployeeDto::getDateOfJoining))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Max age of employee is:");
        System.out.println(employeeList.stream().
                max(Comparator.comparing(EmployeeDto::getAge)).get()
                .getAge()
        );
        System.out.println();

        System.out.println("Min age of employee is:");
        System.out.println(employeeList.stream().
                min(Comparator.comparing(EmployeeDto::getAge)).get()
                .getAge()
        );
        System.out.println();

        System.out.println("Employees above the age of 21:");
        employeeList.stream()
                .filter(employee ->employee.getAge()>21)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Employees in IT department:");
        employeeList.stream()
                .filter(employee -> Objects.equals(employee.getDepartment(), "IT"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Employees with salary above 350000:");
        employeeList.stream()
                .filter(employee ->employee.getSalary()>35000)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Employees with salary above 350000 and female:");
        employeeList.stream()
                .filter(employee ->employee.getSalary()>35000 && employee.getGender().equals("Female"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Employees who are male(List):");
        employeeList.stream()
                .filter(employee ->employee.getGender().equals("Male"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Employees who are male(Set):");
        employeeList.stream()
                .filter(employee ->employee.getGender().equals("Male"))
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Employee with max salary:");
        System.out.println(employeeList.stream()
                .max(new SalaryComparator()).get());
        System.out.println();

        System.out.println("Employee in HR department who is oldest:");
        System.out.println(employeeList.stream()
                .filter((employee) -> employee.getDepartment().equals("HR"))
                .sorted(Comparator.comparing(EmployeeDto::getAge).reversed())
                .findFirst().get());
        System.out.println();

        System.out.println("Employee in HR department who is male and youngest:");
        System.out.println(employeeList.stream()
                .filter((employee) -> employee.getDepartment().equals("HR") && employee.getGender().equals("Male"))
                .sorted(Comparator.comparing(EmployeeDto::getAge))
                .findFirst().get());
        System.out.println();

        System.out.println("Count of each names in Employee list:");
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(EmployeeDto::getFirstName, Collectors.counting())));
        System.out.println();

        System.out.println("Count of male and female employees from each department:");
        System.out.println(employeeList.stream()
                .collect(Collectors.groupingBy(EmployeeDto::getDepartment,Collectors.groupingBy(EmployeeDto::getGender,Collectors.counting()))));

        System.out.println("Highest salary in each department:");
        System.out.println(employeeList.stream()
                .collect(Collectors.
                        groupingBy(EmployeeDto::getDepartment,
                                Collectors.maxBy(Comparator.comparing(EmployeeDto::getSalary)))));
        System.out.println();

        System.out.println("Lowest salary in each department based on gender:");
        System.out.println(employeeList.stream()
                .collect(Collectors
                        .groupingBy(EmployeeDto::getDepartment,
                                Collectors.minBy(Comparator.comparing(EmployeeDto::getSalary)))));
        System.out.println();

        System.out.println("Highest  paid salary in organization based on gender:");
        System.out.println(employeeList.stream()
                .collect(Collectors
                        .groupingBy(EmployeeDto::getGender,
                                Collectors.maxBy(Comparator.comparing(EmployeeDto::getSalary)))));
        System.out.println();

        System.out.println("Top 2 highest salary earning employees in each department:");
        System.out.println(employeeList.stream()
                .collect(Collectors
                        .groupingBy(EmployeeDto::getDepartment,
                                Collectors.collectingAndThen(Collectors.toList(),
                                        list -> list.stream()
                                                .sorted(Comparator.comparing(EmployeeDto::getSalary).reversed())
                                                .limit(2)
                                                .collect(Collectors.toList()))))
        );
        System.out.println();

    }
}
