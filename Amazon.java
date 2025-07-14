class Amazon{

static String givenName;
static String surName;
static String password;
static String confirmPassword;
static String emailId;


	public static boolean registerUser(String gName,String sName,String pwd,String cpwd,String eId){
		boolean	isUserRegistered = false;
		boolean isGivenNameValid = false;
		boolean isSurNameValid =  false;
		boolean isPasswordValid=false;
		boolean isConfirmPasswordValid=false;
		boolean isEmailIdValid=false;

			
		if(gName!=null){ 
			givenName=gName;
			isGivenNameValid=true;
		}
		else System.out.println("Entered Given name is not valid");
		
		if(sName !=null){
			surName=sName;
			isSurNameValid=true;
		}
		else System.out.println("Entered sur name is not valid");
		
		if(pwd!=null){
			password=pwd;
			isPasswordValid=true;
		}
		else System.out.println("Entered password is not valid");
		
		if(cpwd!=null){
			if(cpwd==pwd){
			confirmPassword=cpwd;
			isConfirmPasswordValid=true;
			}
			else System.out.println("Enterd confirm password is not same as password");
		}
		else System.out.println("Entered confirm password is not valid");
		
				
		if(eId!=null){
			emailId=eId;
			isEmailIdValid=true;
		}
		else System.out.println("Entered Email id is not valid");
		
		
		if(isGivenNameValid && isSurNameValid && isConfirmPasswordValid && isPasswordValid&&isEmailIdValid){
			System.out.println("Entered credentials are valid");
			isUserRegistered = true;   
		}
		return isUserRegistered; 			
	}

	public static void getUserInfo(){
		System.out.println("The given name is: " + givenName );
		System.out.println("The sur name is: " + surName );
		System.out.println("The password is: " + password);
		System.out.println("The confirm password value is: " + confirmPassword);
		System.out.println("Email ID is: " + emailId );
	}
}
