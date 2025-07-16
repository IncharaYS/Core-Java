class Bistro{

	public static double getFoodPrice(String foodName){
		
		double price=0.0;
		if(foodName=="Cheese and corn pizza") price=350.00;
		else if(foodName=="Masala doosa") price=75.00;
		else if(foodName=="Manglore buns") price=50.00;
		else if(foodName=="Gobi munchurian") price=50.00;
		else if(foodName=="Masala puri") price=35.00;
		else if(foodName=="Chole bature") price=90.00;
		else if(foodName=="Set dosa") price=60.00;
		else if(foodName=="Mango lassi") price=75.00;
		else if(foodName=="Sweet and salty soda") price=40.00;
		else if(foodName=="Idli vada") price=70.00;
		else if(foodName=="Hash browns") price=249.00;
		else if(foodName=="Aloo bonda") price=80.00;
		else if(foodName=="Stuffed mirchi bhajji") price=80.00;
		else if(foodName=="Onion pakoda") price=80.00;
		else if(foodName=="Punugulu") price=80.00;
		else if(foodName=="Kheema bonda") price=140.00;
		else if(foodName=="Filter coffee") price=60.00;
		else if(foodName=="Butter milk") price=80.00;
		else if(foodName=="Ambur biryani") price=190.00;
		else if(foodName=="Andhra kodi pulav") price=190.00;
		else if(foodName=="Sambar sadam") price=140.00;
		else if(foodName=="Rava masala") price=60.00;
		else if(foodName=="Oothappam") price=55.00;
		else if(foodName=="Ravi dosa") price=55.00;
		else if(foodName=="Paper roast") price=75.00;
		else if(foodName=="Veg sandwich") price=65.00;
		else if(foodName=="Cornflake with milk") price=70.00;
		else if(foodName=="Curd vada") price=38.00;
		else if(foodName=="Pongal") price=45.00;
		else if(foodName=="Appam") price=40.00;
		
		else System.out.println("Invalid food name:"+foodName);
		return price;
	}

}