package com.xworkz.countryapp.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class CountryDto {

    private int countryId;
    private String countryName;
    private long population;
    private String primaMinisterName;
    private int noOfStates;
    private double area;
    private String continent;
    private boolean isDemocratic;
    private String language;


}
