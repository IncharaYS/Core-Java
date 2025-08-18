package com.xworkz.apartmentapp.apartment;

public class Apartment {
    private int apartmentId;
    private String name;
    private String location;
    private boolean hasElevator;
    private int yearBuilt;

    public int getApartmentId() {
        return apartmentId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }


    public boolean getIsHasElevator() {
        return hasElevator;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void setHasElevator(boolean hasElevator) {
        this.hasElevator = hasElevator;
    }
}
