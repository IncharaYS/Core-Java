package com.xworkz.cityapp.city;

public class City {
    private int cityId;
    private String name;
    private String state;
    private int pinCode;

    public void setName(String name) {
        this.name = name;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getName() {
        return name;
    }

    public int getCityId() {
        return cityId;
    }

    public int getPinCode() {
        return pinCode;
    }

    public String getState() {
        return state;
    }
}
