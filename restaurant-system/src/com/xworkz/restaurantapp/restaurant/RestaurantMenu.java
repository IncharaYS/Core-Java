package com.xworkz.restaurantapp.restaurant;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class RestaurantMenu {
    private int itemId;
    private String itemName;
    private String category;
    private double price;
    private boolean isVegetarian;
    private int calories;

    @Override
    public String toString() {
        return "RestaurantMenu{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", isVegetarian=" + isVegetarian +
                ", calories=" + calories +
                '}';
    }
}
