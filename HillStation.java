class HillStation{
	
	/*static String jammabaneCottage="jammabane cottage";
	static String mothersBounty="Mothers bounty";
	static String amanvara="Amanvara";
	static String montrose="Montrose";
	static String marriott="Marriott";
	static String purplePalms="Purple palms";
	static String prashanthi="Prashanthi";
	
	static String[] resorts={jammabaneCottage,mothersBounty,amanvara,montrose,marriott,purplePalms,prashanthi};*/
	
	public static void main(String[] resortnames){
		
	System.out.println("\nmain started\n");
		
	String jammabaneCottage="jammabane cottage";
	String mothersBounty="Mothers bounty";
	String amanvara="Amanvara";
	String montrose="Montrose";
	String marriott="Marriott";
	String purplePalms="Purple palms";
	String prashanthi="Prashanthi";
	
	String[] resorts={jammabaneCottage,mothersBounty,amanvara,montrose,marriott,purplePalms,prashanthi};
	
	System.out.println("List of resorts are:");
	for(String resort:resorts){
		System.out.println(resort);
	}
	System.out.println("\nmain ended");
	}
}