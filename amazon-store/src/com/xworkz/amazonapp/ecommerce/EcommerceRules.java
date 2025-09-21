package com.xworkz.amazonapp.ecommerce;

import com.xworkz.amazonapp.constants.BrandName;
import com.xworkz.amazonapp.product.Product;

public interface EcommerceRules {

    boolean addProduct(Product product);
    boolean updateNameById(int existingId,String updatedName);
    boolean updatePriceById(int existingId,double updatedPrice);
    boolean updateBrandById(int existingId, BrandName updatedBrand);
    boolean updateColorById(int existingId,String updatedColor);
    boolean updateSellerNameById(int existingId,String updatedSellerName);
    boolean updatePriceByBrand(BrandName existingBrand,double updatedPrice);
    String getNameById(int existingProductId);
    double getPriceById(int existingProductId);
    BrandName getBrandById(int existingProductId);
    String getColorById(int existingProductId);
    String getSellerNameById(int existingProductId);
    BrandName getBrandByName(String existingName);
    void deleteProductById(int id);
    void getProductInfo();
    Product getProductById(int existingId);
    void getProductDetails(Product product);

}
