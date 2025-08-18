package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.product.Product;

public class AmazonRunner {
    public static void main(String[] args) {
        Product product=new Product();
        product.setProductId(1);
        product.setName("Broom");
        product.setBrand("Skyees");
        product.setColor("Black");
        product.setSellerName("Sanvi collections");
        product.setPrice(300.00);

        Amazon amazon=new Amazon();
        if(amazon.addProduct(product)) amazon.getProductInfo();
        else System.out.println("Product is not added");
    }
}
