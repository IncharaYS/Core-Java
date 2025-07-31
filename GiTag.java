class GiTag{
	GiTag(int GiTagId,String name,String state,String catogory,int period,String registeredYear){
	this.GiTagId=GiTagId;
	this.name=name;
	this.state=state;
	this.catogory=catogory;
	this.period=period;
	this.registeredYear=registeredYear;
	}
	GiTag(){
		
	}
	GiTag(int GiTagId,String name,String state){
	this.GiTagId=GiTagId;
	this.name=name;
	this.state=state;
	}
	GiTag(int GiTagId,String name){
	this.GiTagId=GiTagId;
	this.name=name;	
	}
	GiTag(int GiTagId){
	this.GiTagId=GiTagId;	
	}
	int GiTagId;
	String name;
	String state;
	String catogory;
	int period;
	String registeredYear;
	
	public void getInfo(){
			
	System.out.println("GiTag id is"+GiTagId);
	System.out.println("GiTag name is"+name);
	System.out.println("GiTag state is"+state);
	System.out.println("GiTag catogory is"+catogory);
	System.out.println("GiTag period is"+period);
	System.out.println("GiTag registered Year is"+registeredYear+"\n");
	}
}