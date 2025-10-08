package com.xworkz.watchapp.watch;

import com.xworkz.watchapp.constants.HasValidity;
import com.xworkz.watchapp.constants.IsWaterResistant;
import com.xworkz.watchapp.constants.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Watch{
    private int watchId;
    private double price;
    private String color;
    private String brand;
    private HasValidity hasValidity;
    private Type type;
    private IsWaterResistant isWaterResistant;

    @Override
    public String toString(){
        return "Watch-(watchId="+this.watchId+
                " , price="+this.price+
                " , color="+this.color+
                " , brand="+this.brand+
                " , hasValidity="+this.hasValidity+
                " , type="+this.type+
                " , isWaterResistant="+this.isWaterResistant+
                ")";
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Watch){
            Watch watch=(Watch) obj;
            if(this.watchId==watch.watchId&&this.price==watch.price&& this.color.equals(watch.color)&&
            this.brand.equals(watch.brand)&&this.type.equals(watch.type)&&this.hasValidity.equals(watch.hasValidity)&&
            this.isWaterResistant.equals(watch.isWaterResistant)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(watchId, price, color, brand, hasValidity, type, isWaterResistant);
    }
}
