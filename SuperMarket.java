class SuperMarket{
	
	/*static String iceCream1="Black walnut";
	static String iceCream2="Burguandy Cherry";
	static String iceCream3="Butterscotch ribbon";
	static String iceCream4="Chocolate";
	static String iceCream5="Chocolate almond";
	static String iceCream6="Chocolate chip";
	static String iceCream7="Coffee";
	static String iceCream8="Coffee candy";
	static String iceCream9="Lemon crisp";
	static String iceCream10="Cookies n cream";
	
	static String[] iceCreams={iceCream1,iceCream2,iceCream3,iceCream4,iceCream5,iceCream6,iceCream7,iceCream8,iceCream9,iceCream10};
	
	static String perfume1="YSL Libre Intense";
	static String perfume2="Prada Paradoxe";
	static String perfume3="Jaguar classic black";
	static String perfume4="Giorgio Armani code";
	static String perfume5="Luxe Aura";
	static String perfume6="Something Something";
	static String perfume7="Blur";
	static String perfume8="Blue hoomie";
	static String perfume9="Nevia";
	static String perfume10="Ponds";
	
	static String[] perfumes={perfume1,perfume2,perfume3,perfume4,perfume5,perfume6,perfume7,perfume8,perfume9,perfume10};
	
	static String groceryItem1="Potato";
	static String groceryItem2="Corn";
	static String groceryItem3="Bread";
	static String groceryItem4="Eggs";
	static String groceryItem5="Sneekers";
	static String groceryItem6="Lemon";
	static String groceryItem7="Puffed rice";
	static String groceryItem8="Detergent";
	static String groceryItem9="Dish soap";
	static String groceryItem10="Table cloth";
	
	static String[] grocery={groceryItem1,groceryItem2,groceryItem3,groceryItem4,groceryItem5,groceryItem6,groceryItem7,groceryItem8,groceryItem9,groceryItem10};
	
	static String cosmeticsItem1="Eyeliner";
	static String cosmeticsItem2="Kajal";
	static String cosmeticsItem3="Lipbalm";
	static String cosmeticsItem4="Foundation";
	static String cosmeticsItem5="Sunscreen";
	static String cosmeticsItem6="Lipstick";
	static String cosmeticsItem7="Conceeler";
	static String cosmeticsItem8="Maskara";
	static String cosmeticsItem9="Color corrector";
	static String cosmeticsItem10="Moisterizer";
	
	static String cosmetics[]={cosmeticsItem1,cosmeticsItem2,cosmeticsItem3,cosmeticsItem4,cosmeticsItem5,cosmeticsItem6,cosmeticsItem7,cosmeticsItem8,cosmeticsItem9,cosmeticsItem10};*/
	
	public static void main(String[] items){
	
	System.out.println("\nmain started\n");
	
	String iceCream1="Black walnut";
	String iceCream2="Burguandy Cherry";
	String iceCream3="Butterscotch ribbon";
	String iceCream4="Chocolate";
	String iceCream5="Chocolate almond";
	String iceCream6="Chocolate chip";
	String iceCream7="Coffee";
	String iceCream8="Coffee candy";
	String iceCream9="Lemon crisp";
	String iceCream10="Cookies n cream";
	
	String[] iceCreams={iceCream1,iceCream2,iceCream3,iceCream4,iceCream5,iceCream6,iceCream7,iceCream8,iceCream9,iceCream10};
	
	String perfume1="YSL Libre Intense";
	String perfume2="Prada Paradoxe";
	String perfume3="Jaguar classic black";
	String perfume4="Giorgio Armani code";
	String perfume5="Luxe Aura";
	String perfume6="Something Something";
	String perfume7="Blur";
	String perfume8="Blue hoomie";
	String perfume9="Nevia";
	String perfume10="Ponds";
	
	String[] perfumes={perfume1,perfume2,perfume3,perfume4,perfume5,perfume6,perfume7,perfume8,perfume9,perfume10};
	
	String groceryItem1="Potato";
	String groceryItem2="Corn";
	String groceryItem3="Bread";
	String groceryItem4="Eggs";
	String groceryItem5="Sneekers";
	String groceryItem6="Lemon";
	String groceryItem7="Puffed rice";
	String groceryItem8="Detergent";
	String groceryItem9="Dish soap";
	String groceryItem10="Table cloth";
	
	String[] grocery={groceryItem1,groceryItem2,groceryItem3,groceryItem4,groceryItem5,groceryItem6,groceryItem7,groceryItem8,groceryItem9,groceryItem10};
	
	String cosmeticsItem1="Eyeliner";
	String cosmeticsItem2="Kajal";
	String cosmeticsItem3="Lipbalm";
	String cosmeticsItem4="Foundation";
	String cosmeticsItem5="Sunscreen";
	String cosmeticsItem6="Lipstick";
	String cosmeticsItem7="Conceeler";
	String cosmeticsItem8="Maskara";
	String cosmeticsItem9="Color corrector";
	String cosmeticsItem10="Moisterizer";
	
	String cosmetics[]={cosmeticsItem1,cosmeticsItem2,cosmeticsItem3,cosmeticsItem4,cosmeticsItem5,cosmeticsItem6,cosmeticsItem7,cosmeticsItem8,cosmeticsItem9,cosmeticsItem10};

	
	System.out.println("List of ice creams are:");
	for(String iceCream:iceCreams){
		System.out.println(iceCream);
	}
	
	System.out.println("\nList of perfumes are:");
	for(String perfume:perfumes){
		System.out.println(perfume);
	}
	
	System.out.println("\nList of grocery items are:");
	for(String groceryItem:grocery){
		System.out.println(groceryItem);
	}
	
	System.out.println("\nList of cosmetics are:");
	for(String cosmeticsItem:cosmetics){
		System.out.println(cosmeticsItem);
	}
	System.out.println("\nmain ended");
	}
}