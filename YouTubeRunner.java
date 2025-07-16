class YoutubeRunner{
	public static void main(String [] insta){
		boolean isUserRegistered=Youtube.registerUser("sana133@gmail.com","Sana@123");
		if(isUserRegistered)	System.out.println("User registered successfully using email");
		
		isUserRegistered=Youtube.registerUser(9865325689l,"sana123@");
		if(isUserRegistered)	System.out.println("User registered successfully using phone no");
	}
}