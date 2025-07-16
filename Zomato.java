class Zomato{

	public static double getFoodPrice(String foodName){
		
		double price=0.0;
		if(foodName=="Fried paneer Korean wrap") price=134.50;
		else if(foodName=="Baked Margheritha pizza wrap") price=94.50;
		else if(foodName=="Baked chicken ticcka wrap") price=139.50;
		else if(foodName=="Smoky chicken shawarma") price=199.00;
		else if(foodName=="Masala paneer tikka") price=189.00;
		else if(foodName=="Paneer signature rice bowl") price=134.50;
		else if(foodName=="Royal chicken rice bowl") price=365.00;
		else if(foodName=="Burger wrap") price=269.00;
		else if(foodName=="Potato wedges") price=89.00;
		else if(foodName=="French fries") price=129.00;
		else if(foodName=="Pizza puff") price=89.00;
		else if(foodName=="Potato chilli shots") price=109.00;
		else if(foodName=="Falafel shots") price=69.00;
		else if(foodName=="Cheese Wedges") price=139.00;
		else if(foodName=="Cheesy chicken meetballs") price=139.00;
		else if(foodName=="Teekha Chaska") price=200.00;
		else if(foodName=="Teekha Chaska Sausages") price=139.00;
		else if(foodName=="Cold coffee") price=119.00;
		else if(foodName=="Lemon ice tea") price=59.00;
		else if(foodName=="Walnut brownie") price=99.00;
		else if(foodName=="Choco lava cake") price=99.00;
		else if(foodName=="New York cheesecake") price=179.00;
		else if(foodName=="Moong dal halwa") price=99.00;
		else if(foodName=="Belgian chocolate ice cream") price=99.00;
		else if(foodName=="Mango cheesecake") price=199.00;
		else if(foodName=="Choco chip brownie") price=99.00;
		else if(foodName=="Mint buttermilk") price=50.00;
		else if(foodName=="Chicken keema rice feast") price=209.00;
		else if(foodName=="Egg rice bowl") price=179.00;
		else if(foodName=="Sizzled falafel Shawarma") price=179.00;
		
		else System.out.println("Invalid food name:"+foodName);
		return price;
	}

}