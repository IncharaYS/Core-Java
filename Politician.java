class Politician{
	String name;
	String party;
	int yearsInOffice;

	Politician(){
		
	}

	Politician(String name,String party,int yearsInOffice){
	this.name=name;
	this.party=party;
	this.yearsInOffice=yearsInOffice;
	}

	public void getPoliticianInfo(){
		System.out.println("Politician name is: "+name);
		System.out.println("Party is: "+party);
		System.out.println("Years in office is: "+yearsInOffice);
	}
}