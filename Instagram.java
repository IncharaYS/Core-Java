class Instagram{
	public static boolean registerUser(String userName,long phoneNo){
		boolean isUserRegistered=false;
		if(userName!=null&&phoneNo!=0){
			isUserRegistered=true;
		}
		else System.out.println("Entered name or phone no is not valid");
		return isUserRegistered;
	}
	
	public static boolean registerUser(String userName,String email){
		boolean isUserRegistered=false;
		if(userName!=null&&email!=null){
			isUserRegistered=true;
		}
		else System.out.println("Entered name or email is not valid");
		return isUserRegistered;
	}
}