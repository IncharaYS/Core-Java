class SolarSystem{
	String name;
	Planet planet;

	SolarSystem(){
		
	}

	SolarSystem(String name,Planet planet){
	this.name=name;
	this.planet=planet;
	}

	public void getGalaxyInfo(){
		System.out.println("Solar System name is : "+name+"\n");
		System.out.println("Planet info is: ");
		planet.getPlanetInfo();
	}
}