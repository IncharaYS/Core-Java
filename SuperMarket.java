class SuperMarket{
	public static void main(String[] items){
	
	String[] iceCreams={"Black walnut","Burguandy Cherry","Butterscotch ribbon","Chocolate","Chocolate almond","Chocolate chip","Coffee","Coffee candy","Lemon crisp","Cookies n cream"};
	//System.out.println("List of ice creams: "+iceCreams[0]+","+iceCreams[1]+","+iceCreams[2]+","+  iceCreams[3]+","+iceCreams[4] +","+iceCreams[5]+","+iceCreams[6]+","+iceCreams[7]+","+iceCreams[8]+","+iceCreams[9]);
	
	String[] perfumes={"YSL Libre Intense","Prada Paradoxe","Jaguar classic black","Giorgio Armani code","Luxe Aura","Something Something","Blur","Blue hoomie","Nevia","Ponds"};
	//System.out.println("\nList of perfumes: "+perfumes[0]+","+ perfumes[1] +","+ perfumes[2]+","+perfumes[3]+","+perfumes[4]+","+perfumes[5]+","+perfumes[6]+","+perfumes[7]+","+perfumes[8]+","+perfumes[9]);
	
	String[] grocery={"Potato","Corn","Bread","Eggs","Sneekers","Lemon","Puffed rice","Detergent","Dish soap","Table cloth"};
	//System.out.println("\nList of grocery: "+grocery[0]+","+grocery[1]+","+grocery[2]+","+grocery[3]+","+grocery[4]+","+grocery[5]+","+grocery[6]+","+grocery[7]+","+grocery[8]+","+  grocery[9]);
	
	String cosmetics[]={"Eyeliner","Kajal","Lipbalm","Foundation","Sunscreen","Lipstick","Conceeler","Maskara","Color corrector","Moisterizer"};
	//System.out.println("\nList of cosmetics: "+cosmetics[0] +","+cosmetics[1] +","+cosmetics[2] +","+cosmetics[3]+","+cosmetics[4] +","+cosmetics[5]+","+cosmetics[6]+","+cosmetics[7]+","+cosmetics[8]+","+cosmetics[9] );
	
	
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
	}
}