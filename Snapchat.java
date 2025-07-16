class Snapchat{
	public static boolean registerUser(String username,String password){
		boolean isUserRegistered=false;
		if(username!=null&&password!=null){
			isUserRegistered=true;
		}
		else System.out.println("Entered uder name or password is not valid");
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