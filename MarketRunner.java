class MarketRunner{
	public static void main(String market[]){
		System.out.println("\nmain started\n");
		
		System.out.println("Location is : "+Market.getLocation());
		System.out.println("Is Crowded?: "+Market.getIsCrowded());
		System.out.println("Is Buget Friendly?: "+Market.getIsBugetFriendly());
		System.out.println("Market type is: "+Market.getType());
		System.out.println("No of shops is: "+Market.getNoOfShops());
		
		System.out.println("\nmain ended");
	}
}