package com.xworkz.mobileapp.mobile;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Mobile {
    private String mobileId;
    private String brand;
    private String model;
    private double price;
    private int storage;
    private boolean is5G;

    @Override
    public String toString() {
        return "Mobile{" +
                "mobileId='" + mobileId + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                ", is5G=" + is5G +
                '}';
    }
}
