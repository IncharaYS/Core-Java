package com.xworkz.carapp.car;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Car {
    private String carId;
    private String brand;
    private String model;
    private double price;
    private String fuelType;
    private boolean automatic;

    @Override
    public String toString() {
        return "Car{" +
                "carId='" + carId + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", fuelType='" + fuelType + '\'' +
                ", automatic=" + automatic +
                '}';
    }
}
