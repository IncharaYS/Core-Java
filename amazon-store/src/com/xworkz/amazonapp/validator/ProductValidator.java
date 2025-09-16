package com.xworkz.amazonapp.validator;

import com.xworkz.amazonapp.product.Product;

public class ProductValidator {
    public boolean validateProduct(Product product){
        boolean isProductValidated=false;
        boolean idProductIdValid=false;
        boolean isNameValid=false;
        boolean isBrandValid=false;
        boolean isSellerValid=false;
        boolean isPriceValid=false;
        boolean isColorValid=false;

        if(product.getProductId()>0) idProductIdValid=true;
        else System.out.println("Entered ID is not valid");

        if (product.getBrand()!=null) isBrandValid=true;
        else System.out.println("Product brand is not valid");

        if (product.getColor()!=null&&!product.getColor().isEmpty()) isColorValid=true;
        else System.out.println("Product color is not valid");

        if (product.getPrice()>0) isPriceValid=true;
        else System.out.println("Entered price is not valid");

        if (product.getName()!=null&&!product.getName().isEmpty()) isNameValid=true;
        else System.out.println("Product name is not valid");

        if (product.getSellerName()!=null&&!product.getSellerName().isEmpty()) isSellerValid=true;
        else System.out.println("Seller name is not valid");

        if (idProductIdValid&&isPriceValid&&isBrandValid&&isColorValid&&isSellerValid&&isNameValid){
            isProductValidated=true;
        }
        return isProductValidated;
    }
}
