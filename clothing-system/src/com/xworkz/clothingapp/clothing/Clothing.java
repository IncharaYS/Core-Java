package com.xworkz.clothingapp.clothing;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Clothing {
    private int clothId;
    private String brand;
    private String size;
    private String color;
    private double price;
    private String material;

    @Override
    public String toString() {
        return "Clothing{" +
                "clothId=" + clothId +
                ", brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", material='" + material + '\'' +
                '}';
    }
}
