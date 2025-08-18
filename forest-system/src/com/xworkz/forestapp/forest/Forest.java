package com.xworkz.forestapp.forest;

public class Forest {
    private int forestId;
    private String name;
    private String area;
    private boolean isProtected;
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setArea(String area) {
        this.area = area;
    }

    public void setForestId(int forestId) {
        this.forestId = forestId;
    }

    public void setProtected(boolean aProtected) {
        isProtected = aProtected;
    }

    public String getState() {
        return state;
    }

    public String getName() {
        return name;
    }

    public int getForestId() {
        return forestId;
    }

    public String getArea() {
        return area;
    }

    public boolean getIsProtected() {
        return isProtected;
    }
}
