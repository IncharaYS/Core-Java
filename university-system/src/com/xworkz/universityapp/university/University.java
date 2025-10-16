package com.xworkz.universityapp.university;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class University {
    private String universityId;
    private String name;
    private String location;
    private int establishedYear;
    private int numberOfDepartments;
    private int numberOfStudents;

    @Override
    public String toString() {
        return "University{" +
                "universityId='" + universityId + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", establishedYear=" + establishedYear +
                ", numberOfDepartments=" + numberOfDepartments +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}
