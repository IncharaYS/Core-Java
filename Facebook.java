class Facebook{

static String fullName;
static String password;
static String confirmPassword;
static long phoneNo;
static String email;


	public static boolean registerUser(String fName,String pwd,String cpwd,long pno,String eId){
		boolean	isUserRegistered = false;
		isUserRegistered=validateUser(fName,pwd,cpwd,pno,eId);
		return isUserRegistered; 			
	}
	
	public static boolean validateUser(String fName,String pwd,String cpwd,long pno,String eId)
	{
		boolean isFullNameValid = false;
		boolean isPasswordValid=false;
		boolean isConfirmPasswordValid=false;
		boolean isPhoneNoValid=false;
		boolean isEmailIdValid=false;
		boolean isUserValid=false;

			
		if(fName!=null){ 
			fullName=fName;
			isFullNameValid=true;
		}
		else System.out.println("Entered Full name is not valid");
		
		
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
		
			if(eId!=null){
			email=eId;
			isEmailIdValid=true;
		}
		else System.out.println("Entered Email id is not valid");
		
		
		if(isFullNameValid  && isConfirmPasswordValid && isPasswordValid&&isPhoneNoValid&&isEmailIdValid){
			System.out.println("Entered credentials are valid");
			isUserValid= true;   
		}
		return isUserValid;
	}	
	public static void getUserInfo(){
		System.out.println("The full name is: " + fullName );
		System.out.println("The password is: " + password);
		System.out.println("The confirm password value is: " + confirmPassword);
		System.out.println("Phone no is: " + phoneNo );
		System.out.println("Entered Email id is:"+email);
	}
}
