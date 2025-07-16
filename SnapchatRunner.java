class SnapchatRunner{
	public static void main(String [] insta){
		boolean isUserRegistered=Snapchat.registerUser("Sana07","Sana@123");
		if(isUserRegistered)	System.out.println("User registered successfully using user name");
		
		isUserRegistered=Snapchat.registerUser(9865325689l,"sana123@");
		if(isUserRegistered)	System.out.println("User registered successfully using phone no");
	}
}