class JwelleryRunner{
	public static void main(String jewels[]){
	System.out.println("\nmain started\n");
	
	Jwellery jewel1=new Jwellery(1,"Diamond Ring","Gold",5.2,35000.00,true);
	
	/*jewel1.jewelleryId=1;
	jewel1.name="Diamond Ring";
	jewel1.material="Gold";
	jewel1.weight=5.2;
	jewel1.price=35000.00;
	jewel1.isCertified=true;*/
	System.out.println("Jewellery Id is: "+jewel1.jewelleryId);
	System.out.println("Jewellery name is: "+jewel1.name);
	System.out.println("Jewellery material is :"+jewel1.material);
	System.out.println("Jewellery weight is: "+jewel1.weight);
	System.out.println("Jewellery price is: "+jewel1.price);
	System.out.println("Jewellery is certified?: "+jewel1.isCertified+"\n");

	Jwellery jewel2=new Jwellery();
	
	/*jewel2.jewelleryId=2;
	jewel2.name="Pearl Necklace";
	jewel2.material="Silver";
	jewel2.weight=25.0;
	jewel2.price=18000.00;
	jewel2.isCertified=false;*/
	System.out.println("Jewellery Id is: "+jewel2.jewelleryId);
	System.out.println("Jewellery name is: "+jewel2.name);
	System.out.println("Jewellery material is :"+jewel2.material);
	System.out.println("Jewellery weight is: "+jewel2.weight);
	System.out.println("Jewellery price is: "+jewel2.price);
	System.out.println("Jewellery is certified?: "+jewel2.isCertified+"\n");

	Jwellery jewel3=new Jwellery(3);
	
	/*jewel3.jewelleryId=3;
	jewel3.name="Emerald Bracelet";
	jewel3.material="Platinum";
	jewel3.weight=15.5;
	jewel3.price=27000.00;
	jewel3.isCertified=true;*/
	System.out.println("Jewellery Id is: "+jewel3.jewelleryId+"\n");

	Jwellery jewel4=new Jwellery(4,"Sapphire Earrings");
	
	/*jewel4.jewelleryId=4;
	jewel4.name="Sapphire Earrings";
	jewel4.material="Gold";
	jewel4.weight=8.3;
	jewel4.price=12000.00;
	jewel4.isCertified=true;*/
	System.out.println("Jewellery Id is: "+jewel4.jewelleryId);
	System.out.println("Jewellery name is: "+jewel4.name+"\n");

	Jwellery jewel5=new Jwellery(5,"Ruby Pendant","Silver",6.1,9500.00,false);
	
	/*jewel5.jewelleryId=5;
	jewel5.name="Ruby Pendant";
	jewel5.material="Silver";
	jewel5.weight=6.1;
	jewel5.price=9500.00;
	jewel5.isCertified=false;*/
	System.out.println("Jewellery Id is: "+jewel5.jewelleryId);
	System.out.println("Jewellery name is: "+jewel5.name);
	System.out.println("Jewellery material is :"+jewel5.material+"\n");



	
	System.out.println("\nmain ended");
	}
}