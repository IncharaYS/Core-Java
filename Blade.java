jclass Blade{
	Blade(int bladeId,String bladeCompany,double price,String bladeType,int bladeLength,double bladeThickness){
	this.bladeId=bladeId;
	this.bladeCompany=bladeCompany;
	this.price=price;
	this.bladeType=bladeType;
	this.bladeLength=bladeLength;
	this.bladeThickness=bladeThickness;
	}
	int bladeId;
	String bladeCompany;
	double price;
	String bladeType;
	int bladeLength;
	double bladeThickness;
	
	public void getInfo(){
		
	System.out.println("Blade Id is:"+bladeId);
	System.out.println("Blade company is:"+bladeCompany);
	System.out.println("Blade price is:"+price);
	System.out.println("Blade type is:"+bladeType);
	System.out.println("Blade length is:"+bladeLength);
	System.out.println("Blade thickness is:"+bladeThickness+"\n");
	}
}