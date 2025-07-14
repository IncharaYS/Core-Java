class PintrestRunner{
	public static void main(String pintrest[]){
		System.out.println("\nmain started\n");
		
		boolean userIsRegistered = Pintrest.registerUser("Inchara Y S","Incharays","inchara@123","inchara@123","incharays07@gmail.com",22);
		System.out.println("Is user Registered: " + userIsRegistered +"\n");
		if(userIsRegistered) Pintrest.getUserInfo();
		
		System.out.println("\nmain ended");
	}
}