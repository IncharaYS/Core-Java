package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.constants.BrandName;
import com.xworkz.amazonapp.product.Product;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AmazonRunner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of products to add:");
        int size=sc.nextInt();
        Amazon amazon=new Amazon(size);
        System.out.println("Number of products to be added are:"+amazon.products.length);

        for(int i=0;i<size;i++){
            Product product=new Product();
            System.out.println("Enter details of product "+(i+1));
            System.out.print("Enter product id:");
            product.setProductId(sc.nextInt());
            System.out.print("Enter product name:");sc.nextLine();
            product.setName(sc.nextLine());
            System.out.print("Enter product price:");
            product.setPrice(sc.nextDouble());
            System.out.print("Enter product brand:");sc.nextLine();
            product.setBrand(BrandName.valueOf(sc.nextLine().toUpperCase()));
            System.out.print("Enter product color:");
            product.setColor(sc.nextLine());
            System.out.print("Enter seller name:");
            product.setSellerName(sc.nextLine());
            amazon.addProduct(product);
            System.out.println("----------------------------------------------");
        }

        amazon.getProductInfo();

        System.out.print("Enter Id of product to update name:");
        int id=sc.nextInt();sc.nextLine();
        System.out.print("Enter the updated name:");
        boolean isUpdated=amazon.updateNameById(id,sc.nextLine());
        if(isUpdated) System.out.println("Name updated successfully \n");
        else System.out.println("Failed to update name \n");

//        amazon.updatePriceById(1,333);

        System.out.print("Enter Id to fetch name:");
        System.out.println("Name for given id is:"+amazon.getNameById(sc.nextInt()));


        System.out.println("Enter id to get product details");
        amazon.getProductById(sc.nextInt());

        System.out.print("Enter product id to delete product:");
        amazon.deleteProductById(sc.nextInt());
        amazon.getProductInfo();

       /* Product product=new Product();
        product.setProductId(1);
        product.setName("Broom");
        product.setBrand("Skyees");
        product.setColor("Black");
        product.setSellerName("Sanvi collections");
        product.setPrice(300.00);



        /*if(amazon.addProduct(product)) amazon.getProductInfo();
        else System.out.println("Product is not added");

        if(amazon.updatePrice(250.00)){
            System.out.println("Updated product details:");
            amazon.getProductInfo();
        }
        else System.out.println("product price is not updated");

        amazon.deleteProduct(product);
        Amazon amazon=new Amazon();
        Product product1=new Product(1,"Broom",300.00,"Shila","Orange","Shila collections");
        amazon.addProduct(product1);

        Product product2=new Product(2,"Mop",250.00,"Ravi","Blue","Home Essentials");
        amazon.addProduct(product2);

        Product product3=new Product(3,"Vacuum Cleaner",5500.00,"Philips","Black","Appliance World");
        amazon.addProduct(product3);

        Product product4=new Product(4,"Dishwasher",35000.00,"Bosch","Silver","Appliance World");
        amazon.addProduct(product4);

        Product product5=new Product(5,"Table Lamp",1200.00,"Ajanta","Yellow","Bright Lights");
        amazon.addProduct(product5);

        Product product6=new Product(6,"Ceiling Fan",3000.00,"Orient","White","Cooling Solutions");
        amazon.addProduct(product6);

        Product product7=new Product(7,"Air Conditioner",45000.00,"Samsung","Grey","Cooling Solutions");
        amazon.addProduct(product7);

        Product product8=new Product(8,"Refrigerator",60000.00,"LG","Silver","Appliance World");
        amazon.addProduct(product8);

        Product product9=new Product(9,"Microwave Oven",8000.00,"Whirlpool","Black","Kitchen Zone");
        amazon.addProduct(product9);

        Product product10=new Product(10,"Toaster",2000.00,"Prestige","Red","Kitchen Zone");
        amazon.addProduct(product10);

        Product product11=new Product(11,"Mixer Grinder",3500.00,"Bajaj","White","Kitchen Zone");
        amazon.addProduct(product11);

        Product product12=new Product(12,"Washing Machine",28000.00,"IFB","Silver","Appliance World");
        amazon.addProduct(product12);

        Product product13=new Product(13,"Iron Box",1500.00,"Philips","Blue","Home Essentials");
        amazon.addProduct(product13);

        Product product14=new Product(14,"Water Purifier",12000.00,"Kent","White","Home Essentials");
        amazon.addProduct(product14);

        Product product15=new Product(15,"Electric Kettle",1800.00,"Pigeon","Black","Kitchen Zone");
        amazon.addProduct(product15);

        Product product16=new Product(16,"Induction Stove",3200.00,"Prestige","Black","Kitchen Zone");
        amazon.addProduct(product16);

        Product product17=new Product(17,"Sofa",25000.00,"Godrej","Brown","Furniture World");
        amazon.addProduct(product17);

        Product product18=new Product(18,"Dining Table",30000.00,"Durian","Oak","Furniture World");
        amazon.addProduct(product18);

        Product product19=new Product(19,"Wardrobe",22000.00,"Ikea","Walnut","Furniture World");
        amazon.addProduct(product19);

        amazon.getProductInfo();*/
    }
}
