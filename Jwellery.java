class Jwellery{
	int jewelleryId;
	String name;
	String material;
	double weight;
	double price;
	boolean isCertified;
	
	public void getInfo(){
		
	System.out.println("Jewellery Id is: "+jewelleryId);
	System.out.println("Jewellery name is: "+name);
	System.out.println("Jewellery material is :"+material);
	System.out.println("Jewellery weight is: "+weight);
	System.out.println("Jewellery price is: "+price);
	System.out.println("Jewellery is certified?: "+isCertified+"\n");
	}
}