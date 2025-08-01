class CabinetMinister{
	String portfolio;
	String ministerName;
	int yearAppointed;

	CabinetMinister(){
		
	}

	CabinetMinister(String portfolio,String ministerName,int yearAppointed){
	this.portfolio=portfolio;
	this.ministerName=ministerName;
	this.yearAppointed=yearAppointed;
	}

	public void getCabinetMinisterInfo(){
		System.out.println("Cabinet minister is: "+ministerName);
		System.out.println("Portfolio is: "+portfolio);
		System.out.println("Year appointed is: "+yearAppointed);
	}
}