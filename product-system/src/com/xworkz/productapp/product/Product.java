package com.xworkz.productapp.product;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Product {
    private String productId;
    private String name;
    private String category;
    private double price;
    private String manufacturer;
    private boolean inStock;

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", inStock=" + inStock +
                '}';
    }
}
