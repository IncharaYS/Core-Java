package com.xworkz.clothingapp;

import com.xworkz.clothingapp.clothing.Clothing;
import java.util.ArrayList;
import java.util.List;

public class ClothingRunner {
    public static void main(String[] args) {
        List<Clothing> clothingList=new ArrayList<>();

        clothingList.add(new Clothing(1,"Nike","M","Black",2499.0,"Cotton"));
        clothingList.add(new Clothing(2,"Adidas","L","White",2799.0,"Polyester"));
        clothingList.add(new Clothing(3,"Puma","S","Blue",1999.0,"Nylon"));
        clothingList.add(new Clothing(4,"Levis","M","Dark Blue",3499.0,"Denim"));
        clothingList.add(new Clothing(5,"Zara","L","Beige",3999.0,"Linen"));
        clothingList.add(new Clothing(6,"H&M","XL","Gray",2199.0,"Cotton"));
        clothingList.add(new Clothing(7,"Under Armour","M","Red",2599.0,"Polyester"));
        clothingList.add(new Clothing(8,"Gucci","L","Black",8999.0,"Silk"));
        clothingList.add(new Clothing(9,"Louis Vuitton","M","Brown",9999.0,"Leather"));
        clothingList.add(new Clothing(10,"Uniqlo","S","Green",1899.0,"Cotton"));

        System.out.println("Clothing list 1:");
        for(Clothing clothing:clothingList){
            System.out.println(clothing);
        }
        System.out.println();

        List<Clothing> clothingList2=new ArrayList<>();

        clothingList2.add(new Clothing(11,"Calvin Klein","L","White",4499.0,"Cotton"));
        clothingList2.add(new Clothing(12,"Tommy Hilfiger","M","Navy Blue",4999.0,"Cotton"));
        clothingList2.add(new Clothing(13,"Allen Solly","M","Gray",2299.0,"Polyester"));
        clothingList2.add(new Clothing(14,"Peter England","L","Light Blue",1999.0,"Cotton"));
        clothingList2.add(new Clothing(15,"Raymond","XL","Black",2999.0,"Wool"));
        clothingList2.add(new Clothing(16,"Wrangler","L","Dark Blue",3199.0,"Denim"));
        clothingList2.add(new Clothing(17,"Van Heusen","M","Maroon",2799.0,"Linen"));
        clothingList2.add(new Clothing(18,"Gap","L","Olive",2399.0,"Cotton"));
        clothingList2.add(new Clothing(19,"Jack & Jones","M","White",2699.0,"Linen"));
        clothingList2.add(new Clothing(20,"Pepe Jeans","S","Blue",2599.0,"Denim"));

        System.out.println("Clothing list 2:");
        for(Clothing clothing:clothingList2){
            System.out.println(clothing);
        }
        System.out.println();

        clothingList.addAll(clothingList2);
        System.out.println("Full clothing list:");
        for(Clothing clothing:clothingList){
            System.out.println(clothing);
        }
        System.out.println();

        Clothing clothing1=new Clothing(6,"H&M","XL","Gray",2199.0,"Cotton");
        Clothing clothing2=new Clothing(21,"Armani","M","Black",7599.0,"Silk");
        clothingList.add(4,clothing2);

        System.out.println("Does list contain clothing1:"+clothingList.contains(clothing1));
        System.out.println("Does list contain clothingList2:"+clothingList.containsAll(clothingList2));
        System.out.println();

        clothingList.remove(clothing1);
        clothingList.remove(7);

        System.out.println("Clothing list after remove(Object) and remove(index):");
        for(Clothing clothing:clothingList){
            System.out.println(clothing);
        }
        System.out.println();

        clothingList.removeAll(clothingList2);
        System.out.println("Clothing list after removing clothingList2:");
        for(Clothing clothing:clothingList){
            System.out.println(clothing);
        }
        System.out.println();

        System.out.println("Does list contain clothing1:"+clothingList.contains(clothing1));
        System.out.println("Does list contain clothingList2:"+clothingList.containsAll(clothingList2));
        System.out.println();

        clothingList.addAll(clothingList2);
        clothingList.retainAll(clothingList2);

        System.out.println("Clothing list after retaining only clothingList2:");
        for(Clothing clothing:clothingList){
            System.out.println(clothing);
        }
        System.out.println();
    }
}
