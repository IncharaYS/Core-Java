package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.product.Product;
import com.xworkz.amazonapp.validator.ProductValidator;

public class Amazon {
    Product product;
    public boolean addProduct(Product product){
        boolean isProductAdded=false;
        boolean isProductInfoValid=false;

        ProductValidator productValidator=new ProductValidator();
        if(productValidator.validateProduct(product)){
            isProductAdded=true;
            this.product=product;
        }
        return isProductAdded;
    }

    public void getProductInfo(){
        System.out.println("Product Id is:"+this.product.getProductId());
        System.out.println("Product name is:"+this.product.getName());
        System.out.println("Product brand is:"+this.product.getBrand());
        System.out.println("Product seller is:"+this.product.getSellerName());
        System.out.println("Product price is:"+this.product.getPrice());
        System.out.println("Product color is:"+this.product.getColor());
    }
}
