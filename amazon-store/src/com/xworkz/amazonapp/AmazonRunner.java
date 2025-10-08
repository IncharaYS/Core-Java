package com.xworkz.amazonapp;

import com.xworkz.amazonapp.impl.AmazonImpl;
import com.xworkz.amazonapp.constants.BrandName;
import com.xworkz.amazonapp.product.Product;

import java.util.Scanner;

public class AmazonRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of products to add:");
        int size=sc.nextInt();
        AmazonImpl amazon=new AmazonImpl(size);
        System.out.println("Number of products to be added is:"+amazon.products.length);

        for(int i=0;i<size;i++){
            System.out.println("Enter details of product "+(i+1));
            Product product=new Product();
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

            boolean added=amazon.addProduct(product);
            if(!added){
                i--;
            }
            System.out.println("---------------------------------------------------");
            System.out.println(product);
        }

        String input=null;
        do{
            System.out.println("Press 1 to update name by ID");
            System.out.println("Press 2 to update price by ID");
            System.out.println("Press 3 to update brand by ID");
            System.out.println("Press 4 to update color by ID");
            System.out.println("Press 5 to update seller name by ID");
            System.out.println("Press 6 to update price by brand");
            System.out.println("Press 7 to get name by ID");
            System.out.println("Press 8 to get price by ID");
            System.out.println("Press 9 to get brand by ID");
            System.out.println("Press 10 to get color by ID");
            System.out.println("Press 11 to get seller name by ID");
            System.out.println("Press 12 to get brand by name");
            System.out.println("Press 13 to get product details by ID");
            System.out.println("Press 14 to delete product by ID");
            System.out.println("Press 15 to get all product details");

            int option=sc.nextInt();
            switch(option){
                case 1:
                    System.out.print("Enter Id of product to update name:");
                    int idName=sc.nextInt();sc.nextLine();
                    System.out.print("Enter the updated name:");
                    amazon.updateNameById(idName,sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter Id of product to update price:");
                    int idPrice=sc.nextInt();
                    System.out.print("Enter the updated price:");
                    amazon.updatePriceById(idPrice,sc.nextDouble());
                    break;

                case 3:
                    System.out.print("Enter Id of product to update brand:");
                    int idBrand=sc.nextInt();sc.nextLine();
                    System.out.print("Enter the updated brand:");
                    amazon.updateBrandById(idBrand,BrandName.valueOf(sc.nextLine().toUpperCase()));
                    break;

                case 4:
                    System.out.print("Enter Id of product to update color:");
                    int idColor=sc.nextInt();sc.nextLine();
                    System.out.print("Enter the updated color:");
                    amazon.updateColorById(idColor,sc.nextLine());
                    break;

                case 5:
                    System.out.print("Enter Id of product to update seller name:");
                    int idSeller=sc.nextInt();sc.nextLine();
                    System.out.print("Enter the updated seller name:");
                    amazon.updateSellerNameById(idSeller,sc.nextLine());
                    break;

                case 6:
                    System.out.print("Enter Brand to update price:");sc.nextLine();
                    String brandName=sc.nextLine();
                    System.out.print("Enter the updated price:");
                    amazon.updatePriceByBrand(BrandName.valueOf(brandName.toUpperCase()),sc.nextDouble());
                    break;

                case 7:
                    System.out.print("Enter Id to fetch name:");
                    String name=amazon.getNameById(sc.nextInt());
                    if(name!=null){
                        System.out.println("Name for given id is:"+name);
                    }
                    break;

                case 8:
                    System.out.print("Enter Id to fetch price:");
                    double price=amazon.getPriceById(sc.nextInt());
                    if(price!=0){
                        System.out.println("Price for given id is:"+price);
                    }
                    break;

                case 9:
                    System.out.print("Enter Id to fetch brand:");
                    BrandName brand=amazon.getBrandById(sc.nextInt());
                    if(brand!=null){
                        System.out.println("Brand for given id is:"+brand);
                    }
                    break;

                case 10:
                    System.out.print("Enter Id to fetch color:");
                    String color=amazon.getColorById(sc.nextInt());
                    if(color!=null){
                        System.out.println("Color for given id is:"+color);
                    }
                    break;

                case 11:
                    System.out.print("Enter Id to fetch seller name:");
                    String seller=amazon.getSellerNameById(sc.nextInt());
                    if(seller!=null){
                        System.out.println("Seller name for given id is:"+seller);
                    }
                    break;

                case 12:
                    sc.nextLine();
                    System.out.print("Enter product name to fetch brand:");
                    BrandName brandByName=amazon.getBrandByName(sc.nextLine());
                    if(brandByName!=null){
                        System.out.println("Brand for given name is:"+brandByName);
                    }
                    break;

                case 13:
                    System.out.print("Enter Id to get product details:");
                    amazon.getProductById(sc.nextInt());
                    break;

                case 14:
                    System.out.print("Enter product id to delete:");
                    amazon.deleteProductById(sc.nextInt());
                    break;

                case 15:
                    amazon.getProductInfo();
                    break;

                default:
                    System.out.println("Enter valid option");
            }

            System.out.println("Do you want to continue Yes / No");
            input=sc.next();

        }while(input.equalsIgnoreCase("YES"));

        System.out.println("main ended");
    }
}
