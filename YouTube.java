class YouTube{

static String AccountType;
static String fullName;
static String password;
static String emailId;
static String enterOtp;
static String country;
static String gender;


	public static boolean registerUser(String acct,String fName,String pwd,String eId,String otp,String con,String gen){
		boolean	isUserRegistered = false;
		boolean isAccountTypeValid=false;
		boolean isFullNameValid = false;
		boolean isPasswordValid=false;
		boolean isEmailIdValid=false;
		boolean isOtpValid=false;
		boolean isCountryValid=false;
		boolean isGenderValid=false;

		
		if(fName!=null){ 
			fullName=fName;
			isFullNameValid=true;
		}
		else System.out.println("Entered Full name is not valid");
		
		if(acct!=null){
			AccountType=acct;
			isAccountTypeValid=true;
		}
		else System.out.println("Entered acc type is not valid");
		
		
		if(pwd!=null){
			password=pwd;
			isPasswordValid=true;
		}
		else System.out.println("Entered password is not valid");
		
				
		if(eId!=null){
			emailId=eId;
			isEmailIdValid=true;
		}
		else System.out.println("Entered Email id is not valid");
		
		if(otp!=null){
			enterOtp=otp;
			isOtpValid=true;
		}
		else System.out.println("Entered otp is not valid");
		
		if(con!=null){
			country=con;
			isCountryValid=true;
		}
		else System.out.println("Entered country is not valid");
		
		if(gen!=null){
			gender=gen;
			isGenderValid=true;
		}
		else System.out.println("Entered gender is not valid");
		
		
		if(isFullNameValid&& isPasswordValid&&isEmailIdValid&&isOtpValid&&isCountryValid&&isAccountTypeValid&&isGenderValid){
			System.out.println("Entered credentials are valid");
			isUserRegistered = true;   
		}
		return isUserRegistered; 			
	}

	public static void getUserInfo(){
		System.out.println("The given name is: " + fullName );
		System.out.println("The password is: " + password);
		System.out.println("Email ID is: " + emailId );
		System.out.println("OTP entered is: " + enterOtp );
		System.out.println("Country entered is: " + country );
		System.out.println("Account type entered is: " + AccountType );
		System.out.println("Gender entered is: " + gender );
	}
}
