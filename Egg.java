class Egg{
    int eggId;
    String type;
    char size;
    boolean isFresh;
    boolean isOrganic;
    double price;

    Egg(){
	this(1,"Brown",'M',true,true,6.00);
	System.out.println("Default constructor");
    }

    Egg(int eggId,String type,char size,boolean isFresh,boolean isOrganic,double price){
	this(true,false,'L');
	this.eggId=eggId;
	this.type=type;
	this.size=size;
	this.isFresh=isFresh;
	this.isOrganic=isOrganic;
	this.price=price;
	System.out.println("Constructor with all values initialization");
    }

    Egg(int eggId){
	this(10,"Brown",'L',true,false,8.00);
	this.eggId=eggId;
	System.out.println("Constructor with eggId initialization");
    }

    Egg(String type){
	this(10);
	this.type=type;
	System.out.println("Constructor with type initialization");
    }

    Egg(double price,String type){
	this('S');
	this.price=price;
	this.type=type;
	System.out.println("Constructor with price and type initialization");
    }

    Egg(char size){
	this(2);
	this.size=size;
	System.out.println("Constructor with size initialization");
    }

    Egg(boolean isFresh,boolean isOrganic,char size){
	this.isFresh=isFresh;
	this.isOrganic=isOrganic;
	this.size=size;
	System.out.println("Constructor with isFresh, isOrganic, size initialization");
    }

    public void getInfo(){
	System.out.println("Egg ID is: "+eggId);
	System.out.println("Type is: "+type);
	System.out.println("Size is: "+size);
	System.out.println("Is Fresh?: "+isFresh);
    System.out.println("Is Organic?: "+isOrganic);
	System.out.println("Price is: "+price+"\n");
    }
}
