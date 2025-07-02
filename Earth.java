class Earth{
	
	/*static String asia="Asia";
	static String europe="Europe";
	static String antartica="Antartica";
	static String northAmerica="North America";
	static String southAmerica="South America";
	static String africa="Africa";
	static String australia="Australia";
	
	static String continents[]={"Asia","Europe","Antartica","North America","South America",
	"Africa","Australia"};*/
	
	public static void main(String[] earth){
	
	System.out.println("\nmain started\n");
	
	String asia="Asia";
	String europe="Europe";
	String antartica="Antartica";
	String northAmerica="North America";
	String southAmerica="South America";
	String africa="Africa";
	String australia="Australia";
	
	String continents[]={"Asia","Europe","Antartica","North America","South America","Africa","Australia"};
	
	System.out.println("List of continents are:");
	for(String continent:continents){
		System.out.println(continent);
	}
	System.out.println("\nmain ended");
	}
	
}