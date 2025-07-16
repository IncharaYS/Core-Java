class Pintrest{

static String fullName;
static String userName;
static String password;
static String confirmPassword;
static String emailId;
static int userAge;


	public static boolean registerUser(String fName,String uName,String pwd,String cpwd,String eId,int age){
		boolean	isUserRegistered = false;
		isUserRegistered=validateUser(fName,uName,pwd,cpwd,eId,age);
		return isUserRegistered; 			
	}
	
	public static boolean validateUser(String fName,String uName,String pwd,String cpwd,String eId,int age){
		boolean isFullNameValid = false;
		boolean isUserNameValid =  false;
		boolean isPasswordValid=false;
		boolean isConfirmPasswordValid=false;
		boolean isEmailIdValid=false;
		boolean isAgeValid=false;
		boolean isUserValid=false;

			
		if(fName!=null){ 
			fullName=fName;
			isFullNameValid=true;
		}
		else System.out.println("Entered Full name is not valid");
		
		if(uName !=null){
			userName=uName;
			isUserNameValid=true;
		}
		else System.out.println("Entered user name is not valid");
		
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
		
		if(age>=11){
			userAge=age;
			isAgeValid=true;
		}
		else System.out.println("Entered Age is not valid");
		
		
		if(isFullNameValid && isUserNameValid && isConfirmPasswordValid && isPasswordValid&&isEmailIdValid&&isAgeValid){
			System.out.println("Entered credentials are valid");
			isUserValid= true;   
		}
		return isUserValid;
	}

	public static void getUserInfo(){
		System.out.println("The given name is: " + fullName );
		System.out.println("The sur name is: " + userName );
		System.out.println("The password is: " + password);
		System.out.println("The confirm password value is: " + confirmPassword);
		System.out.println("Email ID is: " + emailId );
		System.out.println("Age is: " + userAge );
	}
}
