class ForestSafari{
	int safariId;
	String name;
	String location;
	boolean hasTransport;
	int noOfAnimals;
	boolean isVisitationAllowed;
	
	public void getInfo(){
	System.out.println("Safari id is:"+safariId);
	System.out.println("Safari name is:"+name);
	System.out.println("Safari location is:"+location);
	System.out.println("Safari has transport?:"+hasTransport);
	System.out.println("No of animals is:"+noOfAnimals);
	System.out.println("Safari can have visitation?:"+isVisitationAllowed+"\n");
		
	}
}