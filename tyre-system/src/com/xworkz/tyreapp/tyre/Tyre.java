package com.xworkz.tyreapp.tyre;

public class Tyre {
    private int tyreId;
    private double price;
    private String brand;
    private String seasons;
    private char size;
    private int rimSize;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTyreId(int tyreId) {
        this.tyreId = tyreId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRimSize(int rimSize) {
        this.rimSize = rimSize;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public char getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }

    public int getRimSize() {
        return rimSize;
    }

    public String getSeasons() {
        return seasons;
    }

    public int getTyreId() {
        return tyreId;
    }
}
