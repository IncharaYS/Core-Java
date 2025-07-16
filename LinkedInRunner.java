class LinkedInRunner{
	public static void main(String amazon[]){
		System.out.println("\nmain started\n");
		
		boolean userIsRegistered = LinkedIn.registerUser("Inchara ","Y S","inchara@123","inchara@123","incharays07@gmail.com",9876543567l,'F',"Fresher");
		System.out.println("Is user Registered: " + userIsRegistered +"\n");
		if(userIsRegistered) LinkedIn.getUserInfo();
		
		System.out.println("\nmain ended");
	}
}