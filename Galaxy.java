class Galaxy{
	String name;
	SolarSystem solarSystem;

	Galaxy(){
		
	}

	Galaxy(String name,SolarSystem solarSystem){
	this.name=name;
	this.solarSystem=solarSystem;
	}

	public void getInfo(){
		System.out.println("Galaxy name is: "+name+"\n");
		System.out.println("Solar system info is:");
		solarSystem.getGalaxyInfo();
	}
}