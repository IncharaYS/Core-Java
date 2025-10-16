package com.xworkz.restaurantapp;

import com.xworkz.restaurantapp.restaurant.RestaurantMenu;
import java.util.ArrayList;
import java.util.List;

public class RestaurantRunner {
    public static void main(String[] args) {
        List<RestaurantMenu> menuList=new ArrayList<>();

        menuList.add(new RestaurantMenu(1,"Paneer Butter Masala","Main Course",220.0,true,450));
        menuList.add(new RestaurantMenu(2,"Chicken Biryani","Main Course",250.0,false,600));
        menuList.add(new RestaurantMenu(3,"Veg Fried Rice","Main Course",180.0,true,400));
        menuList.add(new RestaurantMenu(4,"Masala Dosa","Breakfast",90.0,true,350));
        menuList.add(new RestaurantMenu(5,"Idli Vada","Breakfast",70.0,true,300));
        menuList.add(new RestaurantMenu(6,"Mutton Curry","Main Course",300.0,false,700));
        menuList.add(new RestaurantMenu(7,"Gobi Manchurian","Starter",150.0,true,380));
        menuList.add(new RestaurantMenu(8,"Chicken Tikka","Starter",200.0,false,420));
        menuList.add(new RestaurantMenu(9,"Butter Naan","Bread",50.0,true,200));
        menuList.add(new RestaurantMenu(10,"Jeera Rice","Main Course",120.0,true,350));

        System.out.println("Menu list 1:");
        for(RestaurantMenu item:menuList){
            System.out.println(item);
        }
        System.out.println();

        List<RestaurantMenu> menuList2=new ArrayList<>();

        menuList2.add(new RestaurantMenu(11,"Pasta Alfredo","Main Course",230.0,true,500));
        menuList2.add(new RestaurantMenu(12,"Grilled Fish","Main Course",280.0,false,520));
        menuList2.add(new RestaurantMenu(13,"Caesar Salad","Starter",170.0,true,250));
        menuList2.add(new RestaurantMenu(14,"Veg Burger","Snacks",140.0,true,400));
        menuList2.add(new RestaurantMenu(15,"Chicken Burger","Snacks",160.0,false,420));
        menuList2.add(new RestaurantMenu(16,"French Fries","Snacks",110.0,true,330));
        menuList2.add(new RestaurantMenu(17,"Tandoori Roti","Bread",40.0,true,180));
        menuList2.add(new RestaurantMenu(18,"Tomato Soup","Starter",130.0,true,220));
        menuList2.add(new RestaurantMenu(19,"Gulab Jamun","Dessert",90.0,true,270));
        menuList2.add(new RestaurantMenu(20,"Ice Cream Sundae","Dessert",150.0,true,320));

        System.out.println("Menu list 2:");
        for(RestaurantMenu item:menuList2){
            System.out.println(item);
        }
        System.out.println();

        menuList.addAll(menuList2);
        System.out.println("Full menu list:");
        for(RestaurantMenu item:menuList){
            System.out.println(item);
        }
        System.out.println();

        RestaurantMenu item1=new RestaurantMenu(7,"Gobi Manchurian","Starter",150.0,true,380);
        RestaurantMenu item2=new RestaurantMenu(21,"Pav Bhaji","Snacks",130.0,true,400);
        menuList.add(4,item2);

        System.out.println("Does list contain item1:"+menuList.contains(item1));
        System.out.println("Does list contain menuList2:"+menuList.containsAll(menuList2));
        System.out.println();

        menuList.remove(item1);
        menuList.remove(7);

        System.out.println("Menu list after remove(Object) and remove(index):");
        for(RestaurantMenu item:menuList){
            System.out.println(item);
        }
        System.out.println();

        menuList.removeAll(menuList2);
        System.out.println("Menu list after removing menuList2:");
        for(RestaurantMenu item:menuList){
            System.out.println(item);
        }
        System.out.println();

        System.out.println("Does list contain item1:"+menuList.contains(item1));
        System.out.println("Does list contain menuList2:"+menuList.containsAll(menuList2));
        System.out.println();

        menuList.addAll(menuList2);
        menuList.retainAll(menuList2);

        System.out.println("Menu list after retaining only menuList2:");
        for(RestaurantMenu item:menuList){
            System.out.println(item);
        }
        System.out.println();
    }
}
