package com.xworkz.shoppingmallapp.shop;


import com.xworkz.shoppingmallapp.constants.Floor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Shop {
    private int shopId;
    private String name;
    private Floor floor;
    private double area;
    private int noOfWorkers;
    private String owner;

    @Override
    public String toString(){
        return "Shop-(shopId="+this.shopId+
                " , name="+this.name+
                " , floor="+this.floor+
                " , area="+this.area+
                " , noOfWorkers="+this.noOfWorkers+
                " , owner="+this.owner+
                ")";
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof  Shop){
            Shop shop=(Shop) obj;
            if(this.shopId==shop.shopId && this.name.equals(shop.name) && this.floor.equals(shop.floor)&&this.area==shop.area && this.noOfWorkers==shop.noOfWorkers
            && this.owner.equals(shop.owner)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(shopId,name,floor,area,noOfWorkers,owner);
    }
}
