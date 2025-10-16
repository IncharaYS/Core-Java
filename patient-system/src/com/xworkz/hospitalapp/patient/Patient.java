package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.constants.Gender;
import lombok.*;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private int patientId;
    private String name;
    private Gender gender;
    private int age;
    private String address;
    private String diseaseName;
    private String bloodGroup;

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", diseaseName='" + diseaseName + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                '}';
    }
}
