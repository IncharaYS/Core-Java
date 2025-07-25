class CasinoRunner{
	public static void main(String[] casino){
	System.out.println("\nmain started\n");
	
	Casino casino1=new Casino();
	
	casino1.casinoId=1;
	casino1.location="Banglore";
	casino1.name="Rashmi";
	casino1.hasLisence=true;
	casino1.owner="M Rashmi";
	casino1.isOpen=true;
	
	
		Casino casino2=new Casino();
	
	casino2.casinoId=2;
	casino2.location="Goa";
	casino2.name="Ocean Pearl";
	casino2.hasLisence=true;
	casino2.owner="Arjun Patel";
	casino2.isOpen=true;
	

	
	Casino casino3=new Casino();
	
	casino3.casinoId=3;
	casino3.location="Mumbai";
	casino3.name="Royal Deck";
	casino3.hasLisence=true;
	casino3.owner="Sneha Kapoor";
	casino3.isOpen=false;
	

	
	Casino casino4=new Casino();
	
	casino4.casinoId=4;
	casino4.location="Manali";
	casino4.name="Snow Spin";
	casino4.hasLisence=false;
	casino4.owner="Ravi Thakur";
	casino4.isOpen=false;
	

	
	Casino casino5=new Casino();
	
	casino5.casinoId=5;
	casino5.location="Chennai";
	casino5.name="Southern Luck";
	casino5.hasLisence=true;
	casino5.owner="Lakshmi R";
	casino5.isOpen=true;
	

	
	Casino casino6=new Casino();
	
	casino6.casinoId=6;
	casino6.location="Pune";
	casino6.name="Card Castle";
	casino6.hasLisence=false;
	casino6.owner="Anil Joshi";
	casino6.isOpen=true;
	

	
	Casino casino7=new Casino();
	
	casino7.casinoId=7;
	casino7.location="Jaipur";
	casino7.name="Pink Spin";
	casino7.hasLisence=true;
	casino7.owner="Pooja Mehra";
	casino7.isOpen=true;
	
	
	Casino casino8=new Casino();
	
	casino8.casinoId=8;
	casino8.location="Delhi";
	casino8.name="Capital Bet";
	casino8.hasLisence=false;
	casino8.owner="Rohan Verma";
	casino8.isOpen=false;

	
	Casino casino9=new Casino();
	
	casino9.casinoId=9;
	casino9.location="Hyderabad";
	casino9.name="Pearl Casino";
	casino9.hasLisence=true;
	casino9.owner="Siddharth Rao";
	casino9.isOpen=true;
	
	
	
	Casino casino10=new Casino();
	
	casino10.casinoId=10;
	casino10.location="Kolkata";
	casino10.name="Royal Bengal";
	casino10.hasLisence=true;
	casino10.owner="Meghna Das";
	casino10.isOpen=true;
	

	
	Casino casino11=new Casino();
	
	casino11.casinoId=11;
	casino11.location="Ahmedabad";
	casino11.name="Desert Deal";
	casino11.hasLisence=true;
	casino11.owner="Rajesh Modi";
	casino11.isOpen=false;
	

	
	Casino casino12=new Casino();
	
	casino12.casinoId=12;
	casino12.location="Surat";
	casino12.name="Diamond Spin";
	casino12.hasLisence=false;
	casino12.owner="Komal Shah";
	casino12.isOpen=true;
	

	
	Casino casino13=new Casino();
	
	casino13.casinoId=13;
	casino13.location="Nagpur";
	casino13.name="Tiger Luck";
	casino13.hasLisence=true;
	casino13.owner="Neeraj Rao";
	casino13.isOpen=true;
	

	
	Casino casino14=new Casino();
	
	casino14.casinoId=14;
	casino14.location="Bhopal";
	casino14.name="Lake View Casino";
	casino14.hasLisence=true;
	casino14.owner="Deepa Malhotra";
	casino14.isOpen=false;
	

	
	Casino casino15=new Casino();
	
	casino15.casinoId=15;
	casino15.location="Indore";
	casino15.name="City Dice";
	casino15.hasLisence=false;
	casino15.owner="Karan Gupta";
	casino15.isOpen=true;
	

	
	Casino casino16=new Casino();
	
	casino16.casinoId=16;
	casino16.location="Lucknow";
	casino16.name="Luck Lounge";
	casino16.hasLisence=true;
	casino16.owner="Tanvi Ahuja";
	casino16.isOpen=true;
	

	
	Casino casino17=new Casino();
	
	casino17.casinoId=17;
	casino17.location="Kanpur";
	casino17.name="Spin Palace";
	casino17.hasLisence=false;
	casino17.owner="Rahul Khanna";
	casino17.isOpen=false;
	

	
	Casino casino18=new Casino();
	
	casino18.casinoId=18;
	casino18.location="Patna";
	casino18.name="East Edge";
	casino18.hasLisence=true;
	casino18.owner="Ritika Sinha";
	casino18.isOpen=true;
	

	
	Casino casino19=new Casino();
	
	casino19.casinoId=19;
	casino19.location="Ranchi";
	casino19.name="Green Gamble";
	casino19.hasLisence=false;
	casino19.owner="Amit Tiwari";
	casino19.isOpen=false;
	
	
	
	Casino casino20=new Casino();
	
	casino20.casinoId=20;
	casino20.location="Trivandrum";
	casino20.name="Coastal Cards";
	casino20.hasLisence=true;
	casino20.owner="Nisha Menon";
	casino20.isOpen=true;
	
	casino1.getInfo();
	casino2.getInfo();
	casino3.getInfo();
	casino4.getInfo();
	casino5.getInfo();
	casino6.getInfo();
	casino7.getInfo();
	casino8.getInfo();
	casino9.getInfo();
	casino10.getInfo();
	casino11.getInfo();
	casino12.getInfo();
	casino13.getInfo();
	casino14.getInfo();
	casino15.getInfo();
	casino16.getInfo();
	casino17.getInfo();
	casino18.getInfo();
	casino19.getInfo();
	casino20.getInfo();

	
	System.out.println("\nmain ended");
	}
}