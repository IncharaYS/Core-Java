class FacebookRunner{
	public static void main(String [] insta){
		boolean isUserRegistered=Facebook.registerUser("sana133@gmail.com","Sana@123");
		if(isUserRegistered)	System.out.println("User registered successfully using email");
		
		isUserRegistered=Facebook.registerUser(9865325689l,"sana123@");
		if(isUserRegistered)	System.out.println("User registered successfully using phone no");
	}
}