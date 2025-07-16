class UberEatsRunner{
	public static void main(String ue[]){
	String foodName="Mango malba";
	int quantity=5;
	double price=UberEats.getFoodPrice(foodName,quantity);
	System.out.println("Price of "+foodName+" is: "+price+" and quantity is: "+quantity);
	
	foodName="Ghee rice";
	quantity=6;
	price=UberEats.getFoodPrice(foodName,quantity);
	System.out.println("Price of "+foodName+" is: "+price+" and quantity is: "+quantity);
	
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