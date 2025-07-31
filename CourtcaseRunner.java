class CourtcaseRunner{
	public static void main(String courtcase[]){
	System.out.println("\nmain started\n");
	
	Courtcase case1=new Courtcase(1,"State VS John","Civil","Supreme court","Delhi","Civil bench");

	/*case1.caseId=1;
	case1.caseTitle="State VS John";
	case1.caseType="Civil";
	case1.jurisdriction="Supreme court";
	case1.courtName="Delhi";
	case1.division="Civil bench";*/
	System.out.println("Case Id is:"+case1.caseId);
	System.out.println("Case title is:"+case1.caseTitle);
	System.out.println("Case type is:"+case1.caseType);
	System.out.println("Case jurisdriction is:"+case1.jurisdriction);
	System.out.println("Case court name is:"+case1.courtName);
	System.out.println("Case division is:"+case1.division+"\n");

	Courtcase case2=new Courtcase(); 
	
	/*case2.caseId=2;
	case2.caseTitle="State VS Ram";
	case2.caseType="Criminal";
	case2.jurisdriction="High court";
	case2.courtName="Mumbai";
	case2.division="Criminal bench";*/
	System.out.println("Case Id is:"+case2.caseId);
	System.out.println("Case title is:"+case2.caseTitle);
	System.out.println("Case type is:"+case2.caseType);
	System.out.println("Case jurisdriction is:"+case2.jurisdriction);
	System.out.println("Case court name is:"+case2.courtName);
	System.out.println("Case division is:"+case2.division+"\n");

	Courtcase case3=new Courtcase(3,"Company A VS Company B","Corporate","District court","Bangalore");

	/*case3.caseId=3;
	case3.caseTitle="Company A VS Company B";
	case3.caseType="Corporate";
	case3.jurisdriction="District court";
	case3.courtName="Bangalore";
	case3.division="Business bench";*/
	
	System.out.println("Case Id is:"+case3.caseId);
	System.out.println("Case title is:"+case3.caseTitle);
	System.out.println("Case type is:"+case3.caseType);
	System.out.println("Case jurisdriction is:"+case3.jurisdriction);
	System.out.println("Case court name is:"+case3.courtName+"\n");

	Courtcase case4=new Courtcase(4,"State VS Priya","Civil","Family court");
	/*case4.caseId=4;
	case4.caseTitle="State VS Priya";
	case4.caseType="Civil";
	case4.jurisdriction="Family court";
	case4.courtName="Chennai";
	case4.division="Family bench";*/
	
	System.out.println("Case Id is:"+case4.caseId);
	System.out.println("Case title is:"+case4.caseTitle);
	System.out.println("Case type is:"+case4.caseType);
	System.out.println("Case jurisdriction is:"+case4.jurisdriction+"\n");

	Courtcase case5=new Courtcase(5,"Income Tax Dept VS Raj","Tax"); 
	
	/*case5.caseId=5;
	case5.caseTitle="Income Tax Dept VS Raj";
	case5.caseType="Tax";
	case5.jurisdriction="Tribunal";
	case5.courtName="Pune";
	case5.division="Tax bench";*/
	
	System.out.println("Case Id is:"+case5.caseId);
	System.out.println("Case title is:"+case5.caseTitle);
	System.out.println("Case type is:"+case5.caseType+"\n");


	System.out.println("\nmain ended");
	}
}