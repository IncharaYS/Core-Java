class Rod{
	Rod(int rodId,String material,double length,double weight,boolean isFlexible,double diameter){
	this.rodId=rodId;
	this.material=material;
	this.length=length;
	this.weight=weight;
	this.isFlexible=isFlexible;
	this.diameter=diameter;
	}
	int rodId;
	String material;
	double length;
	double weight;
	boolean isFlexible;
	double diameter;
	
	public void getInfo(){
	System.out.println("Rod Id is: "+rodId);
	System.out.println("Rod material is: "+material);
	System.out.println("Rod length is: "+length);
	System.out.println("Rod weight is: "+weight);
	System.out.println("Rod is flexible: "+isFlexible);
	System.out.println("Rod diameter is: "+diameter+"\n");
	}
}