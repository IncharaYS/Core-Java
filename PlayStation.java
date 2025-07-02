class PlayStation{
	
	/*static String game1="GTA 5";
	static String game2="Assassins creed";
	static String game3="Spiderman 2";
	static String game4="God of war";
	static String game5="Elden ring";
	static String game6="GOT";
	static String game7="The last of us";
	static String game8="Cyberpunk";
	static String game9="Demons souls";
	static String game10="Returnal";
	
	static String games[]={game1,game2,game3,game4,game5,game6,game7,game8,game9,game10};*/
	
	public static void main(String playstationGames[]){
	
	System.out.println("\nmain started\n");
	
	String game1="GTA 5";
	String game2="Assassins creed";
	String game3="Spiderman 2";
	String game4="God of war";
	String game5="Elden ring";
	String game6="GOT";
	String game7="The last of us";
	String game8="Cyberpunk";
	String game9="Demons souls";
	String game10="Returnal";
	
	String games[]={game1,game2,game3,game4,game5,game6,game7,game8,game9,game10};
	
	System.out.println("List of playstation games are:");
	for(String game:games){
		System.out.println(game);
	}
	System.out.println("\nmain ended");
	}
}