package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.product.Product;
import com.xworkz.amazonapp.validator.ProductValidator;

public class Amazon {
    Product[] products=new Product[19];
    int index;

    public boolean addProduct(Product product){
        boolean isProductAdded=false;
        boolean isProductInfoValid=false;
        ProductValidator productValidator=new ProductValidator();
        if(productValidator.validateProduct(product)){
                products[index++] = product;
                isProductAdded = true;
        }
        return isProductAdded;
    }

    public void getProductInfo() {
        for (Product product: products) {
            System.out.println("Product Id is:" + product.getProductId());
            System.out.println("Product name is:" + product.getName());
            System.out.println("Product brand is:" + product.getBrand());
            System.out.println("Product seller is:" +product.getSellerName());
            System.out.println("Product price is:" +product.getPrice());
            System.out.println("Product color is:" +product.getColor() + "\n");
        }
    }
    /*public boolean updatePrice(double price){
        boolean isPriceUpdated=false;
        if(price>0.0){
            this.product.setPrice(price);
            System.out.println("Product price is updated to:"+this.product.getPrice());
            isPriceUpdated=true;
        }
        else System.out.println("Enter valid product price");
        return isPriceUpdated;
    }
    public void deleteProduct(Product product){
        this.product=null;//for single product
        System.out.println("product is deleted");
    }*/
}
