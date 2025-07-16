class Youtube{
	public static boolean registerUser(String email,String password){
		boolean isUserRegistered=false;
		if(email!=null&&password!=null){
			isUserRegistered=true;
		}
		else System.out.println("Entered email or password is not valid");
		return isUserRegistered;
	}
	
	public static boolean registerUser(long phoneNo,String password){
		boolean isUserRegistered=false;
		if(phoneNo!=0&&password!=null){
			isUserRegistered=true;
		}
		else System.out.println("Entered phoneno or password is not valid");
		return isUserRegistered;
	}
}