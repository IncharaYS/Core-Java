class Rod{
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