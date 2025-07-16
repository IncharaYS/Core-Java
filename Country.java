class Country{
	public static int getCountryCode(String countryName){
		int countryCode=0;
		
		if(countryName=="India") countryCode=91;
		else if(countryName=="Haiti") countryCode=509;
		else if(countryName=="Hungary") countryCode=36;
		else if(countryName=="Sri Lanka") countryCode=94;
		else if(countryName=="Sweden") countryCode=46;
		else if(countryName=="Switzerland") countryCode=41;
		else if(countryName=="Taiwan") countryCode=886;
		else if(countryName=="Turkey") countryCode=90;
		else if(countryName=="United Kingdom") countryCode=44;
		else if(countryName=="United State") countryCode=1;
		else if(countryName=="Afghanisthan") countryCode=93;
		else if(countryName=="Aland islands") countryCode=18;
		else if(countryName=="Albania") countryCode=355;
		else if(countryName=="Algeria") countryCode=213;
		else if(countryName=="American Samoa") countryCode=684;
		else if(countryName=="Andorra") countryCode=376;
		else if(countryName=="Angola") countryCode=244;
		else if(countryName=="Anguilla") countryCode=264;
		else if(countryName=="Antarctica") countryCode=6721;
		else if(countryName=="Antigua and Barbuda") countryCode=268;
		else if(countryName=="Argentina") countryCode=54;
		else if(countryName=="Armenia") countryCode=374;
		else if(countryName=="Aruba") countryCode=297;
		else if(countryName=="Australia") countryCode=61;
		else if(countryName=="Austria") countryCode=43;
		else if(countryName=="Azerbaijan") countryCode=994;
		else if(countryName=="Bahamas") countryCode=242;
		else if(countryName=="Bahrain") countryCode=973;
		else if(countryName=="Bangladesh") countryCode=880;
		else if(countryName=="Barbados") countryCode=246;
		else if(countryName=="Belarus") countryCode=375;
		else if(countryName=="Belgium") countryCode=32;
		else if(countryName=="Belize") countryCode=501;
		else if(countryName=="Benin") countryCode=229;
		else if(countryName=="Bermuda") countryCode=441;
		else if(countryName=="Bhutan") countryCode=975;
		else if(countryName=="Bolivia") countryCode=591;
		else if(countryName=="Bonaire") countryCode=5997;
		else if(countryName=="Bosnia") countryCode=387;
		else if(countryName=="Botswana") countryCode=267;
		else if(countryName=="Bouvet island") countryCode=47;
		else if(countryName=="Brazil") countryCode=55;
		else if(countryName=="British Indian Ocean Territory") countryCode=246;
		else if(countryName=="Brunei Darussalam") countryCode=673;
		else if(countryName=="Bulgaria") countryCode=359;
		else if(countryName=="Burkina Faso") countryCode=226;
		else if(countryName=="Burundi") countryCode=257;
		else if(countryName=="Cambodia") countryCode=855;
		else if(countryName=="Cameroon") countryCode=238;
		else if(countryName=="Cape Verde") countryCode=345;
		
		else 
			System.out.println(countryName+" is Invalid");
		
		return countryCode;
	}
}