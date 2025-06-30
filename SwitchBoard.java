class SwitchBoard{


	static String modelNo;
	static String serialNumber;
	static String installationId;
	static String location;
	static int roomNo;
	static String buildingName;
	static int floorNo;
	static String installationDate;
	static boolean isMainSwitchBoard;
	static boolean hasRemoteControl;
	static double voltageRating;
	static double currentRating;
	static double frequency;
	static int noOfCircuits;
	static int noOfBreakers;
	static double maxLoadCapacity;
	static int phases;
	static String ipRating;
	static String panelType;
	static String color;
	static boolean hasOverloadProtection;
	
	public static void main(String[] description){
		
	System.out.println("Model nyumber is:"+modelNo);
	System.out.println("Serial number is:"+serialNumber);
	System.out.println("Location is"+location);
	System.out.println("Room number is:"+roomNo);
	System.out.println("Building name is:"+buildingName);
	System.out.println("Floor number is:"+floorNo);
	System.out.println("Installation date is:"+installationDate);
	System.out.println("Is it a main switch board:"+isMainSwitchBoard);
	System.out.println("Does it have remote control"+hasRemoteControl);
	System.out.println("Voltage rating is:"+voltageRating);
	System.out.println("Current rating is:"+currentRating);
	System.out.println("Frequency is:"+frequency);
	System.out.println("No of circuits is:"+noOfCircuits);
	System.out.println("No of Breakers:"+noOfBreakers);
	System.out.println("Maximum load capacity is:"+maxLoadCapacity);
	System.out.println("No od phases is:"+phases);
	System.out.println("IP rating is:"+ipRating);
	System.out.println("Panel type is:"+panelType);
	System.out.println("Color is:"+color);
	System.out.println("Installation ID is:"+installationId);
	System.out.println("Has overhead protection:"+hasOverloadProtection+"\n");
		
	modelNo="BSD123";
	serialNumber="FYG1234";
	installationId="INST-00123";
	location="Dining area";
	roomNo=104;
	buildingName="Sumukha";
	floorNo=2;
	installationDate="21/10/2024";
	isMainSwitchBoard=true;
	hasRemoteControl=false;
	voltageRating=415.0d;
	currentRating=250.0d;
	frequency=50.0d;
	noOfCircuits=12;
	noOfBreakers=8;
	maxLoadCapacity=100.0d;
	phases=3;
	ipRating="IP34";
	panelType="Metal";
	color="Blue";
	hasOverloadProtection=true;
		
	System.out.println("Model nyumber is:"+modelNo);
	System.out.println("Serial number is:"+serialNumber);
	System.out.println("Location is"+location);
	System.out.println("Room number is:"+roomNo);
	System.out.println("Building name is:"+buildingName);
	System.out.println("Floor number is:"+floorNo);
	System.out.println("Installation date is:"+installationDate);
	System.out.println("Is it a main switch board:"+isMainSwitchBoard);
	System.out.println("Does it have remote control"+hasRemoteControl);
	System.out.println("Voltage rating is:"+voltageRating);
	System.out.println("Current rating is:"+currentRating);
	System.out.println("Frequency is:"+frequency);
	System.out.println("No of circuits is:"+noOfCircuits);
	System.out.println("No of Breakers:"+noOfBreakers);
	System.out.println("Maximum load capacity is:"+maxLoadCapacity);
	System.out.println("No od phases is:"+phases);
	System.out.println("IP rating is:"+ipRating);
	System.out.println("Panel type is:"+panelType);
	System.out.println("Color is:"+color);
	System.out.println("Installation ID is:"+installationId);
	System.out.println("Has overhead protection:"+hasOverloadProtection);
	}
}