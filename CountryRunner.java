class CountryRunner{

	public static void main(String country[]){
		
	String countryName="India";	
	int countryCode=Country.getCountryCode(countryName);
	System.out.println("Country code for "+countryName+" is: "+countryCode+"\n");
	
	countryName="Cambodia";	
	countryCode=Country.getCountryCode(countryName);
	System.out.println("Country code for "+countryName+" is: "+countryCode+"\n");
	
	countryName="Austria";	
	countryCode=Country.getCountryCode(countryName);
	System.out.println("Country code for "+countryName+" is: "+countryCode+"\n");
	
	countryName="Canada";	
	countryCode=Country.getCountryCode(countryName);
	System.out.println("Country code for "+countryName+" is: "+countryCode);
	
	}

}