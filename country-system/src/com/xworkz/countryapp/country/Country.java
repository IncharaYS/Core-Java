package com.xworkz.countryapp.country;

public class Country {
    private int countryId;
    private String name;
    private int code;
    private String continent;
    private String currency;

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCurrency() {
        return currency;
    }

    public String getName() {
        return name;
    }

    public int getCountryId() {
        return countryId;
    }

    public int getCode() {
        return code;
    }

    public String getContinent() {
        return continent;
    }

}
