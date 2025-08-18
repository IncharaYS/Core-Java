package com.xworkz.stockmarketapp.stockmarket;

public class StockMarket {
    private int marketId;
    private String name;
    private double price;
    private int quantity;

    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getMarketId() {
        return marketId;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
