class GPayRunner{
	public static void main(String gpay[]){
		System.out.println("\nmain started\n");
		
		boolean userIsRegistered = GPay.registerUser("Inchara Y S","inchara@123",8765323479l,"incharays07@gmail.com","SBI");
		System.out.println("Is user Registered: " + userIsRegistered +"\n");
		if(userIsRegistered) GPay.getUserInfo();
		
		System.out.println("\nmain ended");
	}
}