class Bucket{
    int bucketId;
    String color;
    double capacity;
    boolean isRecyclable;
    double price;
    boolean hasLid;

    Bucket(){
	this(1,"Blue",10.0,true,199.00,false);
	System.out.println("Default constructor");
    }

    Bucket(int bucketId,String color,double capacity,boolean isRecyclable,double price,boolean hasLid){
	this(true,149.00,"Green");
	this.bucketId=bucketId;
	this.color=color;
	this.capacity=capacity;
	this.isRecyclable=isRecyclable;
	this.price=price;
	this.hasLid=hasLid;
	System.out.println("Constructor with all values initialization");
    }

    Bucket(int bucketId){
	this("Red");
	this.bucketId=bucketId;
	System.out.println("Constructor with bucketId initialization");
    }

    Bucket(String color){
	this(true,100.00,"Blue");
	this.color=color;
	System.out.println("Constructor with color initialization");
    }

    Bucket(double price,String color){
	this(5,20.00);
	this.price=price;
	this.color=color;
	System.out.println("Constructor with price and color initialization");
    }

    Bucket(int bucketId,double capacity){
	this("Yellow");
	this.bucketId=bucketId;
	this.capacity=capacity;
	System.out.println("Constructor with bucketId and capacity initialization");
    }

    Bucket(boolean hasLid,double price,String color){
	this.hasLid=hasLid;
	this.price=price;
	this.color=color;
	System.out.println("Constructor with hasLid, price, color initialization");
    }

    public void getInfo(){
        System.out.println("Bucket ID is: "+bucketId);
        System.out.println("Color is: "+color);
        System.out.println("Capacity is: "+capacity+" l");
        System.out.println("Is Recyclable?: "+isRecyclable);
        System.out.println("Price is: "+price);
        System.out.println("Has Lid?: "+hasLid+"\n");
    }
}
