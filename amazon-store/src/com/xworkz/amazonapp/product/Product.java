package com.xworkz.amazonapp.product;

import com.xworkz.amazonapp.constants.BrandName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int productId;
    private String name;
    private double price;
    private BrandName brand;
    private String color;
    private String sellerName;

    @Override
    public String toString(){
        return "Product-(productId="+this.productId+
                " , name="+this.name+
                " , price="+this.price+
                " , brand="+this.brand+
                " , color="+this.color+
                " , sellerName="+this.sellerName+
                ")";
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Product){
            Product product=(Product) obj;
            if(this.productId==product.productId && this.name.equals(product.name) && this.price==product.price && this.brand.equals(product.brand) &&
            this.color.equals(product.color) && this.sellerName.equals(product.sellerName)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, name, price, brand, color, sellerName);
    }
}
