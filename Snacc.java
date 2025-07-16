class Snacc{

	public static double getFoodPrice(String foodName){
		
		double price=0.0;
		if(foodName=="Kubboos"){
			price=22.00;
			return price;
		}
		else if(foodName=="Kalmi kebab") {
			price=189.00;
			return price;
		}
		else if(foodName=="Prawns chilli dry") {
			price=295.00;
			return price;
		}
		else if(foodName=="Paneer manchurian") {
			price=178.00;
			return price;
		}
		else if(foodName=="Masala papad") {
			price=89.00;
			return price;
		}
		else if(foodName=="Boiled egg") {
			price=55.00;
			return price;
		}
		else if(foodName=="Egg omelette") {
			price=119.00;
			return price;
		}
		else if(foodName=="Ghee chapati") {
			price=41.00;
			return price;
		}
		else if(foodName=="Tandoori roti") {
			price=39.00;
			return price;
		}
		else if(foodName=="Kulcha") {
			price=49.00;
			return price;
		}
		else if(foodName=="Chicken varuval") {
			price=182.00;
			return price;
		}
		else if(foodName=="Dal fry") {
			price=112.00;
			return price;
		}
		else if(foodName=="Veg kadai") {
			price=149.00;
			return price;
		}
		else if(foodName=="Chicken manchow soup") {
			price=145.00;
			return price;
		}
		else if(foodName=="Hot and Sour veg soup") {
			price=135.00;
			return price;
		}
		else if(foodName=="Cheesy mexican sub") {
			price=230.30;
			return price;
		}
		else if(foodName=="Biryani rice combo") {
			price=230.00;
			return price;
		}
		else if(foodName=="Checken leg") {
			price=200.00;
			return price;
		}
		else if(foodName=="Lemon chicken") {
			price=190.00;
			return price;
		}
		else if(foodName=="Red chicken") {
			price=180.00;
			return price;
		}
		else if(foodName=="Vrat aloo pattice") {
			price=99.00;
			return price;
		}
		else if(foodName=="Rumali roti") {
			price=179.00;
			return price;
		}
		else if(foodName=="Gobi parata") {
			price=199.00;
			return price;
		}
		else if(foodName=="Sabudana Khichdi") {
			price=219.00;
			return price;
		}
		else if(foodName=="Chicken tikka masala") {
			price=159.00;
			return price;
		}
		else if(foodName=="Classic chicken zinger burger") {
			price=199.04;
			return price;
		}
		else if(foodName=="Chicken popcorn rice bowl") {
			price=229.00;
			return price;
		}
		else if(foodName=="Masala pepsi") {
			price=105.00;
			return price;
		}
		else if(foodName=="Palak paneer") {
			price=189.00;
			return price;
		}
		else if(foodName=="Mutton kofta") {
			price=209.00;
			return price;
		}
		
		else System.out.println("Invalid food name:"+foodName);
		return price;
	}
	
	public static double getFoodPrice(String foodName,int quantity){
		
		double price=0.0;
		if(foodName=="Kubboos"){
			price=22.00;
			return price*quantity;
		}
		else if(foodName=="Kalmi kebab") {
			price=189.00;
			return price*quantity;
		}
		else if(foodName=="Prawns chilli dry") {
			price=295.00;
			return price*quantity;
		}
		else if(foodName=="Paneer manchurian") {
			price=178.00;
			return price*quantity;
		}
		else if(foodName=="Masala papad") {
			price=89.00;
			return price*quantity;
		}
		else if(foodName=="Boiled egg") {
			price=55.00;
			return price*quantity;
		}
		else if(foodName=="Egg omelette") {
			price=119.00;
			return price*quantity;
		}
		else if(foodName=="Ghee chapati") {
			price=41.00;
			return price*quantity;
		}
		else if(foodName=="Tandoori roti") {
			price=39.00;
			return price*quantity;
		}
		else if(foodName=="Kulcha") {
			price=49.00;
			return price*quantity;
		}
		else if(foodName=="Chicken varuval") {
			price=182.00;
			return price*quantity;
		}
		else if(foodName=="Dal fry") {
			price=112.00;
			return price*quantity;
		}
		else if(foodName=="Veg kadai") {
			price=149.00;
			return price*quantity;
		}
		else if(foodName=="Chicken manchow soup") {
			price=145.00;
			return price*quantity;
		}
		else if(foodName=="Hot and Sour veg soup") {
			price=135.00;
			return price*quantity;
		}
		else if(foodName=="Cheesy mexican sub") {
			price=230.30;
			return price*quantity;
		}
		else if(foodName=="Biryani rice combo") {
			price=230.00;
			return price*quantity;
		}
		else if(foodName=="Checken leg") {
			price=200.00;
			return price*quantity;
		}
		else if(foodName=="Lemon chicken") {
			price=190.00;
			return price*quantity;
		}
		else if(foodName=="Red chicken") {
			price=180.00;
			return price*quantity;
		}
		else if(foodName=="Vrat aloo pattice") {
			price=99.00;
			return price*quantity;
		}
		else if(foodName=="Rumali roti") {
			price=179.00;
			return price*quantity;
		}
		else if(foodName=="Gobi parata") {
			price=199.00;
			return price*quantity;
		}
		else if(foodName=="Sabudana Khichdi") {
			price=219.00;
			return price*quantity;
		}
		else if(foodName=="Chicken tikka masala") {
			price=159.00;
			return price*quantity;
		}
		else if(foodName=="Classic chicken zinger burger") {
			price=199.04;
			return price*quantity;
		}
		else if(foodName=="Chicken popcorn rice bowl") {
			price=229.00;
			return price*quantity;
		}
		else if(foodName=="Masala pepsi") {
			price=105.00;
			return price*quantity;
		}
		else if(foodName=="Palak paneer") {
			price=189.00;
			return price*quantity;
		}
		else if(foodName=="Mutton kofta") {
			price=209.00;
			return price*quantity;
		}
		
		else System.out.println("Invalid food name:"+foodName);
		return price;
	}

}