class LinkedIn{

static String givenName;
static String surName;
static String password;
static String confirmPassword;
static String emailId;
static long phonoNo;
static char gender;
static String experience;


	public static boolean registerUser(String gName,String sName,String pwd,String cpwd,String eId,long pno,char gen,String exp){
		boolean	isUserRegistered = false;
		boolean isGivenNameValid = false;
		boolean isSurNameValid =  false;
		boolean isPasswordValid=false;
		boolean isConfirmPasswordValid=false;
		boolean isEmailIdValid=false;
		boolean isPhonoNoValid=false;
		boolean isGendervalid=false;
		boolean isExperiencevalid=false;

			
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
		
		if(pno!=0){
			phonoNo=pno;
			isPhonoNoValid=true;
		}
		else System.out.println("Entered Phone no is not valid");
		
		if(gen!=' '){
			gender=gen;
			isGendervalid=true;
		}
		else System.out.println("Entered Gender is not valid");
		
		if(exp!=null){
			experience=exp;
			isExperiencevalid=true;
		}
		else System.out.println("Entered Experience is not valid");
		
		
		if(isGivenNameValid && isSurNameValid && isConfirmPasswordValid && isPasswordValid&&isEmailIdValid&&isPhonoNoValid&&isGendervalid&&isExperiencevalid){
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
		System.out.println("Gender is: " +gender );
		System.out.println("Phone No is: " + phonoNo );
		System.out.println("Experience is: " + experience );
	}
}
