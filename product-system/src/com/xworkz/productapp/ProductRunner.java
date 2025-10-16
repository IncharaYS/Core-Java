package com.xworkz.productapp;

import com.xworkz.productapp.product.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductRunner {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("1","Laptop","Electronics",75000.0,"HP",true));
        productList.add(new Product("2","Smartphone","Electronics",50000.0,"Samsung",true));
        productList.add(new Product("3","Refrigerator","Appliance",45000.0,"LG",true));
        productList.add(new Product("4","Washing Machine","Appliance",40000.0,"Whirlpool",true));
        productList.add(new Product("5","Television","Electronics",60000.0,"Sony",true));
        productList.add(new Product("6","Microwave Oven","Appliance",15000.0,"IFB",true));
        productList.add(new Product("7","Air Conditioner","Appliance",55000.0,"Daikin",true));
        productList.add(new Product("8","Vacuum Cleaner","Appliance",12000.0,"Eureka Forbes",true));
        productList.add(new Product("9","Headphones","Electronics",8000.0,"JBL",true));
        productList.add(new Product("10","Smartwatch","Electronics",12000.0,"Apple",true));

        System.out.println("Product list 1:");
        for(Product product:productList){
            System.out.println(product);
        }
        System.out.println();
        System.out.println("Size of Product list 1:"+productList.size());

        List<Product> productList2 = new ArrayList<>();

        productList2.add(new Product("11","Tablet","Electronics",30000.0,"Lenovo",true));
        productList2.add(new Product("12","Printer","Electronics",10000.0,"Canon",true));
        productList2.add(new Product("13","Monitor","Electronics",15000.0,"Dell",true));
        productList2.add(new Product("14","Camera","Electronics",50000.0,"Nikon",true));
        productList2.add(new Product("15","Gaming Console","Electronics",45000.0,"Sony",true));
        productList2.add(new Product("16","Router","Electronics",5000.0,"TP-Link",true));
        productList2.add(new Product("17","Smart Speaker","Electronics",9000.0,"Amazon",true));
        productList2.add(new Product("18","Power Bank","Electronics",2000.0,"Mi",true));
        productList2.add(new Product("19","External Hard Drive","Electronics",7000.0,"Seagate",true));
        productList2.add(new Product("20","Keyboard","Electronics",1500.0,"Logitech",true));

        System.out.println("Product list 2:");
        for(Product product:productList2){
            System.out.println(product);
        }
        System.out.println();
        System.out.println("Size of Product list 2:"+productList2.size());

        productList.addAll(productList2);
        System.out.println("Full product list:");
        for(Product product:productList){
            System.out.println(product);
        }
        System.out.println();

        Product product1 = new Product("6","Microwave Oven","Appliance",15000.0,"IFB",true);
        Product product2 = new Product("21","Smart Glasses","Electronics",70000.0,"Meta",true);
        productList.add(4,product2);

        System.out.println("Does list contain product1:"+productList.contains(product1));
        System.out.println("Does list contain productList2:"+productList.containsAll(productList2));
        System.out.println();

        productList.remove(product1);
        productList.remove(7);

        System.out.println("Product list after remove(Object) and remove(index):");
        for(Product product:productList){
            System.out.println(product);
        }
        System.out.println();

        productList.removeAll(productList2);
        System.out.println("Product list after removing productList2:");
        for(Product product:productList){
            System.out.println(product);
        }
        System.out.println();

        System.out.println("Does list contain product1:"+productList.contains(product1));
        System.out.println("Does list contain productList2:"+productList.containsAll(productList2));
        System.out.println();

        productList.addAll(productList2);
        productList.retainAll(productList2);

        System.out.println("Product list after retaining only productList2:");
        for(Product product:productList){
            System.out.println(product);
        }
        System.out.println();
    }
}
