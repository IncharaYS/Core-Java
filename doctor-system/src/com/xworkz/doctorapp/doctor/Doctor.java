package com.xworkz.doctorapp.doctor;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Doctor {
    private String doctorId;
    private String name;
    private String specialization;
    private int experienceYears;
    private double consultationFee;
    private boolean available;

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId='" + doctorId + '\'' +
                ", name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", experienceYears=" + experienceYears +
                ", consultationFee=" + consultationFee +
                ", available=" + available +
                '}';
    }
}
