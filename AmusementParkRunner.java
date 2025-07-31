class AmusementParkRunner{
	public static void main(String park[]){
	System.out.println("\nmain started\n");
	
	
	AmusementPark park1=new AmusementPark(1,"Wonderla","Banglore","8:00","7:30",1000.00);
	
	/*park1.parkId=1;
	park1.name="Wonderla";
	park1.location="Banglore";
	park1.openingTime="8:00";
	park1.closingTime="7:30";
	park1.price=1000.00;*/
	//park1.getInfo();
	
	System.out.println("Park id is:"+park1.parkId);
	System.out.println("Park name is:"+park1.name);
	System.out.println("Park location is:"+park1.location);
	System.out.println("Park opening Time is:"+park1.openingTime);
	System.out.println("Park closing Time is:"+park1.closingTime);
	System.out.println("Park price is:"+park1.price+"\n");
	
	AmusementPark park2=new AmusementPark();

	/*park2.parkId=2;
	park2.name="Imagicaa";
	park2.location="Mumbai";
	park2.openingTime="9:00";
	park2.closingTime="6:00";
	park2.price=1200.00;*/
	//park2.getInfo();
	
	System.out.println("Park id is:"+park2.parkId);
	System.out.println("Park name is:"+park2.name);
	System.out.println("Park location is:"+park2.location);
	System.out.println("Park opening Time is:"+park2.openingTime);
	System.out.println("Park closing Time is:"+park2.closingTime);
	System.out.println("Park price is:"+park2.price+"\n");

	AmusementPark park3=new AmusementPark(3,"Essel World","Mumbai");

	/*park3.parkId=3;
	park3.name="Essel World";
	park3.location="Mumbai";
	park3.openingTime="10:00";
	park3.closingTime="6:30";
	park3.price=950.00;*/
	//park3.getInfo();
	
	System.out.println("Park id is:"+park3.parkId);
	System.out.println("Park name is:"+park3.name);
	System.out.println("Park location is:"+park3.location+"\n");

	AmusementPark park4=new AmusementPark("11:00","8:00");

	/*park4.parkId=4;
	park4.name="Kingdom of Dreams";
	park4.location="Gurgaon";
	park4.openingTime="11:00";
	park4.closingTime="8:00";
	park4.price=1300.00;*/
	//park4.getInfo();
	
	System.out.println("Park opening Time is:"+park4.openingTime);
	System.out.println("Park closing Time is:"+park4.closingTime+"\n");

	AmusementPark park5=new AmusementPark(1100.00);

	/*park5.parkId=5;
	park5.name="Ramoji Film City";
	park5.location="Hyderabad";
	park5.openingTime="8:30";
	park5.closingTime="5:30";
	park5.price=1100.00;*/
	
	System.out.println("Park price is:"+park5.price+"\n");

	System.out.println("\nmain ended");
	}
}