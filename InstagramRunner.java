class InstagramRunner{
	public static void main(String insta[]){
		System.out.println("\nmain started\n");
		
		boolean userIsRegistered = Instagram.registerUser("Inchara","Y S","inchara@123","inchara@123","incharays07@gmail.com");
		System.out.println("Is user Registered: " + userIsRegistered +"\n");
		if(userIsRegistered) Instagram.getUserInfo();
		
		System.out.println("\nmain ended");
	}
}