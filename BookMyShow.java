class BookMyShow{

static String firstName;
static String surName;
static String password;
static String confirmPassword;
static long phoneNo;


	public static boolean registerUser(String fName,String sName,String pwd,String cpwd,long pno){
		boolean	isUserRegistered = false;
		boolean isFirstNameValid = false;
		boolean isSurNameValid =  false;
		boolean isPasswordValid=false;
		boolean isConfirmPasswordValid=false;
		boolean isPhoneNoValid=false;

			
		if(fName!=null){ 
			firstName=fName;
			isFirstNameValid=true;
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
		
				
		if(pno!=0){
			phoneNo=pno;
			isPhoneNoValid=true;
		}
		else System.out.println("Entered Phone No is not valid");
		
		
		if(isFirstNameValid && isSurNameValid && isConfirmPasswordValid && isPasswordValid&&isPhoneNoValid){
			System.out.println("Entered credentials are valid");
			isUserRegistered = true;   
		}
		return isUserRegistered; 			
	}

	public static void getUserInfo(){
		System.out.println("The given name is: " + firstName );
		System.out.println("The sur name is: " + surName );
		System.out.println("The password is: " + password);
		System.out.println("The confirm password value is: " + confirmPassword);
		System.out.println("Phone no is: " + phoneNo );
	}
}
