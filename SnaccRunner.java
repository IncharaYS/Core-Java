class SnaccRunner{
	public static void main(String snacc[]){
	String foodName="Hot and Sour veg soup";
	double price=Snacc.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Rumali roti";
	price=Snacc.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Gobi parata";
	price=Snacc.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Masala pepsi";
	price=Snacc.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Masala papad";
	price=Snacc.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Papad";
	price=Snacc.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	}
}