class AmazonRunner{
	public static void main(String amazon[]){
		System.out.println("\nmain started\n");
		
		boolean userIsRegistered = Amazon.registerUser("Rashmi ","M","rashmi@123","rashmi@123","rashmimathad@gmail.com");
		System.out.println("Is user Registered: " + userIsRegistered +"\n");
		if(userIsRegistered) Amazon.getUserInfo();
		
		System.out.println("\nmain ended");
	}
}