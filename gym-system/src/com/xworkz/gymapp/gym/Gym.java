package com.xworkz.gymapp.gym;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Gym {
    private int gymId;
    private String name;
    private String location;
    private int membersCount;
    private double monthlyFee;
    private String trainerName;

    @Override
    public String toString() {
        return "Gym{" +
                "gymId=" + gymId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", membersCount=" + membersCount +
                ", monthlyFee=" + monthlyFee +
                ", trainerName='" + trainerName + '\'' +
                '}';
    }
}
