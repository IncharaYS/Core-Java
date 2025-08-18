package com.xworkz.radioapp.radio;

public class Radio {
    private int radioId;
    private double range;
    private double price;
    private boolean isOn;
    private boolean isWireless;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRadioId(int radioId) {
        this.radioId = radioId;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public void setIsOn(boolean on) {
        isOn = on;
    }

    public void setIsWireless(boolean wireless) {
        isWireless = wireless;
    }

    public double getPrice() {
        return price;
    }

    public int getRadioId() {
        return radioId;
    }

    public double getRange() {
        return range;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public boolean getIsWireless() {
        return isWireless;
    }
}
