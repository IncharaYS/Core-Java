class MakeUpKitRunner{
	public static void main(String kit[]){
		System.out.println("\nmain started\n");
		
		System.out.println("Price is: "+MakeUpKit.getPrice());
		System.out.println("No of items is: "+MakeUpKit.getNoOfItems());
		System.out.println("Brand is: "+MakeUpKit.getBrand());
		System.out.println("Comes with kit?: "+MakeUpKit.getIncludesBag());
		System.out.println("Is customizable?: "+MakeUpKit.getIsCustomizable());
		
		System.out.println("\nmain ended");
	}
}