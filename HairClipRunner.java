class HairClipRunner{
	public static void main(String[] clip){
	System.out.println("\nmain started\n");
	
	HairClip clip1=new HairClip(1,"Black","Snap",23.00,"S","Metal");
	
	
	/*clip1.itemId=1;
	clip1.color="Black";
	clip1.type="Snap";
	clip1.price=23.00;
	clip1.size="S";
	clip1.material="Metal";*/
	System.out.println("Clip ID is: "+clip1.itemId);
	System.out.println("Clip color is: "+clip1.color);
	System.out.println("Clip type is: "+clip1.type);
	System.out.println("Clip price is: "+clip1.price);
	System.out.println("Clip size is: "+clip1.size);
	System.out.println("Clip material is: "+clip1.material+"\n");

	HairClip clip2=new HairClip();
	
	
	/*clip2.itemId=2;
	clip2.color="Black";
	clip2.type="Banana";
	clip2.price=56.00;
	clip2.size="M";
	clip2.material="Plastic";*/
	System.out.println("Clip ID is: "+clip2.itemId);
	System.out.println("Clip color is: "+clip2.color);
	System.out.println("Clip type is: "+clip2.type);
	System.out.println("Clip price is: "+clip2.price);
	System.out.println("Clip size is: "+clip2.size);
	System.out.println("Clip material is: "+clip2.material+"\n");

	HairClip clip3=new HairClip(3);
	
	
	/*clip3.itemId=3;
	clip3.color="Blue";
	clip3.type="Alligator";
	clip3.price=67.00;
	clip3.size="S";
	clip3.material="Steel";*/
	System.out.println("Clip ID is: "+clip3.itemId+"\n");

	HairClip clip4=new HairClip(4,"Blue");
	
	
	/*clip4.itemId=4;
	clip4.color="Blue";
	clip4.type="Bobby";
	clip4.price=10.00;
	clip4.size="S";
	clip4.material="Metal";*/
	System.out.println("Clip ID is: "+clip4.itemId);
	System.out.println("Clip color is: "+clip4.color+"\n");


	HairClip clip5=new HairClip(5,"Black","Duckbill");
	
	
	/*clip5.itemId=5;
	clip5.color="Black";
	clip5.type="Duckbill";
	clip5.price=98.00;
	clip5.size="S";
	clip5.material="Plastic";*/
	System.out.println("Clip ID is: "+clip5.itemId);
	System.out.println("Clip color is: "+clip5.color);
	System.out.println("Clip type is: "+clip5.type+"\n");



	
	
	System.out.println("\nmain ended");
	}
}