class CourtcaseRunner{
	public static void main(String courtcase[]){
	System.out.println("\nmain started\n");
	
	Courtcase case1=new Courtcase();
	
	case1.caseId=1;
	case1.caseTitle="State VS John";
	case1.caseType="Civil";
	case1.jurisdriction="Supreme court";
	case1.courtName="Delhi";
	case1.division="Civil bench";
	
	
	Courtcase case2=new Courtcase();

	case2.caseId=2;
	case2.caseTitle="State VS Ram";
	case2.caseType="Criminal";
	case2.jurisdriction="High court";
	case2.courtName="Mumbai";
	case2.division="Criminal bench";



	Courtcase case3=new Courtcase();

	case3.caseId=3;
	case3.caseTitle="Company A VS Company B";
	case3.caseType="Corporate";
	case3.jurisdriction="District court";
	case3.courtName="Bangalore";
	case3.division="Business bench";


	Courtcase case4=new Courtcase();

	case4.caseId=4;
	case4.caseTitle="State VS Priya";
	case4.caseType="Civil";
	case4.jurisdriction="Family court";
	case4.courtName="Chennai";
	case4.division="Family bench";



	Courtcase case5=new Courtcase();

	case5.caseId=5;
	case5.caseTitle="Income Tax Dept VS Raj";
	case5.caseType="Tax";
	case5.jurisdriction="Tribunal";
	case5.courtName="Pune";
	case5.division="Tax bench";



	Courtcase case6=new Courtcase();

	case6.caseId=6;
	case6.caseTitle="NGO VS State";
	case6.caseType="Public Interest";
	case6.jurisdriction="Supreme court";
	case6.courtName="Delhi";
	case6.division="Constitutional bench";



	Courtcase case7=new Courtcase();

	case7.caseId=7;
	case7.caseTitle="Ajay VS Police";
	case7.caseType="Criminal";
	case7.jurisdriction="Sessions court";
	case7.courtName="Hyderabad";
	case7.division="Sessions bench";



	Courtcase case8=new Courtcase();

	case8.caseId=8;
	case8.caseTitle="Landlord VS Tenant";
	case8.caseType="Property";
	case8.jurisdriction="District court";
	case8.courtName="Ahmedabad";
	case8.division="Property bench";



	Courtcase case9=new Courtcase();

	case9.caseId=9;
	case9.caseTitle="School VS State";
	case9.caseType="Education";
	case9.jurisdriction="High court";
	case9.courtName="Kolkata";
	case9.division="Education bench";



	Courtcase case10=new Courtcase();

	case10.caseId=10;
	case10.caseTitle="Environment Dept VS Factory";
	case10.caseType="Environment";
	case10.jurisdriction="Green tribunal";
	case10.courtName="Delhi";
	case10.division="Environment bench";



	Courtcase case11=new Courtcase();

	case11.caseId=11;
	case11.caseTitle="State VS Illegal Mining";
	case11.caseType="Environment";
	case11.jurisdriction="High court";
	case11.courtName="Ranchi";
	case11.division="Green bench";


	Courtcase case12=new Courtcase();

	case12.caseId=12;
	case12.caseTitle="College VS Education Board";
	case12.caseType="Academic";
	case12.jurisdriction="District court";
	case12.courtName="Nagpur";
	case12.division="Education bench";



	Courtcase case13=new Courtcase();

	case13.caseId=13;
	case13.caseTitle="Citizen VS Municipal Corp";
	case13.caseType="Civil";
	case13.jurisdriction="Local court";
	case13.courtName="Indore";
	case13.division="Civil bench";



	Courtcase case14=new Courtcase();

	case14.caseId=14;
	case14.caseTitle="Fraud Victim VS Bank";
	case14.caseType="Financial";
	case14.jurisdriction="Consumer court";
	case14.courtName="Bhopal";
	case14.division="Banking bench";


	Courtcase case15=new Courtcase();

	case15.caseId=15;
	case15.caseTitle="Resident VS Water Board";
	case15.caseType="Utility";
	case15.jurisdriction="District court";
	case15.courtName="Thane";
	case15.division="Public service bench";



	Courtcase case16=new Courtcase();

	case16.caseId=16;
	case16.caseTitle="Company X VS Employee";
	case16.caseType="Labor";
	case16.jurisdriction="Labour court";
	case16.courtName="Surat";
	case16.division="Industrial bench";



	Courtcase case17=new Courtcase();

	case17.caseId=17;
	case17.caseTitle="Woman VS Insurance Company";
	case17.caseType="Insurance";
	case17.jurisdriction="Consumer court";
	case17.courtName="Patna";
	case17.division="Claims bench";


	Courtcase case18=new Courtcase();

	case18.caseId=18;
	case18.caseTitle="Hospital VS Family";
	case18.caseType="Medical";
	case18.jurisdriction="Civil court";
	case18.courtName="Lucknow";
	case18.division="Health bench";



	Courtcase case19=new Courtcase();

	case19.caseId=19;
	case19.caseTitle="Transport Dept VS Vendor";
	case19.caseType="Contract";
	case19.jurisdriction="High court";
	case19.courtName="Jaipur";
	case19.division="Contractual bench";



	Courtcase case20=new Courtcase();

	case20.caseId=20;
	case20.caseTitle="Citizen VS State";
	case20.caseType="Fundamental Rights";
	case20.jurisdriction="Supreme court";
	case20.courtName="Delhi";
	case20.division="Rights bench";

	case1.getInfo();
	case2.getInfo();
	case3.getInfo();
	case4.getInfo();
	case5.getInfo();
	case6.getInfo();
	case7.getInfo();
	case8.getInfo();
	case9.getInfo();
	case10.getInfo();
	case11.getInfo();
	case12.getInfo();
	case13.getInfo();
	case14.getInfo();
	case15.getInfo();
	case16.getInfo();
	case17.getInfo();
	case18.getInfo();
	case19.getInfo();
	case20.getInfo();

	
	
	System.out.println("\nmain ended");
	}
}