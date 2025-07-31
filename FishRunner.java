class FishRunner{
	public static void main(String[] fish){
	System.out.println("\nmain started\n");
	
	Fish fish1=new Fish(1,"Blue fish","blue",56.89,34.00,"Fresh water");
	
	/*fish1.fishId=1;
	fish1.species="Blue fish";
	fish1.color="blue";
	fish1.length=56.89;
	fish1.weight=34.00;
	fish1.habitat="Fresh water";*/
	
	System.out.println("Fish id is:"+fish1.fishId);
	System.out.println("Fish species is:"+fish1.species);
	System.out.println("Fish color is:"+fish1.color);
	System.out.println("Fish length is:"+fish1.length);
	System.out.println("Fish weight is:"+fish1.weight);
	System.out.println("Fish habitat is:"+fish1.habitat+"\n");

	Fish fish2=new Fish();
	
	/*fish2.fishId=2;
	fish2.species="Goldfish";
	fish2.color="gold";
	fish2.length=12.3;
	fish2.weight=0.3;
	fish2.habitat="Aquarium";*/
	System.out.println("Fish id is:"+fish2.fishId);
	System.out.println("Fish species is:"+fish2.species);
	System.out.println("Fish color is:"+fish2.color);
	System.out.println("Fish length is:"+fish2.length);
	System.out.println("Fish weight is:"+fish2.weight);
	System.out.println("Fish habitat is:"+fish2.habitat+"\n");

	Fish fish3=new Fish(3,"Clownfish","orange-white",9.2,0.2);
	
	/*fish3.fishId=3;
	fish3.species="Clownfish";
	fish3.color="orange-white";
	fish3.length=9.2;
	fish3.weight=0.2;
	fish3.habitat="Coral reef";*/
	System.out.println("Fish id is:"+fish3.fishId);
	System.out.println("Fish species is:"+fish3.species);
	System.out.println("Fish color is:"+fish3.color);
	System.out.println("Fish length is:"+fish3.length);
	System.out.println("Fish weight is:"+fish3.weight);

	Fish fish4=new Fish(4,"Salmon","silver",76.4);
	
	/*fish4.fishId=4;
	fish4.species="Salmon";
	fish4.color="silver";
	fish4.length=76.4;
	fish4.weight=6.3;
	fish4.habitat="River";*/
	System.out.println("Fish id is:"+fish4.fishId);
	System.out.println("Fish species is:"+fish4.species);
	System.out.println("Fish color is:"+fish4.color);
	System.out.println("Fish length is:"+fish4.length+"\n");

	Fish fish5=new Fish(5,"Betta","red",5.7,0.1,"Aquarium");
	
	/*fish5.fishId=5;
	fish5.species="Betta";
	fish5.color="red";
	fish5.length=5.7;
	fish5.weight=0.1;
	fish5.habitat="Aquarium";*/
	System.out.println("Fish id is:"+fish5.fishId);
	System.out.println("Fish species is:"+fish5.species);
	System.out.println("Fish color is:"+fish5.color+"\n");

	
	System.out.println("\nmain ended");
	}
}