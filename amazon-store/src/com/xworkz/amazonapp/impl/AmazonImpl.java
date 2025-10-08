package com.xworkz.amazonapp.impl;

import com.xworkz.amazonapp.constants.BrandName;
import com.xworkz.amazonapp.ecommerce.EcommerceRules;
import com.xworkz.amazonapp.exception.*;
import com.xworkz.amazonapp.product.Product;
import com.xworkz.amazonapp.validator.ProductValidator;

public class AmazonImpl implements EcommerceRules {

    public AmazonImpl(int size){
        this.products=new Product[size];
    }

    public Product[] products;
    public int index;

    @Override
    public boolean addProduct(Product product){
        boolean isProductAdded=false;
        try {
            ProductValidator productValidator = new ProductValidator();
            if (productValidator.validateProduct(product)) {
                products[index++] = product;
                isProductAdded = true;
            }
            else throw new ProductNotAddedException("Product is not added, Invalid details entered");
        }
        catch(ProductNotAddedException pnae){
            System.out.println("Product is not added");
            pnae.printStackTrace();
        }
        return isProductAdded;
    }

    @Override
    public boolean updateNameById(int existingId,String updatedName){
        boolean isNameUpdated=false;
        try {
            for (Product product : this.products) {
                if (product != null && product.getProductId() == existingId) {
                    product.setName(updatedName);
                    isNameUpdated = true;
                    System.out.println("Name of product " + product.getProductId() + " updated to:" + product.getName());
                    return isNameUpdated;
                }
            }
            throw new IdNotFoundException("Given Id is not found");
        }
        catch (IdNotFoundException infe){
            System.out.println("Product Id " + existingId + " does not exist");
            infe.printStackTrace();
        }
        return isNameUpdated;
    }

    @Override
    public boolean updatePriceById(int existingId,double updatedPrice){
        boolean isPriceUpdated=false;
        try {
            for(Product product:this.products){
                if(product != null && product.getProductId()==existingId){
                    product.setPrice(updatedPrice);
                    isPriceUpdated=true;
                    System.out.println("Price of product "+product.getProductId()+" updated to:"+product.getPrice());
                    return isPriceUpdated;
                }
            }
            throw new IdNotFoundException("Given Id is not found");
        }
        catch (IdNotFoundException infe){
            System.out.println("Product Id "+existingId+" does not exist");
            infe.printStackTrace();
        }
        return isPriceUpdated;
    }

    @Override
    public boolean updateBrandById(int existingId, BrandName updatedBrand){
        boolean isBrandUpdated=false;
        try {
            for(Product product:this.products){
                if(product != null && product.getProductId()==existingId){
                    product.setBrand(updatedBrand);
                    isBrandUpdated=true;
                    System.out.println("Brand of product "+product.getProductId()+" updated to:"+product.getBrand());
                    return isBrandUpdated;
                }
            }
            throw new IdNotFoundException("Given Id is not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("Product Id "+existingId+" does not exist");
            infe.printStackTrace();
        }
        return isBrandUpdated;
    }

    @Override
    public boolean updateColorById(int existingId,String updatedColor){
        boolean isColorUpdated=false;
        try {
            for(Product product:this.products){
                if(product != null && product.getProductId()==existingId){
                    product.setColor(updatedColor);
                    isColorUpdated=true;
                    System.out.println("Color of product "+product.getProductId()+" updated to:"+product.getColor());
                    return isColorUpdated;
                }
            }
            throw new IdNotFoundException("Given Id is not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("Product Id "+existingId+" does not exist");
            infe.printStackTrace();
        }
        return isColorUpdated;
    }

    @Override
    public boolean updateSellerNameById(int existingId,String updatedSellerName){
        boolean isSellerNameUpdated=false;
        try {
            for(Product product:this.products){
                if(product != null && product.getProductId()==existingId){
                    product.setSellerName(updatedSellerName);
                    isSellerNameUpdated=true;
                    System.out.println("Seller name of product "+product.getProductId()+" updated to:"+product.getSellerName());
                    return isSellerNameUpdated;
                }
            }
            throw new IdNotFoundException("Given Id is not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("Product Id "+existingId+" does not exist");
            infe.printStackTrace();
        }
        return isSellerNameUpdated;
    }

    @Override
    public boolean updatePriceByBrand(BrandName existingBrand,double updatedPrice){
        boolean isPriceUpdated=false;
        try {
            for(Product product:this.products){
                if(product != null && product.getBrand().equals(existingBrand)){
                    product.setPrice(updatedPrice);
                    isPriceUpdated=true;
                    System.out.println("Price of product "+product.getProductId()+" updated to:"+product.getPrice());
                    return isPriceUpdated;
                }
            }
            throw new BrandNotFoundException("Given Brand not found");
        }
        catch(BrandNotFoundException bnfe){
            System.out.println("Product brand "+existingBrand+" does not exist");
            bnfe.printStackTrace();
        }
        return isPriceUpdated;
    }

    @Override
    public String getNameById(int existingProductId){
        try {
            for(Product product:products){
                if(product != null && product.getProductId()==existingProductId){
                    return product.getName();
                }
            }
            throw new IdNotFoundException("Given Id not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("Product Id "+existingProductId+" does not exist");
            infe.printStackTrace();
        }
        return null;
    }

    @Override
    public double getPriceById(int existingProductId){
        try {
            for(Product product:products){
                if(product!=null&&product.getProductId()==existingProductId){
                    return product.getPrice();
                }
            }
            throw new IdNotFoundException("Given Id not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("Product Id "+existingProductId+" does not exist");
            infe.printStackTrace();
        }
        return 0;
    }

    @Override
    public BrandName getBrandById(int existingProductId){
        try {
            for(Product product:products){
                if(product!=null&&product.getProductId()==existingProductId){
                    return product.getBrand();
                }
            }
            throw new IdNotFoundException("Given Id not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("Product Id "+existingProductId+" does not exist");
            infe.printStackTrace();
        }
        return null;
    }

    @Override
    public String getColorById(int existingProductId){
        try {
            for(Product product:products){
                if(product!=null&&product.getProductId()==existingProductId){
                    return product.getColor();
                }
            }
            throw new IdNotFoundException("Given Id not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("Product Id "+existingProductId+" does not exist");
            infe.printStackTrace();
        }
        return null;
    }

    @Override
    public String getSellerNameById(int existingProductId){
        try {
            for(Product product:products){
                if(product!=null&&product.getProductId()==existingProductId){
                    return product.getSellerName();
                }
            }
            throw new IdNotFoundException("Given Id not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("Product Id "+existingProductId+" does not exist");
            infe.printStackTrace();
        }
        return null;
    }

    @Override
    public BrandName getBrandByName(String existingName){
        try {
            for(Product product:products){
                if(product!=null&&product.getName().equals(existingName)){
                    return product.getBrand();
                }
            }
            throw new NameNotFoundException("Given Name not found");
        }
        catch(NameNotFoundException nnfe){
            System.out.println("Product Name "+existingName+" does not exist");
            nnfe.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteProductById(int id){
        boolean isDeleted=false;
        try {
            for(int i=0;i< products.length;i++){
                if(products[i] != null && products[i].getProductId()==id){
                    for (int j=i;j<products.length-1;j++) {
                        products[j]=products[j+1];
                    }
                    products[products.length - 1] = null;
                    System.out.println("Product with id "+id+" is deleted \n");
                    isDeleted=true;
                    break;
                }
            }
            if(!isDeleted) throw new IdNotFoundException("Given id not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("No product with id "+id+" is found");
            infe.printStackTrace();
        }
    }

    @Override
    public void getProductInfo() {
        System.out.println("Product details are:");
        for (Product product: products) {
            try {
                if (product != null) {
                    System.out.println("Product Id is:" + product.getProductId());
                    System.out.println("Product name is:" + product.getName());
                    System.out.println("Product brand is:" + product.getBrand());
                    System.out.println("Product seller is:" + product.getSellerName());
                    System.out.println("Product price is:" + product.getPrice());
                    System.out.println("Product color is:" + product.getColor());
                    System.out.println("----------------------------------------------");
                }
                else throw new IdNotFoundException("Product not found");
            }
            catch(IdNotFoundException infe){
                System.out.println("Product not found");
                infe.printStackTrace();
            }
        }
    }

    @Override
    public Product getProductById(int existingId){
        Product product=null;
        try {
            for(Product pro:products){
                if(pro != null && pro.getProductId()==existingId){
                    product=pro;
                    System.out.println("Product details are:");
                    getProductDetails(pro);
                }
            }
            if(product==null) throw new IdNotFoundException("Given Id not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("No Product with id "+existingId+" is found");
            infe.printStackTrace();
        }
        return product;
    }

    @Override
    public void getProductDetails(Product product){
        try {
            if (product != null) {
                System.out.println("Product Id is:" + product.getProductId());
                System.out.println("Product name is:" + product.getName());
                System.out.println("Product brand is:" + product.getBrand());
                System.out.println("Product seller is:" + product.getSellerName());
                System.out.println("Product price is:" + product.getPrice());
                System.out.println("Product color is:" + product.getColor());
                System.out.println("----------------------------------------------");
            }
            else throw new IdNotFoundException("Product not found");
        }
        catch(IdNotFoundException infe){
            System.out.println("Product not found");
            infe.printStackTrace();
        }
    }
}
