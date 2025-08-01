class Company{
	String companyName;
	String domain;
	int employeeCount;

	Company(){
		
	}

	Company(String companyName,String domain,int employeeCount){
	this.companyName=companyName;
	this.domain=domain;
	this.employeeCount=employeeCount;
	}

	public void getCompanyInfo(){
		System.out.println("Company name is: "+companyName);
		System.out.println("Domain is: "+domain);
		System.out.println("Employee count is: "+employeeCount);
	}
}