class CasinoRunner{
	public static void main(String[] casino){
	System.out.println("\nmain started\n");
	
	Casino casino1=new Casino(1,"Banglore","Rashmi",true,"M Rashmi",true);

	/*casino1.casinoId=1;
	casino1.location="Banglore";
	casino1.name="Rashmi";
	casino1.hasLisence=true;
	casino1.owner="M Rashmi";
	casino1.isOpen=true;*/
	
	System.out.println("Casino id is: "+casino1.casinoId);
	System.out.println("Casino location is: "+casino1.location);
	System.out.println("Casino name is: "+casino1.name);
	System.out.println("Casino  has lisence: "+casino1.hasLisence);
	System.out.println("Casino owner is: "+casino1.owner);
	System.out.println("Casino is open?: "+casino1.isOpen+"\n");

	Casino casino2=new Casino();

	/*casino2.casinoId=2;
	casino2.location="Goa";
	casino2.name="Ocean Pearl";
	casino2.hasLisence=true;
	casino2.owner="Arjun Patel";
	casino2.isOpen=true;*/
	
	System.out.println("Casino id is: "+casino2.casinoId);
	System.out.println("Casino location is: "+casino2.location);
	System.out.println("Casino name is: "+casino2.name);
	System.out.println("Casino  has lisence: "+casino2.hasLisence);
	System.out.println("Casino owner is: "+casino2.owner);
	System.out.println("Casino is open?: "+casino2.isOpen+"\n");

	Casino casino3=new Casino("Mumbai","Royal Deck",true,"Sneha Kapoor");

	/*casino3.casinoId=3;
	casino3.location="Mumbai";
	casino3.name="Royal Deck";
	casino3.hasLisence=true;
	casino3.owner="Sneha Kapoor";
	casino3.isOpen=false;*/
	
	System.out.println("Casino location is: "+casino3.location);
	System.out.println("Casino name is: "+casino3.name);
	System.out.println("Casino  has lisence: "+casino3.hasLisence);
	System.out.println("Casino owner is: "+casino3.owner+"\n");

	Casino casino4=new Casino(false);

	/*casino4.casinoId=4;
	casino4.location="Manali";
	casino4.name="Snow Spin";
	casino4.hasLisence=false;
	casino4.owner="Ravi Thakur";
	casino4.isOpen=false;*/
	;
	System.out.println("Casino is open?: "+casino4.isOpen+"\n");

	Casino casino5=new Casino(5,"Chennai","Southern Luck",true);

	/*casino5.casinoId=5;
	casino5.location="Chennai";
	casino5.name="Southern Luck";
	casino5.hasLisence=true;
	casino5.owner="Lakshmi R";
	casino5.isOpen=true;*/
	
	System.out.println("Casino id is: "+casino5.casinoId);
	System.out.println("Casino location is: "+casino5.location);
	System.out.println("Casino name is: "+casino5.name);
	System.out.println("Casino  has lisence: "+casino5.hasLisence+"\n");


	
	System.out.println("\nmain ended");
	}
}