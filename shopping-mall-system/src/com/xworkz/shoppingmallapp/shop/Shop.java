package com.xworkz.shoppingmallapp.shop;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Shop {
    private int shopId;
    private String name;
    private int floor;
    private double area;
    private int noOfWorkers;
    private String owner;

   /* public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getShopId() {
        return shopId;
    }

    public double getArea() {
        return area;
    }

    public int getFloor() {
        return floor;
    }

    public int getNoOfWorkers() {
        return noOfWorkers;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getOwner() {
        return owner;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setNoOfWorkers(int noOfWorkers) {
        this.noOfWorkers = noOfWorkers;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }*/
}
