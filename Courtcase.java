class Courtcase{
	Courtcase(int caseId,String caseTitle,String caseType,String jurisdriction,String courtName,String division){
	this.caseId=caseId;
	this.caseTitle=caseTitle;
	this.caseType=caseType;
	this.jurisdriction=jurisdriction;
	this.courtName=courtName;
	this.division=division;
	}
	int caseId;
	String caseTitle;
	String caseType;
	String jurisdriction;
	String courtName;
	String division;
	
	public void getInfo(){
	System.out.println("Case Id is:"+caseId);
	System.out.println("Case title is:"+caseTitle);
	System.out.println("Case type is:"+caseType);
	System.out.println("Case jurisdriction is:"+jurisdriction);
	System.out.println("Case court name is:"+courtName);
	System.out.println("Case division is:"+division+"\n");
	}
}