class Swiggy{

	public static double getFoodPrice(String foodName){
		
		double price=0.0;
		if(foodName=="Devils choco Brownie Moouse") price=99.00;
		else if(foodName=="Tandoori chicken burger") price=119.00;
		else if(foodName=="Crunchy chicken burger") price=115.00;
		else if(foodName=="French mocha") price=95.00;
		else if(foodName=="Mac and cheese with crunchy nuggets") price=249.00;
		else if(foodName=="Dynamic burger sider duo") price=239.00;
		else if(foodName=="Peri-Peri chicken popcorn") price=177.00;
		else if(foodName=="Classic cruncht chicken") price=99.00;
		else if(foodName=="Delto force") price=249.00;
		else if(foodName=="Gochick crunchy chicken salad") price=249.00;
		else if(foodName=="Non veg snacks box") price=399.00;
		else if(foodName=="Chicken wings") price=177.00;
		else if(foodName=="Crispy combo") price=499.00;
		else if(foodName=="Chicken lasagna") price=253.00;
		else if(foodName=="Machine gun burger") price=139.00;
		else if(foodName=="Death by chocolate") price=169.00;
		else if(foodName=="Chicken bucket") price=799.00;
		else if(foodName=="Classic chicken tenders") price=169.00;
		else if(foodName=="Crunch meal") price=449.00;
		else if(foodName=="Chicken cheese burst") price=249.00;
		else if(foodName=="Veg finger") price=169.00;
		else if(foodName=="Arancini cheese fritters") price=229.00;
		else if(foodName=="Cheese poutine") price=177.00;
		else if(foodName=="Chunchy veg burrito") price=149.00;
		else if(foodName=="Expresso tiramisu") price=189.00;
		else if(foodName=="Gulab jamun delight") price=109.00;
		else if(foodName=="Custard fruit salad") price=99.00;
		else if(foodName=="Toffe pudding") price=79.00;
		else if(foodName=="Brownie bites") price=159.00;
		else if(foodName=="Tender coconut juice") price=99.00;
		
		else System.out.println("Invalid food name:"+foodName);
		return price;
	}

}