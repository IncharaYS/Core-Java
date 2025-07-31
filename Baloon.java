class Baloon{
	int balloonId;
	String shape;
	String gasType;
	boolean hasPattern;
	boolean isTied;
	double price;
	
	Baloon(){
	this(1);
	System.out.println("Default Constructor");
	}
	Baloon(int balloonId,String shape,String gasType,boolean hasPattern,boolean isTied,double price){
	this(30.00);
	this.balloonId=balloonId;
	this.shape=shape;
	this.gasType=gasType;
	this.hasPattern=hasPattern;
	this.isTied=isTied;
	this.price=price;
	System.out.println("Constructor for all reference initialization" );
	}
	Baloon(int balloonId){
	this(1,"Heart","Air",false,true,15.00);
	this.balloonId=balloonId;
	System.out.println("Constructor for id initialization");
	}
	Baloon(double price){
	this(1,"Circle");
	this.price=price;
	System.out.println("Constructor for price initialization");
	}
	Baloon(int balloonId,String shape){
	this("He",false);
	this.balloonId=balloonId;
	this.shape=shape;
	System.out.println("Constructor for id and shape initialization");
	}
	Baloon(String gasType,boolean hasPattern){
	this(true,20.00);
	this.gasType=gasType;
	this.hasPattern=hasPattern;
	System.out.println("Constructor for gasType and hasPattern initialization");
	}
	Baloon(boolean isTied,double price){
	this.isTied=isTied;
	this.price=price;
	System.out.println("Constructor for isTied and price initialization");
	}
	
	public void getInfo(){
		System.out.println("Balloon ID is: "+balloonId);
		System.out.println("Balloon shape is: "+shape);
		System.out.println("Balloon gas type is: "+gasType);
		System.out.println("Balloon  has pattern?: "+hasPattern);
		System.out.println("Balloon is tied?: "+isTied);
		System.out.println("Balloon price is: "+price+"\n");
	}
}