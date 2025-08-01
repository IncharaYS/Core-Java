class BusStand{
	String name;
	int capacity;
	Platform platform;

	BusStand(){
		
	}

	BusStand(String name,int capacity,Platform platform){
	this.name=name;
	this.capacity=capacity;
	this.platform=platform;
	}

	public void getBusStandInfo(){
		System.out.println("Bus stand name is: "+name);
		System.out.println("Capacity is: "+capacity+"\n");
		System.out.println("Platforn info is:");
		this.platform.getPlatformInfo();
	}
}