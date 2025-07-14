class GPay{

static String fullName;
static String password;
static long phoneNo;
static String email;
static String bankName;


	public static boolean registerUser(String fName,String pwd,long pno,String eId,String bank){
		boolean	isUserRegistered = false;
		boolean isFullNameValid = false;
		boolean isPasswordValid=false;
		boolean isPhoneNoValid=false;
		boolean isEmailIdValid=false;
		boolean isBankValid=false;

			
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
		
			if(bank!=null){
			bankName=bank;
			isBankValid=true;
		}
		else System.out.println("Entered Bank is not valid");
		
		
		if(isFullNameValid  && isBankValid&& isPasswordValid&&isPhoneNoValid&&isEmailIdValid){
			System.out.println("Entered credentials are valid");
			isUserRegistered = true;   
		}
		return isUserRegistered; 			
	}

	public static void getUserInfo(){
		System.out.println("The full name is: " + fullName );
		System.out.println("The password is: " + password);
		System.out.println("Phone no is: " + phoneNo );
		System.out.println("Entered Email id is:"+email);
		System.out.println("Entered Bank name is:"+bankName);
	}
}
