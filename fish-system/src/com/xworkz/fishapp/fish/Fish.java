package com.xworkz.fishapp.fish;

public class Fish {
    private int fishId;
    private String name;
    private String color;
    private double length;

    public void setColor(String color) {
        this.color = color;
    }

    public void setFishId(int fishId) {
        this.fishId = fishId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getFishId() {
        return fishId;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }
}
