class Bistro{

	public static double getFoodPrice(String foodName){
		
		double price=0.0;
		if(foodName=="Cheese and corn pizza") {
			price=350.00;
			return price;
		}
		else if(foodName=="Masala doosa") {
			price=75.00;
			return price;
		}
		else if(foodName=="Manglore buns") {
			price=50.00;
			return price;
		}
		else if(foodName=="Gobi munchurian") {
			price=50.00;
			return price;
		}
		else if(foodName=="Masala puri"){
		 price=35.00;
		 return price;
		}
		else if(foodName=="Chole bature"){
			price=90.00;
			return price;
		}
		else if(foodName=="Set dosa") {
			price=60.00;
			return price;
		}
		else if(foodName=="Mango lassi") {
			price=75.00;
			return price;
		}
		else if(foodName=="Sweet and salty soda") {
			price=40.00;
			return price;
		}
		else if(foodName=="Idli vada") {
			price=70.00;
			return price;
		}
		else if(foodName=="Hash browns") {
			price=249.00;
			return price;
		}
		else if(foodName=="Aloo bonda") {
			price=80.00;
			return price;
		}
		else if(foodName=="Stuffed mirchi bhajji") {
			price=80.00;
			return price;
		}
		else if(foodName=="Onion pakoda") {
			price=80.00;
			return price;
		}
		else if(foodName=="Punugulu") {
			price=80.00;
			return price;
		}
		else if(foodName=="Kheema bonda") {
			price=140.00;
			return price;
		}
		else if(foodName=="Filter coffee") {
			price=60.00;
			return price;
		}
		else if(foodName=="Butter milk") {
			price=80.00;
			return price;
		}
		else if(foodName=="Ambur biryani") {
			price=190.00;
			return price;
		}
		else if(foodName=="Andhra kodi pulav") {
			price=190.00;
			return price;
		}
		else if(foodName=="Sambar sadam") {
			price=140.00;
			return price;
		}
		else if(foodName=="Rava masala") {
			price=60.00;
			return price;
		}
		else if(foodName=="Oothappam") {
			price=55.00;
			return price;
		}
		else if(foodName=="Ravi dosa") {
			price=55.00;
			return price;
		}
		else if(foodName=="Paper roast") {
			price=75.00;
			return price;
		}
		else if(foodName=="Veg sandwich") {
			price=65.00;
			return price;
		}
		else if(foodName=="Cornflake with milk") {
			price=70.00;
			return price;
		}
		else if(foodName=="Curd vada") {
			price=38.00;
			return price;
		}
		else if(foodName=="Pongal") {
			price=45.00;
			return price;
		}
		else if(foodName=="Appam") {
			price=40.00;
			return price;
		}
		
		else
			System.out.println("Invalid food name:"+foodName);
		
		return price;
	}
	
	public static double getFoodPrice(String foodName,int quantity){
		
		double price=0.0;
		if(foodName=="Cheese and corn pizza") {
			price=350.00;
			return price*quantity;
		}
		else if(foodName=="Masala doosa") {
			price=75.00;
			return price*quantity;
		}
		else if(foodName=="Manglore buns") {
			price=50.00;
			return price*quantity;
		}
		else if(foodName=="Gobi munchurian") {
			price=50.00;
			return price*quantity;
		}
		else if(foodName=="Masala puri"){
		 price=35.00;
		 return price*quantity;
		}
		else if(foodName=="Chole bature"){
			price=90.00;
			return price*quantity;
		}
		else if(foodName=="Set dosa") {
			price=60.00;
			return price*quantity;
		}
		else if(foodName=="Mango lassi") {
			price=75.00;
			return price*quantity;
		}
		else if(foodName=="Sweet and salty soda") {
			price=40.00;
			return price*quantity;
		}
		else if(foodName=="Idli vada") {
			price=70.00;
			return price*quantity;
		}
		else if(foodName=="Hash browns") {
			price=249.00;
			return price*quantity;
		}
		else if(foodName=="Aloo bonda") {
			price=80.00;
			return price*quantity;
		}
		else if(foodName=="Stuffed mirchi bhajji") {
			price=80.00;
			return price*quantity;
		}
		else if(foodName=="Onion pakoda") {
			price=80.00;
			return price*quantity;
		}
		else if(foodName=="Punugulu") {
			price=80.00;
			return price*quantity;
		}
		else if(foodName=="Kheema bonda") {
			price=140.00;
			return price*quantity;
		}
		else if(foodName=="Filter coffee") {
			price=60.00;
			return price*quantity;
		}
		else if(foodName=="Butter milk") {
			price=80.00;
			return price*quantity;
		}
		else if(foodName=="Ambur biryani") {
			price=190.00;
			return price*quantity;
		}
		else if(foodName=="Andhra kodi pulav") {
			price=190.00;
			return price*quantity;
		}
		else if(foodName=="Sambar sadam") {
			price=140.00;
			return price*quantity;
		}
		else if(foodName=="Rava masala") {
			price=60.00;
			return price*quantity;
		}
		else if(foodName=="Oothappam") {
			price=55.00;
			return price*quantity;
		}
		else if(foodName=="Ravi dosa") {
			price=55.00;
			return price*quantity;
		}
		else if(foodName=="Paper roast") {
			price=75.00;
			return price*quantity;
		}
		else if(foodName=="Veg sandwich") {
			price=65.00;
			return price*quantity;
		}
		else if(foodName=="Cornflake with milk") {
			price=70.00;
			return price*quantity;
		}
		else if(foodName=="Curd vada") {
			price=38.00;
			return price*quantity;
		}
		else if(foodName=="Pongal") {
			price=45.00;
			return price*quantity;
		}
		else if(foodName=="Appam") {
			price=40.00;
			return price*quantity;
		}
		
		else
			System.out.println("Invalid food name:"+foodName);
		
		return price;
	}

}