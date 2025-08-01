class Platform{
	int number;
	String zone;
	boolean isCovered;

	Platform(){
		
	}

	Platform(int number,String zone,boolean isCovered){
	this.number=number;
	this.zone=zone;
	this.isCovered=isCovered;
	}

	public void getPlatformInfo(){
		System.out.println("Platform number is: "+number);
		System.out.println("Zone is: "+zone);
		System.out.println("Is it covered?: "+isCovered);
	}
}