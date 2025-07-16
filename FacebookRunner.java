class FacebookRunner{
	public static void main(String fb[]){
		System.out.println("\nmain started\n");
		
		boolean userIsRegistered = Facebook.registerUser("Inchara Y S","inchara@123","inchara@123",8765323479l,"incharays07@gmail.com");
		System.out.println("Is user Registered: " + userIsRegistered +"\n");
		if(userIsRegistered) Facebook.getUserInfo();
		
		System.out.println("\nmain ended");
	}
}