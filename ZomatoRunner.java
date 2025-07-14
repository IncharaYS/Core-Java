class ZomatoRunner{
	public static void main(String zomato[]){
		System.out.println("\nmain started\n");
		
		boolean userIsRegistered = Zomato.registerUser("Inchara Y S","inchara@123","incharays07@gmail.com","098866","Banglore");
		System.out.println("Is user Registered: " + userIsRegistered +"\n");
		if(userIsRegistered) Zomato.getUserInfo();
		
		System.out.println("\nmain ended");
	}
}