class Tomato{
    int tomatoId;
    String color;
    double price;
    boolean isFresh;
    boolean isOrganic;
    int shelfLife;

    Tomato(){
	this(1,"Red",25.5,true,true,7);
	System.out.println("Default constructor");
    }

    Tomato(int tomatoId,String color,double price,boolean isFresh,boolean isOrganic,int shelfLife){
	this(true,false,5);
	this.tomatoId=tomatoId;
	this.color=color;
	this.price=price;
	this.isFresh=isFresh;
	this.isOrganic=isOrganic;
	this.shelfLife=shelfLife;
	System.out.println("Constructor with all values initialization");
    }

    Tomato(int tomatoId){
	this("Green");
	this.tomatoId=tomatoId;
	System.out.println("Constructor with tomatoId initialization");
    }

    Tomato(String color){
	this(false,false,8);
	this.color=color;
	System.out.println("Constructor with color initialization");
    }

    Tomato(double price,String color){
	this(2);
	this.price=price;
	this.color=color;
	System.out.println("Constructor with price and color initialization");
    }

    Tomato(boolean isFresh,boolean isOrganic,int shelfLife){
	this.isFresh=isFresh;
	this.isOrganic=isOrganic;
	this.shelfLife=shelfLife;
	System.out.println("Constructor with isFresh, isOrganic, shelfLife initialization");
    }

    Tomato(int shelfLife,double price){
	this("Yellow");
	this.shelfLife=shelfLife;
	this.price=price;
	System.out.println("Constructor with shelfLife and price initialization");
    }

    public void getInfo(){
        System.out.println("Tomato ID is: "+tomatoId);
        System.out.println("Color is: "+color);
        System.out.println("Price is: "+price);
        System.out.println("Is Fresh?: "+isFresh);
        System.out.println("Is Organic?: "+isOrganic);
        System.out.println("Shelf Lifeis : "+shelfLife+"\n");
    }
}
