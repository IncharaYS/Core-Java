class Bar{
	public static void main(String alchol[]){
	
	String alcoholNames[]={"Whiskey","Beer","Rum","Vodka","Brandy","Gin","Wine","Tequila","Sake","Liquor","Tequila","Cider"};
	//System.out.println("List of alchol are: "+alcoholNames[0]+","+alcoholNames[1] +","+alcoholNames[2]+","+alcoholNames[3]+","+alcoholNames[4]+","+alcoholNames[5]+","+alcoholNames[6]+","+alcoholNames[7] +","+alcoholNames[8]+","+alcoholNames[9]+","+alcoholNames[10 ]+","+alcoholNames[11]);
	
	System.out.println("List of alchol names are:");
	for(String alcoholName:alcoholNames){
		System.out.println(alcoholName);
	}
	}
}