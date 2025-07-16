class ZomatoRunner{
	public static void main(String zomato[]){
	String foodName="Pizza puff";
	int quantity=5;
	double price=Zomato.getFoodPrice(foodName,quantity);
	System.out.println("Price of "+foodName+" is: "+price+" and quantity is: "+quantity);
	
	foodName="Cheesy chicken meetballs";
	price=Zomato.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Choco chip brownie";
	quantity=19;
	price=Zomato.getFoodPrice(foodName,quantity);
	System.out.println("Price of "+foodName+" is: "+price+" and quantity is: "+quantity);
	
	foodName="Teekha Chaska Sausages";
	price=Zomato.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Pizza";
	price=Zomato.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	}
}