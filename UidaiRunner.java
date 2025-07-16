class UidaiRunner{
	public static void main(String uidai[]){
		System.out.println("\nmain started\n");
		
		boolean userIsRegistered = Uidai.registerUser("Inchara","Y S","inchara@123","inchara@123","incharays07@gmail.com","Female","Kannada","098765421457","21/10/2003");
		System.out.println("Is user Registered: " + userIsRegistered +"\n");
		if(userIsRegistered) Uidai.getUserInfo();
		
		System.out.println("\nmain ended");
	}
}