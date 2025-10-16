package com.xworkz.houseapp.house;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class House {
    private int houseId;
    private String address;
    private int bedrooms;
    private int bathrooms;
    private double area;
    private double price;
    private String ownerName;
}
