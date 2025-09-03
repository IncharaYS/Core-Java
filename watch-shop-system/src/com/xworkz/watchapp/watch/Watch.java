package com.xworkz.watchapp.watch;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Watch {
    private int watchId;
    private double price;
    private String color;
    private String brand;
    private boolean hasValidity;
    private String type;
    private boolean isWaterResistant;

    /*public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getHasValidity() {
        return hasValidity;
    }

    public int getWatchId() {
        return watchId;
    }

    public void setWatchId(int watchId) {
        this.watchId = watchId;
    }

    public boolean getIsWaterResistant() {
        return isWaterResistant;
    }

    public void setHasValidity(boolean hasValidity) {
        this.hasValidity = hasValidity;
    }

    public void setWaterResistant(boolean waterResistant) {
        isWaterResistant = waterResistant;
    }*/
}
