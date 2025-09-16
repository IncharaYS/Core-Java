package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.constants.BrandName;
import com.xworkz.amazonapp.product.Product;
import com.xworkz.amazonapp.validator.ProductValidator;

public class Amazon {

    public Amazon(int size){
        this.products=new Product[size];
    }

    public Product[] products;
    public int index;

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

    public boolean updateNameById(int existingId,String updatedName){
        boolean isNameUpdated=false;
        for(Product product:this.products){
            if(product.getProductId()==existingId){
                product.setName(updatedName);
                isNameUpdated=true;
                System.out.println("Name of product "+product.getProductId()+" updated to:"+product.getName());
            }
            if(!isNameUpdated) System.out.println("Product Id "+existingId+" does not exist");
        }

        return isNameUpdated;
    }

    public boolean updatePriceById(int existingId,double updatedPrice){
        boolean isPriceUpdated=false;
        for(Product product:this.products){
            if(product.getProductId()==existingId){
                product.setPrice(updatedPrice);
                isPriceUpdated=true;
                System.out.println("Price of product "+product.getProductId()+" updated to:"+product.getPrice());
            }
            if(!isPriceUpdated) System.out.println("Product Id "+existingId+" does not exist");
        }

        return isPriceUpdated;
    }

    public boolean updateBrandById(int existingId, BrandName updatedBrand){
        boolean isBrandUpdated=false;
        for(Product product:this.products){
            if(product.getProductId()==existingId){
                product.setBrand(updatedBrand);
                isBrandUpdated=true;
                System.out.println("Brand of product "+product.getProductId()+" updated to:"+product.getBrand());
            }
            if(!isBrandUpdated) System.out.println("Product Id "+existingId+" does not exist");
        }

        return isBrandUpdated;
    }

    public boolean updateColorById(int existingId,String updatedColor){
        boolean isColorUpdated=false;
        for(Product product:this.products){
            if(product.getProductId()==existingId){
                product.setColor(updatedColor);
                isColorUpdated=true;
                System.out.println("Color of product "+product.getProductId()+" updated to:"+product.getColor());
            }
            if(!isColorUpdated) System.out.println("Product Id "+existingId+" does not exist");
        }

        return isColorUpdated;
    }

    public boolean updateSellerNameById(int existingId,String updatedSellerName){
        boolean isSellerNameUpdated=false;
        for(Product product:this.products){
            if(product.getProductId()==existingId){
                product.setSellerName(updatedSellerName);
                isSellerNameUpdated=true;
                System.out.println("Seller name of product "+product.getProductId()+" updated to:"+product.getSellerName());
            }
            if(!isSellerNameUpdated) System.out.println("Product Id "+existingId+" does not exist");
        }

        return isSellerNameUpdated;
    }

    public boolean updatePriceByBrand(BrandName existingBrand,double updatedPrice){
        boolean isPriceUpdated=false;
        for(Product product:this.products){
            if(product.getBrand().equals(existingBrand)){
                product.setPrice(updatedPrice);
                isPriceUpdated=true;
                System.out.println("Price of product "+product.getProductId()+" updated to:"+product.getPrice());
            }
            if(!isPriceUpdated) System.out.println("Product brand "+existingBrand+" does not exist");
        }

        return isPriceUpdated;
    }

    public String getNameById(int existingProductId){
        boolean isIdFound=false;
        for(Product product:products){
            if(product.getProductId()==existingProductId){
                isIdFound=true;
                return product.getName();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    public double getPriceById(int existingProductId){
        boolean isIdFound=false;
        for(Product product:products){
            if(product!=null&&product.getProductId()==existingProductId){
                isIdFound=true;
                return product.getPrice();
            }
        }
        System.out.println("Id entered is not found");
        return 0;
    }

    public BrandName getBrandById(int existingProductId){
        boolean isIdFound=false;
        for(Product product:products){
            if(product!=null&&product.getProductId()==existingProductId){
                isIdFound=true;
                return product.getBrand();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    public String getColorById(int existingProductId){
        boolean isIdFound=false;
        for(Product product:products){
            if(product!=null&&product.getProductId()==existingProductId){
                isIdFound=true;
                return product.getColor();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }

    public String getSellerNameById(int existingProductId){
        boolean isIdFound=false;
        for(Product product:products){
            if(product!=null&&product.getProductId()==existingProductId){
                isIdFound=true;
                return product.getSellerName();
            }
        }
        System.out.println("Id entered is not found");
        return null;
    }


    public BrandName getBrandByName(String existingName){
        boolean isIdFound=false;
        for(Product product:products){
            if(product!=null&&product.getName().equals(existingName)){
                isIdFound=true;
                return product.getBrand();
            }
        }
        System.out.println("Name not found");
        return null;
    }


    public void deleteProductById(int id){
        boolean isDeleted=false;
        for(int i=0;i< products.length;i++){
            if(products[i].getProductId()==id&&products[i]!=null){
                for (int j=i;j<products.length-1;j++) {
                    products[j]=products[j+1];
                }
                products[products.length - 1] = null;
                System.out.println("Product with id "+id+"is deleted \n");
                isDeleted=true;
                break;
            }
        }
        if(!isDeleted) System.out.println("No product with id "+id+" is found");
    }


    public void getProductInfo() {
        System.out.println("Product details are:");
        for (Product product: products) {
            if (product != null) {
                System.out.println("Product Id is:" + product.getProductId());
                System.out.println("Product name is:" + product.getName());
                System.out.println("Product brand is:" + product.getBrand());
                System.out.println("Product seller is:" + product.getSellerName());
                System.out.println("Product price is:" + product.getPrice());
                System.out.println("Product color is:" + product.getColor());
                System.out.println("----------------------------------------------");
            }
            else {
                System.out.println("Product not found");
                System.out.println("----------------------------------------------");
            }
        }

    }

    public Product getProductById(int existingId){
        Product product=null;
        for(Product pro:products){
            if(pro.getProductId()==existingId){
                product=pro;
                System.out.println("Product details are:");
                getProductDetails(pro);
            }
        }
        return product;
    }

    public void getProductDetails(Product product){
        if (product != null) {
            System.out.println("Product Id is:" + product.getProductId());
            System.out.println("Product name is:" + product.getName());
            System.out.println("Product brand is:" + product.getBrand());
            System.out.println("Product seller is:" + product.getSellerName());
            System.out.println("Product price is:" + product.getPrice());
            System.out.println("Product color is:" + product.getColor());
            System.out.println("----------------------------------------------");
        }
        else {
            System.out.println("Product not found");
            System.out.println("----------------------------------------------");
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
