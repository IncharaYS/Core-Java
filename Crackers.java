class Crackers{
	Crackers(int crackersId,String name,String type,double weight,double price,String size){
	this.crackersId=crackersId;
	this.name=name;
	this.type=type;
	this.size=size;
	this.weight=weight;
	this.price=price;
	}
	Crackers(int crackersId){
	this.crackersId=crackersId;	
	}
	Crackers(int crackersId,String name){
	this.crackersId=crackersId;
	this.name=name;	
	}
	Crackers(int crackersId,String name,String type){
	this.crackersId=crackersId;
	this.name=name;
	this.type=type;	
	}
	Crackers(){
		
	}
	int crackersId;
	String name;
	String type;
	String size;
	double weight;
	double price;
	
	public void getInfo(){
	System.out.println("Crackers id is:"+crackersId);
	System.out.println("Crackers name is:"+name);
	System.out.println("Crackers type is:"+type);
	System.out.println("Crackers weight is:"+weight);
	System.out.println("Crackers price is:"+price);
	System.out.println("Crackers size is:"+size+"\n");
	}
}