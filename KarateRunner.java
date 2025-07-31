class KarateRunner{
	public static void main(String karate[]){
	System.out.println("\nmain started\n");
	
	Karate karate1 = new Karate(1,175,75,"Right","black belt 1st dan","Black");
	
	/* karate1.karateId=1;
	karate1.height=175;
	karate1.weight=75;
	karate1.dominantHand="Right";
	karate1.rank="black belt 1st dan";
	karate1.beltColor="Black"; */
	System.out.println("Karate id is:"+karate1.karateId);
	System.out.println("Karate height is:"+karate1.height);
	System.out.println("Karate weight is:"+karate1.weight);
	System.out.println("Karate dominant Hand is:"+karate1.dominantHand);
	System.out.println("Karate rank is:"+karate1.rank);
	System.out.println("Karate belt Color is:"+karate1.beltColor+"\n");

	Karate karate2 = new Karate();
	
	/* karate2.karateId=2;
	karate2.height=170;
	karate2.weight=68;
	karate2.dominantHand="Left";
	karate2.rank="Brown belt";
	karate2.beltColor="Brown"; */
	System.out.println("Karate id is:"+karate2.karateId);
	System.out.println("Karate height is:"+karate2.height);
	System.out.println("Karate weight is:"+karate2.weight);
	System.out.println("Karate dominant Hand is:"+karate2.dominantHand);
	System.out.println("Karate rank is:"+karate2.rank);
	System.out.println("Karate belt Color is:"+karate2.beltColor+"\n");

	Karate karate3 = new Karate(3);
	
	/* karate3.karateId=3;
	karate3.height=180;
	karate3.weight=82;
	karate3.dominantHand="Right";
	karate3.rank="Green belt";
	karate3.beltColor="Green"; */
	System.out.println("Karate id is:"+karate3.karateId+"\n");


	Karate karate4 = new Karate(4,165);
	
	/* karate4.karateId=4;
	karate4.height=165;
	karate4.weight=60;
	karate4.dominantHand="Right";
	karate4.rank="Blue belt";
	karate4.beltColor="Blue"; */
	System.out.println("Karate id is:"+karate4.karateId);
	System.out.println("Karate height is:"+karate4.height+"\n");

	Karate karate5 = new Karate(5,172,70,"Left","Yellow belt","Yellow");
	
	/* karate5.karateId=5;
	karate5.height=172;
	karate5.weight=70;
	karate5.dominantHand="Left";
	karate5.rank="Yellow belt";
	karate5.beltColor="Yellow"; */
	System.out.println("Karate id is:"+karate5.karateId);
	System.out.println("Karate height is:"+karate5.height);
	System.out.println("Karate weight is:"+karate5.weight+"\n");

	
	System.out.println("\nmain ended");
	}
}