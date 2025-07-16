class ZomatoRunner{
	public static void main(String zomato[]){
	String foodName="Pizza puff";
	double price=Zomato.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Cheesy chicken meetballs";
	price=Zomato.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Choco chip brownie";
	price=Zomato.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Teekha Chaska Sausages";
	price=Zomato.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Pizza";
	price=Zomato.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	}
}