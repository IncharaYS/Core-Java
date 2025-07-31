class CrackersRunner{
	public static void main(String cracker[]){
	
	System.out.println("\nmain started\n");
	
	Crackers cracker1=new Crackers(1,"Oreo","Cream",34.00,56.00,"Small");

	/*cracker1.crackersId=1;
	cracker1.name="Oreo";
	cracker1.type="Cream";
	cracker1.weight=34.00;
	cracker1.price=56.00;
	cracker1.size="Small";*/
	
	System.out.println("Crackers id is:"+cracker1.crackersId);
	System.out.println("Crackers name is:"+cracker1.name);
	System.out.println("Crackers type is:"+cracker1.type);
	System.out.println("Crackers weight is:"+cracker1.weight);
	System.out.println("Crackers price is:"+cracker1.price);
	System.out.println("Crackers size is:"+cracker1.size+"\n");

	Crackers cracker2=new Crackers();

	/*cracker2.crackersId=2;
	cracker2.name="Bourbon";
	cracker2.type="Chocolate";
	cracker2.weight=50.00;
	cracker2.price=65.00;
	cracker2.size="Medium";*/
	
	System.out.println("Crackers id is:"+cracker2.crackersId);
	System.out.println("Crackers name is:"+cracker2.name);
	System.out.println("Crackers type is:"+cracker2.type);
	System.out.println("Crackers weight is:"+cracker2.weight);
	System.out.println("Crackers price is:"+cracker2.price);
	System.out.println("Crackers size is:"+cracker2.size+"\n");

	Crackers cracker3=new Crackers(3);

	/*cracker3.crackersId=3;
	cracker3.name="Hide & Seek Fab";
	cracker3.type="Strawberry";
	cracker3.weight=45.00;
	cracker3.price=60.00;
	cracker3.size="Small";*/
	
	System.out.println("Crackers id is:"+cracker1.crackersId+"\n");

	Crackers cracker4=new Crackers(4,"Jim Jam");

	/*cracker4.crackersId=4;
	cracker4.name="Jim Jam";
	cracker4.type="Cream";
	cracker4.weight=40.00;
	cracker4.price=52.00;
	cracker4.size="Small";*/
	
	System.out.println("Crackers id is:"+cracker4.crackersId);
	System.out.println("Crackers name is:"+cracker4.name+"\n");

	Crackers cracker5=new Crackers(5,"Parle-G","Plain");

	/*cracker5.crackersId=5;
	cracker5.name="Parle-G";
	cracker5.type="Plain";
	cracker5.weight=100.00;
	cracker5.price=20.00;
	cracker5.size="Large";*/
	
	System.out.println("Crackers id is:"+cracker5.crackersId);
	System.out.println("Crackers name is:"+cracker5.name);
	System.out.println("Crackers type is:"+cracker5.type+"\n");



	
	System.out.println("\nmain ended");
	}
}