class SocialMedia{
	
	/*static String media1="Instagram";
	static String media2="Facebook";
	static String media3="Snapchat";
	static String media4="Pintrest";
	static String media5="Linkedin";
	static String media6="Youtube";
	static String media7="Telegram";
	static String media8="Reditt";
	static String media9="Twitch";
	static String media10="Discord";
	
	static String[] mediaNames={media1,media2,media3,media4,media5,media6,media7,media8,media9,media10};*/
	
	public static void main(String names[]){

	System.out.println("\nmain started\n");
	
	String media1="Instagram";
	String media2="Facebook";
	String media3="Snapchat";
	String media4="Pintrest";
	String media5="Linkedin";
	String media6="Youtube";
	String media7="Telegram";
	String media8="Reditt";
	String media9="Twitch";
	String media10="Discord";
	
	String[] mediaNames={media1,media2,media3,media4,media5,media6,media7,media8,media9,media10};


	System.out.println("List of social media area:");
	for(String mediaName:mediaNames){
		System.out.println(mediaName);
	}
	System.out.println("\nmain ended");
}
}