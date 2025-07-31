class NailPolish {
    int nailPolishId;
    String color;
    String brand;
    int quantity;
    boolean isLongLasting;
    double price;

    NailPolish(){
	this(7,"Red","Lakme",10,true,199.99);
	System.out.println("Default constructor");
    }

    NailPolish(int nailPolishId,String color,String brand,int quantity,boolean isLongLasting,double price){
	this(true,149.99,"Maybelline");
	this.nailPolishId=nailPolishId;
	this.color=color;
	this.brand=brand;
	this.quantity=quantity;
	this.isLongLasting=isLongLasting;
	this.price=price;
	System.out.println("Constructor with all values initialization");
    }

    NailPolish(int nailPolishId){
	this(7.5,"Nykaa");
	this.nailPolishId=nailPolishId;
	System.out.println("Constructor with nailPolishId initialization");
    }

    NailPolish(double price,String brand){
	this("Blue");
	this.price=price;
	this.brand=brand;
	System.out.println("Constructor with price and brand initialization");
    }

    NailPolish(String color){
	this();
	this.color=color;
	System.out.println("Constructor with color initialization");
    }

    NailPolish(int quantity,int nailPolishId){
	this(10);
	this.quantity=quantity;
	this.nailPolishId=nailPolishId;
	System.out.println("Constructor with quantity and nailPolishId initialization");
    }

    NailPolish(boolean isLongLasting,double price,String brand){
	this.isLongLasting=isLongLasting;
	this.price=price;
	this.brand=brand;
	System.out.println("Constructor with isLongLasting, price, brand initialization");
    }

    public void getInfo(){
	System.out.println("Nail Polish ID is: "+nailPolishId);
	System.out.println("Color is: "+color);
	System.out.println("Brand is: "+brand);
	System.out.println("Quantity is: "+quantity);
	System.out.println("Is Long Lasting?: "+isLongLasting);
	System.out.println("Price is: "+price+"\n");
    }
}
