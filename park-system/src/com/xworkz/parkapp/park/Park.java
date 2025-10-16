package com.xworkz.parkapp.park;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Park {
    private String parkId;
    private String name;
    private String location;
    private double area;
    private int numberOfTrees;
    private boolean openToPublic;

    @Override
    public String toString() {
        return "Park{" +
                "parkId='" + parkId + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", area=" + area +
                ", numberOfTrees=" + numberOfTrees +
                ", openToPublic=" + openToPublic +
                '}';
    }
}
