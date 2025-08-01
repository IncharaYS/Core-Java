class Majestic{
	String name;
	BusStand busStand;

	Majestic(){
		
	}

	Majestic(String name,BusStand busStand){
	this.name=name;
	this.busStand=busStand;
	}

	public void getMajesticInfo(){
		System.out.println("Majestic name is: "+name+"\n");
		System.out.println("Bus stand info is:")
		this.busStand.getBusStandInfo();
	}
}