package com.xworkz.parkapp.park;

public class Park {
    private int parkId;
    private String location;
    private String openingTime;
    private String closingTime;
    private boolean hasPlayGround;

    public void setLocation(String location) {
        this.location = location;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public void setHasPlayGround(boolean hasPlayGround) {
        this.hasPlayGround = hasPlayGround;
    }

    public void setParkId(int parkId) {
        this.parkId = parkId;
    }

    public String getLocation() {
        return location;
    }

    public int getParkId() {
        return parkId;
    }

    public boolean getIsHasPlayGround() {
        return hasPlayGround;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public String getOpeningTime() {
        return openingTime;
    }
}
