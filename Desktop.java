class Desktop{


	static String brand;
	static String model;
	static String processor;
	static int ram;
	static int storage;
	static boolean hasSsd;
	static String graphicCard;
	static int usbPorts;
	static boolean hasOpticalDrive;
	static int powerSupply;
	static String os;
	static String version;
	static boolean hasAntivirus;
	static boolean isActivated;
	static boolean officeInstalled;
	static boolean isPoweredOn;
	static int uptime;
	static double cpuUsage;
	static double temprature;
	static boolean isConnectedToNetwork;
	static String color;
	
	public static void main(String[] description){
		
	System.out.println("Desktop brand is:"+brand);
	System.out.println("Desktop model is:"+model);
	System.out.println("Desktop processor is"+processor);
	System.out.println("Desktop ram:"+ram);
	System.out.println("Desktop storage is:"+storage);
	System.out.println("Has SSd:"+hasSsd);
	System.out.println("Desktop Graphic card  is:"+graphicCard);
	System.out.println("No of usb ports is:"+usbPorts);
	System.out.println("Has Optical Drive:"+hasOpticalDrive	);
	System.out.println("Power Supply is"+powerSupply);
	System.out.println("OS is:"+os);
	System.out.println("Version is:"+version);
	System.out.println("Has AntiVirus:"+hasAntivirus);
	System.out.println("Is antivirus activated:"+isActivated);
	System.out.println("Is Office installed:"+officeInstalled);
	System.out.println("Is powered on:"+isPoweredOn);
	System.out.println("Uptime  is:"+uptime);
	System.out.println("CPU usage is:"+cpuUsage);
	System.out.println("Temprature is:"+temprature);
	System.out.println("Is connected to netword:"+isConnectedToNetwork);
	System.out.println("Color is:"+color+"\n");
		
	brand="Dell";
	model="7090";
	processor="Intel core i7";
	ram=16;
	storage=512;
	hasSsd=true;
	graphicCard="NVIDIA";
	usbPorts=6;
	hasOpticalDrive=false;
	powerSupply=450;
	os="Windows 11";
	version="22H2";
	hasAntivirus=true;
	isActivated=true;
	officeInstalled=true;
	isPoweredOn=false;
	uptime=0;
	cpuUsage=22.2d;
	temprature=45.77d;
	isConnectedToNetwork=true;
	color="blue";
		
	System.out.println("Desktop brand is:"+brand);
	System.out.println("Desktop model is:"+model);
	System.out.println("Desktop processor is"+processor);
	System.out.println("Desktop ram:"+ram);
	System.out.println("Desktop storage is:"+storage);
	System.out.println("Has SSd:"+hasSsd);
	System.out.println("Desktop Graphic card  is:"+graphicCard);
	System.out.println("No of usb ports is:"+usbPorts);
	System.out.println("Has Optical Drive:"+hasOpticalDrive	);
	System.out.println("Power Supply is"+powerSupply);
	System.out.println("OS is:"+os);
	System.out.println("Version is:"+version);
	System.out.println("Has AntiVirus:"+hasAntivirus);
	System.out.println("Is antivirus activated:"+isActivated);
	System.out.println("Is Office installed:"+officeInstalled);
	System.out.println("Is powered on:"+isPoweredOn);
	System.out.println("Uptime  is:"+uptime);
	System.out.println("CPU usage is:"+cpuUsage);
	System.out.println("Temprature is:"+temprature);
	System.out.println("Is connected to netword:"+isConnectedToNetwork);
	System.out.println("Color is:"+color);
	}
}