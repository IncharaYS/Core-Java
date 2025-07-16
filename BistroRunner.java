class BistroRunner{
	public static void main(String bistro[]){
	String foodName="Kheema bonda";
	int quantity=9;
	double price=Bistro.getFoodPrice(foodName,quantity);
	System.out.println("Price of "+foodName+" is: "+price+" and quantity is: "+quantity);
	
	foodName="Aloo bonda";
	price=Bistro.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Paper roast";
	quantity=2;
	price=Bistro.getFoodPrice(foodName,quantity);
	System.out.println("Price of "+foodName+" is: "+price+" and quantity is: "+quantity);
	
	foodName="Manglore buns";
	quantity=1;
	price=Bistro.getFoodPrice(foodName,quantity);
	System.out.println("Price of "+foodName+" is: "+price+" and quantity is: "+quantity);
	
	foodName="Mango lassi";
	price=Bistro.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Idli sambar";
	price=Bistro.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	}
}