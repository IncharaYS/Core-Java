package com.xworkz.cityapp.city;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class City {
    private int cityId;
    private String name;
    private String state;
    private int population;
    private double area;
    private boolean isCapital;

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", isCapital=" + isCapital +
                '}';
    }
}
