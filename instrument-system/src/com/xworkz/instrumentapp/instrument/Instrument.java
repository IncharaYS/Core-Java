package com.xworkz.instrumentapp.instrument;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Instrument {
    private String instrumentId;
    private String name;
    private String type;
    private String material;
    private double price;
    private boolean isElectric;

    @Override
    public String toString() {
        return "Instrument{" +
                "instrumentId='" + instrumentId + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price +
                ", isElectric=" + isElectric +
                '}';
    }
}
