class GiTagRunner{
	public static void main(String tag[]){
	System.out.println("\nmain started\n");
	
	
	GiTag tag1=new GiTag(1,"Darjeeling Tea","West Bengal","Agricultural",10,"2004");
	
	/*tag1.GiTagId=1;
	tag1.name="Darjeeling Tea";
	tag1.state="West Bengal";
	tag1.catogory="Agricultural";
	tag1.period=10;
	tag1.registeredYear="2004";*/
	System.out.println("GiTag id is"+tag1.GiTagId);
	System.out.println("GiTag name is"+tag1.name);
	System.out.println("GiTag state is"+tag1.state);
	System.out.println("GiTag catogory is"+tag1.catogory);
	System.out.println("GiTag period is"+tag1.period);
	System.out.println("GiTag registered Year is"+tag1.registeredYear+"\n");

	GiTag tag2=new GiTag();
	
	/*tag2.GiTagId=2;
	tag2.name="Mysore Silk";
	tag2.state="Karnataka";
	tag2.catogory="Handicraft";
	tag2.period=15;
	tag2.registeredYear="2005";*/System.out.println("GiTag id is"+tag2.GiTagId);
	System.out.println("GiTag name is"+tag2.name);
	System.out.println("GiTag state is"+tag2.state);
	System.out.println("GiTag catogory is"+tag2.catogory);
	System.out.println("GiTag period is"+tag2.period);
	System.out.println("GiTag registered Year is"+tag2.registeredYear+"\n");

	GiTag tag3=new GiTag(3);
	
	/*tag3.GiTagId=3;
	tag3.name="Alphonso Mango";
	tag3.state="Maharashtra";
	tag3.catogory="Agricultural";
	tag3.period=12;
	tag3.registeredYear="2006";*/
	System.out.println("GiTag id is"+tag3.GiTagId+"\n");

	GiTag tag4=new GiTag(4,"Pochampally Ikat");
	
	
	/*tag4.GiTagId=4;
	tag4.name="Pochampally Ikat";
	tag4.state="Telangana";
	tag4.catogory="Handicraft";
	tag4.period=18;
	tag4.registeredYear="2007";*/
	System.out.println("GiTag id is"+tag4.GiTagId);
	System.out.println("GiTag name is"+tag4.name+"\n");


	GiTag tag5=new GiTag(5,"Kanjeevaram Silk","Tamil Nadu","Handicraft",14,"2008");
	
	/*tag5.GiTagId=5;
	tag5.name="Kanjeevaram Silk";
	tag5.state="Tamil Nadu";
	tag5.catogory="Handicraft";
	tag5.period=14;
	tag5.registeredYear="2008";*/
	System.out.println("GiTag id is"+tag5.GiTagId);
	System.out.println("GiTag name is"+tag5.name);
	System.out.println("GiTag state is"+tag5.state+"\n");



	
	System.out.println("\nmain ended");
	}
}