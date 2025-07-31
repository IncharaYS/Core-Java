class Flowers{
	Flowers(int flowerId,String name,String color,double price,boolean isFresh,boolean hasLongLife){
	this.flowerId=flowerId;
	this.name=name;
	this.color=color;
	this.isFresh=isFresh;
	this.price=price;
	this.hasLongLife=hasLongLife;
	}
	Flowers(int flowerId,String name,String color,double price,boolean isFresh){
	this.flowerId=flowerId;
	this.name=name;
	this.color=color;
	this.isFresh=isFresh;
	this.price=price;
	}
	Flowers(int flowerId,String name,String color,double v){
	this.flowerId=flowerId;
	this.name=name;
	this.color=color;
	this.price=price;	
	}
	Flowers(int flowerId,String name,String color){
	this.flowerId=flowerId;
	this.name=name;
	this.color=color;	
	}
	Flowers(){
		
	}
	int flowerId;
	String name;
	String color;
	boolean isFresh;
	double price;
	boolean hasLongLife;
	
	public void getInfo(){
			
	System.out.println("Flower Id is: "+flowerId);
	System.out.println("Flower color is: "+color);
	System.out.println("Flower name is: "+name);
	System.out.println("Flower price is: "+price);
	System.out.println("Flower is Fresh?:"+isFresh);
	System.out.println("Flower has long life?: "+hasLongLife+"\n");
	}
}