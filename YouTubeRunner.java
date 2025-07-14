class YouTubeRunner{
	public static void main(String yt[]){
		System.out.println("\nmain started\n");
		
		boolean userIsRegistered = YouTube.registerUser("Standard","Inchara Y S","inchara@123","incharays07@gmail.com","098866","India","Female");
		System.out.println("Is user Registered: " + userIsRegistered +"\n");
		if(userIsRegistered) YouTube.getUserInfo();
		
		System.out.println("\nmain ended");
	}
}