package com.xworkz.wireapp.wire;

public class Wire {
    private int wireId;
    private String color;
    private double price;
    private int length;
    private String brand;

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setLength(int length) {

        this.length = length;
    }

    public void setWireId(int wireId) {
        this.wireId = wireId;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getWireId() {
        return wireId;
    }

    public int getLength() {
        return length;
    }
}
