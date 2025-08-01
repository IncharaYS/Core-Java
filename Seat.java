class Seat{
	int number;
	String type;
	Politician politician;

	Seat(){
		
	}

	Seat(int number,String type,Politician politician){
	this.number=number;
	this.type=type;
	this.politician=politician;
	}

	public void getSeatInfo(){
		System.out.println("Seat number is: "+number);
		System.out.println("Seat type is: "+type+"\n");
		System.out.println("Politician info is: ");
		politician.getPoliticianInfo();
	}
}