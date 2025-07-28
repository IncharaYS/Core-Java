class Politician{
	Politician(int politicianId,String state,String name,int yearsInOffice,int electionWins,String party){
	this.politicianId=politicianId;
	this.state=state;
	this.name=name;
	this.yearsInOffice=yearsInOffice;
	this.electionWins=electionWins;
	this.party=party;
	}
	int politicianId;
	String state;
	String name;
	int yearsInOffice;
	int electionWins;
	String party;
	
	public void getInfo(){
			
	System.out.println("Politician Id is:"+politicianId);
	System.out.println("Politician state is:"+state);
	System.out.println("Politician name is:"+name);
	System.out.println("Politician years in office is:"+yearsInOffice);
	System.out.println("Politician election wins is:"+electionWins);
	System.out.println("Politician party is:"+party+"\n");
	}
}