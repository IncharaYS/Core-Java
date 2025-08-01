class GalaxyRunner{
	public static void main(String[] galaxy){
	System.out.println("\nmain started\n");

	Planet planet1=new Planet("Earth");
	SolarSystem solarSystem1=new SolarSystem("Solar", planet1);
	Galaxy galaxy1=new Galaxy("Milky Way", solarSystem1);
	galaxy1.getInfo();

	System.out.println("\nmain ended");
	}
}