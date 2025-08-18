package com.xworkz.marketapp.market;

public class Market {
    private int marketId;
    private String location;
    private int noOfShops;
    private boolean isBudgetFriendly;
    private boolean isCrowded;
    private String type;

    public void setBudgetFriendly(boolean budgetFriendly) {
        isBudgetFriendly = budgetFriendly;
    }

    public void setCrowded(boolean crowded) {
        isCrowded = crowded;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }

    public void setNoOfShops(int noOfShops) {
        this.noOfShops = noOfShops;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMarketId() {
        return marketId;
    }

    public String getLocation() {
        return location;
    }

    public int getNoOfShops() {
        return noOfShops;
    }

    public String getType() {
        return type;
    }

    public boolean getIsBudgetFriendly() {
        return isBudgetFriendly;
    }

    public boolean getIsCrowded() {
        return isCrowded;
    }
}
