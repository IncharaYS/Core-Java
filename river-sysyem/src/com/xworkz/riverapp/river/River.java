package com.xworkz.riverapp.river;

public class River {
    private int riverId;
    private String location;
    private String origin;
    private String state;
    private boolean hasDam;

    public void setLocation(String location) {
        this.location = location;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setHasDam(boolean hasDam) {
        this.hasDam = hasDam;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setRiverId(int riverId) {
        this.riverId = riverId;
    }

    public String getLocation() {
        return location;
    }

    public String getState() {
        return state;
    }

    public int getRiverId() {
        return riverId;
    }

    public boolean getIsHasDam() {
        return hasDam;
    }

    public String getOrigin() {
        return origin;
    }

}
