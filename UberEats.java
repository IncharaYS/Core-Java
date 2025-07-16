class UberEats{

	public static double getFoodPrice(String foodName){
		
		double price=0.0;
		if(foodName=="Apple beetroot carrot juice") {
			price=149.00;
			return price;
		}
		else if(foodName=="Rooh Afza") {
			price=129.00;
			return price;
		}
		else if(foodName=="Chocolate icecream shake") {
			price=149.00;
			return price;
		}
		else if(foodName=="Watermelon bites fruit bowl") {
			price=99.00;
			return price;
		}
		else if(foodName=="Special sundae") {
			price=149.00;
			return price;
		}
		else if(foodName=="Royal Falooda") {
			price=179.00;
			return price;
		}
		else if(foodName=="Sweet lassi") {
			price=89.00;
			return price;
		}
		else if(foodName=="Peach ice tea") {
			price=129.00;
			return price;
		}
		else if(foodName=="Matcha boba tea") {
			price=199.00;
			return price;
		}
		else if(foodName=="Green apple mojito") {
			price=129.00;
			return price;
		}
		else if(foodName=="Blue lime soda") {
			price=79.00;
			return price;
		}
		else if(foodName=="Kesar Badam kulfi") {
			price=79.00;
			return price;
		}
		else if(foodName=="Mango malba") {
			price=249.00;
			return price;
		}
		else if(foodName=="Egg and Cheese Panini") {
			price=199.00;
			return price;
		}
		else if(foodName=="Vanilla french toast") {
			price=199.00;
			return price;
		}
		else if(foodName=="Chicken tandoori") {
			price=179.00;
			return price;
		}
		else if(foodName=="Chicken kabab") {
			price=129.00;
			return price;
		}
		else if(foodName=="Chicken pepper dry") {
			price=182.00;
			return price;
		}
		else if(foodName=="Ghee rice") {
			price=110.00;
			return price;
		}
		else if(foodName=="Chilli chicken boneless") {
			price=179.00;
			return price;
		}
		else if(foodName=="Curd rice") {
			price=189.00;
			return price;
		}
		else if(foodName=="Butter chicken") {
			price=189.00;
			return price;
		}
		else if(foodName=="Egg Bhurji") {
			price=99.00;
			return price;
		}
		else if(foodName=="Kadai paneer") {
			price=169.00;
			return price;
		}
		else if(foodName=="Egg masala") {
			price=135.00;
			return price;
		}
		else if(foodName=="Mutton pepper dry") {
			price=409.00;
			return price;
		}
		else if(foodName=="Mushroom pepper dry") {
			price=152.00;
			return price;
		}
		else if(foodName=="Lamb grill") {
			price=749.00;
			return price;
		}
		else if(foodName=="Mutton sheek kabab") {
			price=519.00;
			return price;
		}
		else if(foodName=="Grilled fish boneless") {
			price=485.00;
			return price;
		}
		
		else System.out.println("Invalid food name:"+foodName);
		return price;
	}
	
	public static double getFoodPrice(String foodName,int quantity){
		
		double price=0.0;
		if(foodName=="Apple beetroot carrot juice") {
			price=149.00;
			return price*quantity;
		}
		else if(foodName=="Rooh Afza") {
			price=129.00;
			return price*quantity;
		}
		else if(foodName=="Chocolate icecream shake") {
			price=149.00;
			return price*quantity;
		}
		else if(foodName=="Watermelon bites fruit bowl") {
			price=99.00;
			return price*quantity;
		}
		else if(foodName=="Special sundae") {
			price=149.00;
			return price*quantity;
		}
		else if(foodName=="Royal Falooda") {
			price=179.00;
			return price*quantity;
		}
		else if(foodName=="Sweet lassi") {
			price=89.00;
			return price*quantity;
		}
		else if(foodName=="Peach ice tea") {
			price=129.00;
			return price*quantity;
		}
		else if(foodName=="Matcha boba tea") {
			price=199.00;
			return price*quantity;
		}
		else if(foodName=="Green apple mojito") {
			price=129.00;
			return price*quantity;
		}
		else if(foodName=="Blue lime soda") {
			price=79.00;
			return price*quantity;
		}
		else if(foodName=="Kesar Badam kulfi") {
			price=79.00;
			return price*quantity;
		}
		else if(foodName=="Mango malba") {
			price=249.00;
			return price*quantity;
		}
		else if(foodName=="Egg and Cheese Panini") {
			price=199.00;
			return price*quantity;
		}
		else if(foodName=="Vanilla french toast") {
			price=199.00;
			return price*quantity;
		}
		else if(foodName=="Chicken tandoori") {
			price=179.00;
			return price*quantity;
		}
		else if(foodName=="Chicken kabab") {
			price=129.00;
			return price*quantity;
		}
		else if(foodName=="Chicken pepper dry") {
			price=182.00;
			return price*quantity;
		}
		else if(foodName=="Ghee rice") {
			price=110.00;
			return price*quantity;
		}
		else if(foodName=="Chilli chicken boneless") {
			price=179.00;
			return price*quantity;
		}
		else if(foodName=="Curd rice") {
			price=189.00;
			return price*quantity;
		}
		else if(foodName=="Butter chicken") {
			price=189.00;
			return price*quantity;
		}
		else if(foodName=="Egg Bhurji") {
			price=99.00;
			return price*quantity;
		}
		else if(foodName=="Kadai paneer") {
			price=169.00;
			return price*quantity;
		}
		else if(foodName=="Egg masala") {
			price=135.00;
			return price*quantity;
		}
		else if(foodName=="Mutton pepper dry") {
			price=409.00;
			return price*quantity;
		}
		else if(foodName=="Mushroom pepper dry") {
			price=152.00;
			return price*quantity;
		}
		else if(foodName=="Lamb grill") {
			price=749.00;
			return price*quantity;
		}
		else if(foodName=="Mutton sheek kabab") {
			price=519.00;
			return price*quantity;
		}
		else if(foodName=="Grilled fish boneless") {
			price=485.00;
			return price*quantity;
		}
		
		else System.out.println("Invalid food name:"+foodName);
		return price;
	}

}