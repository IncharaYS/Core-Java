class Hat{
	Hat(int itemId,double price,String color,String type,String material,char size){
	this.itemId=itemId;
	this.price=price;
	this.color=color;
	this.type=type;
	this.material=material;
	this.size=size;
	}
	Hat(int itemId,double price,String color){
	this.itemId=itemId;
	this.price=price;
	this.color=color;	
	}
	Hat(int itemId,double price){
	this.itemId=itemId;
	this.price=price;	
	}
	Hat(int itemId){
	this.itemId=itemId;
	}
	Hat(){
		
	}
	int itemId;
	double price;
	String color;
	String type;
	String material;
	char size;
	
	public void getInfo(){
	System.out.println("Hat Id is:"+itemId);
	System.out.println("Hat price is:"+price);
	System.out.println("Hat color is:"+color);
	System.out.println("Hat type is:"+type);
	System.out.println("Hat material is:"+material);
	System.out.println("Hat size is:"+size+"\n");
	}
}