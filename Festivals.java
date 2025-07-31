class Festivals{
	Festivals(int festivalId,String name,String country,String religion,String date,boolean hasPublicHoliday){
	this.festivalId=festivalId;
	this.name=name;
	this.country=country;
	this.religion=religion;
	this.date=date;
	this.hasPublicHoliday=hasPublicHoliday;
	}
	Festivals(int festivalId,String name,String country,String religion,String date){
	this.festivalId=festivalId;
	this.name=name;
	this.country=country;
	this.religion=religion;
	this.date=date;	
	}
	Festivals(int festivalId,String name,String country,String religion){
	this.festivalId=festivalId;
	this.name=name;
	this.country=country;
	this.religion=religion;	
	}
	Festivals(int festivalId,String name,String country){
	this.festivalId=festivalId;
	this.name=name;
	this.country=country;
	}
	Festivals(){
		
	}
	int festivalId;
	String name;
	String country;
	String religion;
	String date;
	boolean hasPublicHoliday;
	
	public void getInfo(){
	System.out.println("Festival id is:"+festivalId);
	System.out.println("Festival name is:"+name);
	System.out.println("Festival country is:"+country);
	System.out.println("Festival religion is:"+religion);
	System.out.println("Festival date is:"+date);
	System.out.println("Festival has Public Holiday:"+hasPublicHoliday+"\n");
	}
	
}