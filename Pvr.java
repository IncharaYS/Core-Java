class Pvr{
	int pvrId;
	String name;
	String location;
	Screen screen;
	
	Pvr(){
	}
	
	Pvr(int pvrId,String name,String location,Screen screen){
	this.pvrId=pvrId;
	this.name=name;
	this.location=location;
	this.screen=screen;	
	}
	
	public void getPvrInfo(){
		System.out.println("Pvr Id is: "+pvrId);
		System.out.println("Pvr name is: "+name);
		System.out.println("Pvr location is: "+location+"\n");
		System.out.println("Pvr screen info is: ");
		this.screen.getScreenInfo();
	}

		
}