class Karate{
	Karate(int karateId,double height,double weight,String rank,String dominantHand,String beltColor){
	this.karateId=karateId;
	this.rank=rank;
	this.height=height;
	this.weight=weight;
	this.dominantHand=dominantHand;
	this.beltColor=beltColor;
	}
	Karate(int karateId,double height,double weight){
	this.karateId=karateId;
	this.rank=rank;
	this.height=height;
	}
	Karate(int karateId,double height){
	this.karateId=karateId;
	this.rank=rank;	
	}
	Karate(int karateId){
	this.karateId=karateId;	
	}
	Karate(){
		
	}
	int karateId;
	String rank;
	double height;
	double weight;
	String dominantHand;
	String beltColor;
	
	public void getInfo(){
	System.out.println("Karate id is:"+karateId);
	System.out.println("Karate height is:"+height);
	System.out.println("Karate weight is:"+weight);
	System.out.println("Karate dominant Hand is:"+dominantHand);
	System.out.println("Karate rank is:"+rank);
	System.out.println("Karate belt Color is:"+beltColor+"\n");
		
	}
}