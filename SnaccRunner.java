class SnaccRunner{
	public static void main(String snacc[]){
	String foodName="Hot and Sour veg soup";
	int quantity=8;
	double price=Snacc.getFoodPrice(foodName,quantity);
	System.out.println("Price of "+foodName+" is: "+price+" and quantity is: "+quantity);
	
	foodName="Rumali roti";
	price=Snacc.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Gobi parata";
	quantity=3;
	price=Snacc.getFoodPrice(foodName,quantity);
	System.out.println("Price of "+foodName+" is: "+price+" and quantity is: "+quantity);
	
	foodName="Masala pepsi";
	quantity=6;
	price=Snacc.getFoodPrice(foodName,quantity);
	System.out.println("Price of "+foodName+" is: "+price+" and quantity is: "+quantity);
	
	foodName="Masala papad";
	price=Snacc.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	
	foodName="Papad";
	price=Snacc.getFoodPrice(foodName);
	System.out.println("Price of "+foodName+" is: "+price);
	}
}