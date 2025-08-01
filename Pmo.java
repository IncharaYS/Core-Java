class Pmo{
	String officeName;
	String location;
	PrimeMinister primeMinister;

	Pmo(){
		
	}

	Pmo(String officeName,String location,PrimeMinister primeMinister){
	this.officeName=officeName;
	this.location=location;
	this.primeMinister=primeMinister;
	}

	public void getPmoInfo(){
		System.out.println("PMO office is: "+officeName);
		System.out.println("Location is: "+location+"\n");
		System.out.println("Prime minister info is:");
		primeMinister.getPrimeMinisterInfo();
	}
}