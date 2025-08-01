class CountryRunner{
	public static void main(String[] country){
	System.out.println("\nmain started\n");

	City city1=new City("Bangalore");
	State state1=new State("Karnataka",city1);
	Country country1=new Country("India",state1);
	country1.getCountryInfo();

	System.out.println("\nmain ended");
	}
}