class SwiggyRunner{
	public static void main(String swiggy[]){
	String foodName="Chicken lasagna";
	double price=Swiggy.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Expresso tiramisu";
	price=Swiggy.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Crispy combo";
	price=Swiggy.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Toffe pudding";
	price=Swiggy.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Tender coconut juice";
	price=Swiggy.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Rasberry juice";
	price=Swiggy.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	}
}