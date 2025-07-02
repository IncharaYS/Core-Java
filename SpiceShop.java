class SpiceShop{
	
	/*static String turmeric="Turmeric";
	static String cumin="Cumin";
	static String coriander="Coriander";
	static String musterd="Musterd";
	static String chilliPowder="Chilli Powder";
	static String garamMasala="Garam Masala";
	static String cloves="Cloves";
	static String cardamon="Cardamon";
	static String cinnamon="Cinnamon";
	static String ginger="Ginger";
	static String saffron="Saffron";
	static String anise="Anise";
	static String curryLeaves="Curry Leaves";
	static String asafoetida="Asafoetida";
	
	static String[] spices={turmeric,cumin,coriander,musterd,chilliPowder,garamMasala,
	cloves,cardamon,cinnamon,ginger,saffron,anise,curryLeaves,asafoetida};*/

	
	public static void main(String[] spicenames){
	System.out.println("\nmain started\n");
	
	String turmeric="Turmeric";
	String cumin="Cumin";
	String coriander="Coriander";
	String musterd="Musterd";
	String chilliPowder="Chilli Powder";
	String garamMasala="Garam Masala";
	String cloves="Cloves";
	String cardamon="Cardamon";
	String cinnamon="Cinnamon";
	String ginger="Ginger";
	String saffron="Saffron";
	String anise="Anise";
	String curryLeaves="Curry Leaves";
	String asafoetida="Asafoetida";
	
	String[] spices={turmeric,cumin,coriander,musterd,chilliPowder,garamMasala,
	cloves,cardamon,cinnamon,ginger,saffron,anise,curryLeaves,asafoetida};
	
	System.out.println("List of spices are:");
	for(String spice:spices){
		System.out.println(spice);
	}
	
	System.out.println("\nmain ended");
	}
}