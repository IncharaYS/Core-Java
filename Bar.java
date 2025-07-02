class Bar{
	
	/*static String whiskey="Whiskey";
	static String beer="Beer";
	static String rum="Rum";
	static String vodka="Vodka";
	static String brandy="Brandy";
	static String gin="Gin";
	static String wine="Wine";
	static String tequila="Taquila";
	static String sake="Sake";
	static String liquor="Liquor";
	static String cider="Cider";
	
	static String alcoholNames[]={whiskey,beer,rum,vodka,brandy,gin,wine,
	tequila,sake,liquor,tequila,cider};*/
	
	public static void main(String alchol[]){
	
	System.out.println("\nmain started\n");
	
	String whiskey="Whiskey";
	String beer="Beer";
	String rum="Rum";
	String vodka="Vodka";
	String brandy="Brandy";
	String gin="Gin";
	String wine="Wine";
	String tequila="Taquila";
	String sake="Sake";
	String liquor="Liquor";
	String cider="Cider";
	
	String alcoholNames[]={whiskey,beer,rum,vodka,brandy,gin,wine,
	tequila,sake,liquor,tequila,cider};
	
	System.out.println("List of alchol names are:");
	for(String alcoholName:alcoholNames){
		System.out.println(alcoholName);
	}
	
	System.out.println("\nmain ended");
	}
}