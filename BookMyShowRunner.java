class BookMyShowRunner{
	public static void main(String bookmyshow[]){
		System.out.println("\nmain started\n");
		
		boolean userIsRegistered = BookMyShow.registerUser("Inchara","Y S","inchara@123","inchara@123",9865346689l);
		System.out.println("Is user Registered: " + userIsRegistered +"\n");
		if(userIsRegistered) BookMyShow.getUserInfo();
		
		System.out.println("\nmain ended");
	}
}