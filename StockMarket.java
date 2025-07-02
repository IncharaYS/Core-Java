class StockMarket{
	
	/*static String stock1="Reliance";
	static String stock2="HDFC Bank";
	static String stock3="TCS";
	static String stock4="Bharti Airtel";
	static String stock5="ICICI Bank";
	static String stock6="SBI";
	static String stock7="Bajaj";
	static String stock8="Nestle";
	static String stock9="Castrol India";
	static String stock10="Hyundai Motor";
	
	static String stockNames[]={stock1,stock2,stock3,stock4,stock5,stock6,stock7,stock8,stock9,stock10};*/
	
	public static void main(String names[]){
	
	System.out.println("\nmain started\n");
	
	String stock1="Reliance";
	String stock2="HDFC Bank";
	String stock3="TCS";
	String stock4="Bharti Airtel";
	String stock5="ICICI Bank";
	String stock6="SBI";
	String stock7="Bajaj";
	String stock8="Nestle";
	String stock9="Castrol India";
	String stock10="Hyundai Motor";
	
	String stockNames[]={stock1,stock2,stock3,stock4,stock5,stock6,stock7,stock8,stock9,stock10};

	
	System.out.println("List of stock names are:");
	 for(String stockName:stockNames){
		System.out.println(stockName);
	}
	System.out.println("\nmain ended");
	}
}