class UberEatsRunner{
	public static void main(String ue[]){
	String foodName="Mango malba";
	double price=UberEats.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Ghee rice";
	price=UberEats.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Chilli chicken boneless";
	price=UberEats.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Kesar Badam kulfi";
	price=UberEats.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Chicken popcorn";
	price=UberEats.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	
	}
}