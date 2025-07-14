class Zomato{

static String fullName;
static String password;
static String emailId;
static String enterOtp;
static String address;


	public static boolean registerUser(String fName,String pwd,String eId,String otp,String add){
		boolean	isUserRegistered = false;
		boolean isFullNameValid = false;
		boolean isPasswordValid=false;
		boolean isEmailIdValid=false;
		boolean isOtpValid=false;
		boolean isAddressValid=false;

			
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
		
		if(add!=null){
			address=add;
			isAddressValid=true;
		}
		else System.out.println("Entered address is not valid");
		
		
		if(isFullNameValid&& isPasswordValid&&isEmailIdValid&&isOtpValid&&isAddressValid){
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
		System.out.println("Address entered is: " + address );
	}
}
