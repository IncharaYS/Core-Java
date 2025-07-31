class Fish{
	Fish(int fishId,String species,String color,double length,double weight,String habitat){
	this.fishId=fishId;
	this.species=species=species;
	this.color=color;
	this.length=length;
	this.weight=weight;
	this.habitat=habitat;
	}
	Fish(){
		
	}
	Fish(int fishId,String species,String color,double length,double weight){
	this.fishId=fishId;
	this.species=species=species;
	this.color=color;
	this.length=length;
	this.weight=weight;
	}
	Fish(int fishId,String species,String color,double length){
	this.fishId=fishId;
	this.species=species=species;
	this.color=color;
	this.length=length;	
	}
	Fish(int fishId,String species,String color){
	this.fishId=fishId;
	this.species=species=species;
	this.color=color;
	}
	int fishId;
	String species;
	String color;
	double length;
	double weight;
	String habitat;
	
	public void getInfo(){
	System.out.println("Fish id is:"+fishId);
	System.out.println("Fish species is:"+species);
	System.out.println("Fish color is:"+color);
	System.out.println("Fish length is:"+length);
	System.out.println("Fish weight is:"+weight);
	System.out.println("Fish habitat is:"+habitat+"\n");
	}
}