class Court{

	static String courtName;
	static String courtType;
	static String location;
	static String city;
	static String state;
	static int totalJudges;
	static int activeCases;
	static int totalStaff;
	static boolean isHighCourt;
	static boolean hasOnlineHearings;
	static double caseFee;
	static boolean hasCCTV;
	static boolean hasSecurityCheck;
	static int numberOfCourtrooms;
	static boolean isOpenToPublic;
	static String chiefJustice;
	static String establishedYear;
	static boolean isRecordsEnabled;
	static int dailyCasesHeard;
	static boolean hasLawLibrary;
	
	public static void main(String[] court) {
		
		System.out.println("Court name is:"+courtName);
		System.out.println("Court type is:"+courtType);
		System.out.println("Court location is:"+location);
		System.out.println("Court city is:"+city);
		System.out.println("Court state is:"+state);
		System.out.println("Total number of judges is:"+totalJudges);
		System.out.println("Number of active cases is:"+activeCases);
		System.out.println("Total staff is:"+totalStaff);
		System.out.println("Is high court:"+isHighCourt);
		System.out.println("Has online hearings:"+hasOnlineHearings);
		System.out.println("Case fee is:"+caseFee);
		System.out.println("Has CCTV:"+hasCCTV);
		System.out.println("Has security check:"+hasSecurityCheck);
		System.out.println("Number of courtrooms is:"+numberOfCourtrooms);
		System.out.println("Is open to public:"+isOpenToPublic);
		System.out.println("Chief justice is:"+chiefJustice);
		System.out.println("Established year is:"+establishedYear);
		System.out.println("Is digital records enabled:"+isRecordsEnabled);
		System.out.println("Daily cases heard:"+dailyCasesHeard);
		System.out.println("Has law library:"+hasLawLibrary+"\n");
		
	courtName="high Court";
	courtType="Criminal";
	location="Karnataka";
	city="Banglore";
	state="Karnataka";
	totalJudges=15;
	activeCases=210;
	totalStaff=80;
	isHighCourt=true;
	hasOnlineHearings=true;
	caseFee=500.0;
	hasCCTV=true;
	hasSecurityCheck=true;
	numberOfCourtrooms=10;
	isOpenToPublic=true;
	chiefJustice="Justice Sam";
	establishedYear="1950";
	isRecordsEnabled=true;
	dailyCasesHeard=35;
	hasLawLibrary=true;
		
		System.out.println("Court name is:"+courtName);
		System.out.println("Court type is:"+courtType);
		System.out.println("Court location is:"+location);
		System.out.println("Court city is:"+city);
		System.out.println("Court state is:"+state);
		System.out.println("Total number of judges is:"+totalJudges);
		System.out.println("Number of active cases is:"+activeCases);
		System.out.println("Total staff is:"+totalStaff);
		System.out.println("Is high court:"+isHighCourt);
		System.out.println("Has online hearings:"+hasOnlineHearings);
		System.out.println("Case fee is:"+caseFee);
		System.out.println("Has CCTV:"+hasCCTV);
		System.out.println("Has security check:"+hasSecurityCheck);
		System.out.println("Number of courtrooms is:"+numberOfCourtrooms);
		System.out.println("Is open to public:"+isOpenToPublic);
		System.out.println("Chief justice is:"+chiefJustice);
		System.out.println("Established year is:"+establishedYear);
		System.out.println("Is digital records enabled:"+isRecordsEnabled);
		System.out.println("Daily cases heard:"+dailyCasesHeard);
		System.out.println("Has law library:"+hasLawLibrary);
	}
}
