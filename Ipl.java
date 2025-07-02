class Ipl{
	
	/*static String rcb="RCB";
	static String csk="CSK";
	static String rr="RR";
	static String mi="MI";
	static String gt="GT";
	static String srh="SRH";
	static String pksb="PKSB";
	static String lsg="LSG";
	static String kkr="KKr";
	static String dc="DC";
	
	static String teamNames[]={rcb,csk,rr,mi,gt,srh,pksb,lsg,kkr,dc};*/
	
	public static void main(String ipl[]){
		
	System.out.println("\nmain started\n");
	
	String rcb="RCB";
	String csk="CSK";
	String rr="RR";
	String mi="MI";
	String gt="GT";
	String srh="SRH";
	String pksb="PKSB";
	String lsg="LSG";
	String kkr="KKr";
	String dc="DC";
	
	String teamNames[]={rcb,csk,rr,mi,gt,srh,pksb,lsg,kkr,dc};
		
	System.out.println("List of IPL teams are:");
	for(String teamName:teamNames){
		System.out.println(teamName);
	}
	System.out.println("\nmain ended");
	}
}