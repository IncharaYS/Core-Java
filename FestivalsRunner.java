class FestivalsRunner{
	public static void main(String[] festival){
	System.out.println("\nmain started\n");
	
	Festivals festival1=new Festivals(1,"Deevali","India","Hindhu","20/10",true);

	/*festival1.festivalId=1;
	festival1.name="Deevali";
	festival1.country="India";
	festival1.religion="Hindhu";
	festival1.date="20/10";
	festival1.hasPublicHoliday=true;*/
	
	System.out.println("Festival id is:"+festival1.festivalId);
	System.out.println("Festival name is:"+festival1.name);
	System.out.println("Festival country is:"+festival1.country);
	System.out.println("Festival religion is:"+festival1.religion);
	System.out.println("Festival date is:"+festival1.date);
	System.out.println("Festival has Public Holiday:"+festival1.hasPublicHoliday+"\n");

	Festivals festival2=new Festivals();

	/*festival2.festivalId=2;
	festival2.name="Christmas";
	festival2.country="USA";
	festival2.religion="Christianity";
	festival2.date="25/12";
	festival2.hasPublicHoliday=true;*/
	
	System.out.println("Festival id is:"+festival2.festivalId);
	System.out.println("Festival name is:"+festival2.name);
	System.out.println("Festival country is:"+festival2.country);
	System.out.println("Festival religion is:"+festival2.religion);
	System.out.println("Festival date is:"+festival2.date);
	System.out.println("Festival has Public Holiday:"+festival2.hasPublicHoliday+"\n");

	Festivals festival3=new Festivals(3,"Ramadan","Saudi Arabia","Islam","10/04");

	/*festival3.festivalId=3;
	festival3.name="Ramadan";
	festival3.country="Saudi Arabia";
	festival3.religion="Islam";
	festival3.date="10/04";
	festival3.hasPublicHoliday=true;*/
	
	System.out.println("Festival id is:"+festival3.festivalId);
	System.out.println("Festival name is:"+festival3.name);
	System.out.println("Festival country is:"+festival3.country);
	System.out.println("Festival religion is:"+festival3.religion);
	System.out.println("Festival date is:"+festival3.date+"\n");

	Festivals festival4=new Festivals(4,"Vesak","Sri Lanka","Buddhism");

	/*festival4.festivalId=4;
	festival4.name="Vesak";
	festival4.country="Sri Lanka";
	festival4.religion="Buddhism";
	festival4.date="15/05";
	festival4.hasPublicHoliday=true;*/
	
	System.out.println("Festival id is:"+festival4.festivalId);
	System.out.println("Festival name is:"+festival4.name);
	System.out.println("Festival country is:"+festival4.country);
	System.out.println("Festival religion is:"+festival4.religion+"\n");


	Festivals festival5=new Festivals(5,"Hanukkah","Israel");

	/*festival5.festivalId=5;
	festival5.name="Hanukkah";
	festival5.country="Israel";
	festival5.religion="Judaism";
	festival5.date="18/12";
	festival5.hasPublicHoliday=false;*/
	
	System.out.println("Festival id is:"+festival5.festivalId);
	System.out.println("Festival name is:"+festival5.name);
	System.out.println("Festival country is:"+festival5.country+"\n");

	System.out.println("\nmain ended");
	}
}