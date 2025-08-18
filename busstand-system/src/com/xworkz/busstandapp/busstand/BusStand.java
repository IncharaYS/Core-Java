package com.xworkz.busstandapp.busstand;

public class BusStand {
    private int busStandId;
    private String name;
    private String location;
    private String busRoute;

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBusStandId(int busStandId) {
        this.busStandId = busStandId;
    }

    public void setBusRoute(String busRoute) {
        this.busRoute = busRoute;
    }

    public String getName() {
        return name;
    }

    public int getBusStandId() {
        return busStandId;
    }

    public String getBusRoute() {
        return busRoute;
    }

    public String getLocation() {
        return location;
    }
}
