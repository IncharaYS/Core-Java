class Blazer{
	Blazer(int itemId,char size,String color,String style,String brandName,double price){
	this.itemId=itemId;
	this.size=size;
	this.color=color;
	this.style=style;
	this.brandName=brandName;
	this.price=price;
	}
	
	int itemId;
	char size;
	String color;
	String style;
	String brandName;
	double price;
	
	public void getInfo(){
	System.out.println("Blazer ID is:"+itemId);
	System.out.println("Blazer size is:"+size);
	System.out.println("Blazer color is:"+color);
	System.out.println("Blazer style is:"+style);
	System.out.println("Blazer brand name is:"+brandName);
	System.out.println("Blazer price is:"+price+"\n");
	}
}