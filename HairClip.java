class HairClip{
	HairClip(int itemId,String color,String type,double price,String size,String material){
	this.itemId=itemId;
	this.color=color;
	this.type=type;
	this.price=price;
	this.size=size;
	this.material=material;
	}
	HairClip(int itemId,String color,String type){
	this.itemId=itemId;
	this.color=color;
	this.type=type;	
	}
	HairClip(int itemId,String color){
	this.itemId=itemId;
	this.color=color;
	}
	HairClip(int itemId){
	this.itemId=itemId;
	}
	HairClip(){
		
	}
	int itemId;
	String color;
	String type;
	double price;
	String size;
	String material;
	
	public void getInfo(){
			
	System.out.println("Clip ID is: "+itemId);
	System.out.println("Clip color is: "+color);
	System.out.println("Clip type is: "+type);
	System.out.println("Clip price is: "+price);
	System.out.println("Clip size is: "+size);
	System.out.println("Clip material is: "+material+"\n");
	}
}