class PrimeMinister{
	String name;
	int yearElected;
	CabinetMinister cabinetMinister;

	PrimeMinister(){
		
	}

	PrimeMinister(String name,int yearElected,CabinetMinister cabinetMinister){
	this.name=name;
	this.yearElected=yearElected;
	this.cabinetMinister=cabinetMinister;
	}

	public void getPrimeMinisterInfo(){
		System.out.println("Prime minister is: "+name);
		System.out.println("Year elected is: "+yearElected+"\n");
		System.out.println("Cabinet minister info is: ");
		cabinetMinister.getCabinetMinisterInfo();
	}
}