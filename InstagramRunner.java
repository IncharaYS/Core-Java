class InstagramRunner{
	public static void main(String [] insta){
		boolean isUserRegistered=Instagram.registerUser("Sana07",9876434567l);
		if(isUserRegistered)	System.out.println("User registered successfully using phone no");
		
		isUserRegistered=Instagram.registerUser("Sana07","sana123@gmail.com");
		if(isUserRegistered)	System.out.println("User registered successfully using email");
	}
}