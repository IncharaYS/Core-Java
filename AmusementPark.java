class AmusementPark{
	AmusementPark(int parkId,String name,String location,String openingTime,String closingTime,double price){
	this.parkId=parkId;
	this.name=name;
	this.location=location;
	this.openingTime=openingTime;
	this.closingTime=closingTime;
	this.price=price;	
	}
	AmusementPark(){
		
	}
	AmusementPark(int parkId,String name,String location){
	this.parkId=parkId;
	this.name=name;
	this.location=location;
	}
	AmusementPark(String openingTime,String closingTime){
	this.openingTime=openingTime;
	this.closingTime=closingTime;	
	}
	AmusementPark(double price){
	this.price=price;	
	}
	int parkId;
	String name;
	String location;
	String openingTime;
	String closingTime;
	double price;
	
	public void getInfo(){
	System.out.println("Park id is:"+parkId);
	System.out.println("Park name is:"+name);
	System.out.println("Park location is:"+location);
	System.out.println("Park opening Time is:"+openingTime);
	System.out.println("Park closing Time is:"+closingTime);
	System.out.println("Park price is:"+price+"\n");
	}
}