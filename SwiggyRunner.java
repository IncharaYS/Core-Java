class SwiggyRunner{
	public static void main(String swiggy[]){
	String foodName="Chicken lasagna";
	int quantity=3;
	double price=Swiggy.getFoodPrice(foodName,quantity);
	System.out.println("Price of "+foodName+" is: "+price+" and quantity ids: "+quantity);
	
	foodName="Expresso tiramisu";
	price=Swiggy.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Crispy combo";
	quantity=7;
	price=Swiggy.getFoodPrice(foodName,quantity);
	System.out.println("Price of "+foodName+" is: "+price+" and quantity ids: "+quantity);
	
	foodName="Toffe pudding";
	quantity=3;
	price=Swiggy.getFoodPrice(foodName,quantity);
	System.out.println("Price of "+foodName+" is: "+price+" and quantity ids: "+quantity);
	
	foodName="Tender coconut juice";
	price=Swiggy.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Rasberry juice";
	price=Swiggy.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	}
}