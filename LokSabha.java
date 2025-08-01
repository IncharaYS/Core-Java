class LokSabha{
	String region;
	int totalSeats;
	Seat seat;

	LokSabha(){
		
	}

	LokSabha(String region,int totalSeats,Seat seat){
	this.region=region;
	this.totalSeats=totalSeats;
	this.seat=seat;
	}

	public void getLokSabhaInfo(){
		System.out.println("LokSabha region is: "+region);
		System.out.println("Total seats is: "+totalSeats+"\n");
		System.out.println("Seat info is:");
		seat.getSeatInfo();
	}
}