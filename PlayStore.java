class PlayStore{
	
	/*static String app1="Instagram";
	static String app2="Subway Surfers";
	static String app3="Chess.com";
	static String app4="Clash of Clans";
	static String app5="Facebook";
	static String app6="Uber";
	static String app7="Ola";
	static String app8="Book My Show";
	static String app9="Blinkit";
	static String app10="Canva";
	
	static String appNames[]={app1,app2,app3,app4,app5,app6,app7,app8,app9,app10};*/
	
	public static void main(String apps[]){
		
	System.out.println("\nmain started\n");	
	
	String app1="Instagram";
	String app2="Subway Surfers";
	String app3="Chess.com";
	String app4="Clash of Clans";
	String app5="Facebook";
	String app6="Uber";
	String app7="Ola";
	String app8="Book My Show";
	String app9="Blinkit";
	String app10="Canva";
	
	String appNames[]={app1,app2,app3,app4,app5,app6,app7,app8,app9,app10};
		
	System.out.println("List of apps are:");
	for(String appName:appNames){
		System.out.println(appName);
	}
	System.out.println("\nmain ended");
	}
}