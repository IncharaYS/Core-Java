class ForestSafariRunner{
	public static void main(String[] safari){
	System.out.println("\nmain started\n");
	
	ForestSafari safari1=new ForestSafari(1,"Jim cobat","India",true,345,true);
	
	
	/*safari1.safariId=1;
	safari1.name="Jim cobat";
	safari1.location="India";
	safari1.hasTransport=true;
	safari1.noOfAnimals=345;
	safari1.isVisitationAllowed=true;*/
	System.out.println("Safari id is:"+safari1.safariId);
	System.out.println("Safari name is:"+safari1.name);
	System.out.println("Safari location is:"+safari1.location);
	System.out.println("Safari has transport?:"+safari1.hasTransport);
	System.out.println("No of animals is:"+safari1.noOfAnimals);
	System.out.println("Safari can have visitation?:"+safari1.isVisitationAllowed+"\n");

	ForestSafari safari2=new ForestSafari();
	
	/*safari2.safariId=2;
	safari2.name="Kaziranga";
	safari2.location="Assam";
	safari2.hasTransport=true;
	safari2.noOfAnimals=210;
	safari2.isVisitationAllowed=true;*/
	System.out.println("Safari id is:"+safari2.safariId);
	System.out.println("Safari name is:"+safari2.name);
	System.out.println("Safari location is:"+safari2.location);
	System.out.println("Safari has transport?:"+safari2.hasTransport);
	System.out.println("No of animals is:"+safari2.noOfAnimals);
	System.out.println("Safari can have visitation?:"+safari2.isVisitationAllowed+"\n");

	ForestSafari safari3=new ForestSafari(3);
	
	
	/*safari3.safariId=3;
	safari3.name="Ranthambore";
	safari3.location="Rajasthan";
	safari3.hasTransport=true;
	safari3.noOfAnimals=400;
	safari3.isVisitationAllowed=true;*/
	System.out.println("Safari id is:"+safari3.safariId);

	ForestSafari safari4=new ForestSafari(4,"Sundarbans");
	
	/*safari4.safariId=4;
	safari4.name="Sundarbans";
	safari4.location="West Bengal";
	safari4.hasTransport=false;
	safari4.noOfAnimals=500;
	safari4.isVisitationAllowed=false;*/
	System.out.println("Safari id is:"+safari4.safariId);
	System.out.println("Safari name is:"+safari4.name);

	ForestSafari safari5=new ForestSafari(5,"Bandipur","Karnataka");
	
	/*safari5.safariId=5;
	safari5.name="Bandipur";
	safari5.location="Karnataka";
	safari5.hasTransport=true;
	safari5.noOfAnimals=300;
	safari5.isVisitationAllowed=true;*/
	System.out.println("Safari id is:"+safari5.safariId);
	System.out.println("Safari name is:"+safari5.name);
	System.out.println("Safari location is:"+safari5.location);



	
	System.out.println("\nmain ended");
	}
}