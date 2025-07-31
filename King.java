class King
{
	King(int kingId,String name,int age,String birthPlace,String heir,String yearsOfRuling){
	this.kingId=kingId=kingId;
	this.name=name;
	this.age=age;
	this.birthPlace=birthPlace;
	this.heir=heir;
	this.yearsOfRuling=yearsOfRuling;
	}
	King(int kingId,String name,int age){
	this.kingId=kingId=kingId;
	this.name=name;
	this.age=age;	
	}
	King(int kingId,String name){
	this.kingId=kingId=kingId;
	this.name=name;	
	}
	King(int kingId){
	this.kingId=kingId=kingId;	
	}
	King(){
		
	}
	int kingId;
	String name;
	int age;
	String birthPlace;
	String heir;
	String yearsOfRuling;
	
	public void getInfo(){
			
	System.out.println("King id is:"+kingId);
	System.out.println("King name is:"+name);
	System.out.println("King age is:"+age);
	System.out.println("King birth place is:"+birthPlace);
	System.out.println("King heir is:"+heir);
	System.out.println("King years of ruling is:"+yearsOfRuling+"\n");
	}
}