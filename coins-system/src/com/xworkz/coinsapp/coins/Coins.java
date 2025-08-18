package com.xworkz.coinsapp.coins;

public class Coins {
    private int coinId;
    private String currency;
    private double price;
    private double weight;

    public void setCoinId(int coinId) {
        this.coinId = coinId;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCoinId() {
        return coinId;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public String getCurrency() {
        return currency;
    }
}
