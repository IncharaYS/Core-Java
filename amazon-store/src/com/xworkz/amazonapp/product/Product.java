package com.xworkz.amazonapp.product;

import com.xworkz.amazonapp.constants.BrandName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int productId;
    private String name;
    private double price;
    private BrandName brand;
    private String color;
    private String sellerName;

    /*public Product(){

    }
    public  Product(int productId,String name,double price,String brand,String color,String sellerName){
        this.productId=productId;
        this.name=name;
        this.price=price;
        this.brand=brand;
        this.color=color;
        this.sellerName=sellerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }*/

}
