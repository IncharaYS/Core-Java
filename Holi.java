class Holi{
	int holiId;
	boolean hasEcoFriendlyColors;
	int noOfDays;
	boolean isWaterUsed;
	boolean isPublicHoliday;
	String location;
	
	Holi(){
	this(3,true,6,true,false,"Shimoga");
	System.out.println("Default constructor");
	}
	Holi(int holiId,boolean hasEcoFriendlyColors,int noOfDays,boolean isWaterUsed,boolean isPublicHoliday,String location){
	this(true,true,true);
	this.holiId=holiId;
	this.hasEcoFriendlyColors=hasEcoFriendlyColors;
	this.noOfDays=noOfDays;
	this.isWaterUsed=isWaterUsed;
	this.isPublicHoliday=isPublicHoliday;
	this.location=location;
	System.out.println("Constructor with all values initualization");
	}
	Holi(int holiId){
	this(5,false);
	this.holiId=holiId;
	System.out.println("constructor with id initualization");
	}
	Holi(int holiId,boolean isPublicHoliday){
	this(false,false,true);
	this.isPublicHoliday=isPublicHoliday;
	this.holiId=holiId;
	System.out.println("constructor with id and isPublicHoliday initualization");
	}
	Holi(String location){
	this(3);
	this.location=location;
	System.out.println("constructor with location initualization");
	}
	Holi(int noOfDays,int holiId){
	this("Banglore");
	this.noOfDays=noOfDays;
	this.holiId=holiId;
	System.out.println("constructor with noOfDays id initualization");
	}
	Holi(boolean hasEcoFriendlyColors,boolean isPublicHoliday,boolean isWaterUsed){
	this.hasEcoFriendlyColors=hasEcoFriendlyColors;
	this.isPublicHoliday=isPublicHoliday;
	this.isWaterUsed=isWaterUsed;
	System.out.println("constructor with hasEcoFriendlyColors isPublicHoliday isWaterUsed initualization");
	}
	
	public void getInfo(){
		System.out.println("Holi Id is: "+holiId);
		System.out.println("Holi has Eco-Friendly Colors?: "+hasEcoFriendlyColors);
		System.out.println("Holi is Public Holiday?: "+isPublicHoliday);
		System.out.println("Is water used?: "+isWaterUsed);
		System.out.println("Holi location is: "+location);
		System.out.println("Holi no of days is: "+noOfDays+"\n");
		
	}
}