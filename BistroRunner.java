class BistroRunner{
	public static void main(String bistro[]){
	String foodName="Kheema bonda";
	double price=Bistro.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Aloo bonda";
	price=Bistro.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Paper roast";
	price=Bistro.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Manglore buns";
	price=Bistro.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Mango lassi";
	price=Bistro.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Idli sambar";
	price=Bistro.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	}
}