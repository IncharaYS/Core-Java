class MarbleRunner{
	public static void main(String[] marbel){
	System.out.println("\nmain started\n");
	
	Marble marbel1 = new Marble(1, "veined", true, true, "Green", "3-4 Mohs");
	
	/*marbel1.marbelId=1;
	marbel1.texture="veined";
	marbel1.isPolished=true;
	marbel1.isAcidResistant=true;
	marbel1.color="Green";
	marbel1.hardness="3-4 Mohs";*/
	System.out.println("Marbel id is:"+marbel1.marbelId);
	System.out.println("Marbel texture is:"+marbel1.texture);
	System.out.println("Marbel color is:"+marbel1.color);
	System.out.println("Marbel hardness is:"+marbel1.hardness);
	System.out.println("Marbel  is polisher?:"+marbel1.isPolished);
	System.out.println("Marbel is acid resistant?:"+marbel1.isAcidResistant+"\n");

	Marble marbel2 = new Marble();

	/*marbel2.marbelId=2;
	marbel2.texture="smooth";
	marbel2.isPolished=false;
	marbel2.isAcidResistant=false;
	marbel2.color="White";
	marbel2.hardness="4 Mohs";*/
	System.out.println("Marbel id is:"+marbel2.marbelId);
	System.out.println("Marbel texture is:"+marbel2.texture);
	System.out.println("Marbel color is:"+marbel2.color);
	System.out.println("Marbel hardness is:"+marbel2.hardness);
	System.out.println("Marbel  is polisher?:"+marbel2.isPolished);
	System.out.println("Marbel is acid resistant?:"+marbel2.isAcidResistant+"\n");

	Marble marbel3 = new Marble(3);

	/*marbel3.marbelId=3;
	marbel3.texture="granular";
	marbel3.isPolished=true;
	marbel3.isAcidResistant=false;
	marbel3.color="Red";
	marbel3.hardness="3 Mohs";*/
	System.out.println("Marbel id is:"+marbel3.marbelId+"\n");

	Marble marbel4 = new Marble(4, "dull");

	/*marbel4.marbelId=4;
	marbel4.texture="dull";
	marbel4.isPolished=false;
	marbel4.isAcidResistant=true;
	marbel4.color="Blue";
	marbel4.hardness="2 Mohs";*/
	System.out.println("Marbel id is:"+marbel4.marbelId);
	System.out.println("Marbel texture is:"+marbel4.texture+"\n");

	Marble marbel5 = new Marble(5, "shiny", true);

	/*marbel5.marbelId=5;
	marbel5.texture="shiny";
	marbel5.isPolished=true;
	marbel5.isAcidResistant=true;
	marbel5.color="Yellow";
	marbel5.hardness="5 Mohs";*/
	System.out.println("Marbel id is:"+marbel5.marbelId);
	System.out.println("Marbel texture is:"+marbel5.texture);
	System.out.println("Marbel color is:"+marbel5.color+"\n");

	
	System.out.println("\nmain ended");
	}
}