class MarbleRunner{
	public static void main(String[] marbel){
	System.out.println("\nmain started\n");
	
	Marble marbel1=new Marble();
	
	marbel1.marbelId=1;
	marbel1.texture="veined";
	marbel1.isPolished=true;
	marbel1.isAcidResistant=true;
	marbel1.color="Green";
	marbel1.hardness="3-4 Mohs";


	Marble marbel2=new Marble();

	marbel2.marbelId=2;
	marbel2.texture="smooth";
	marbel2.isPolished=false;
	marbel2.isAcidResistant=false;
	marbel2.color="White";
	marbel2.hardness="4 Mohs";


	Marble marbel3=new Marble();

	marbel3.marbelId=3;
	marbel3.texture="granular";
	marbel3.isPolished=true;
	marbel3.isAcidResistant=false;
	marbel3.color="Red";
	marbel3.hardness="3 Mohs";


	Marble marbel4=new Marble();

	marbel4.marbelId=4;
	marbel4.texture="dull";
	marbel4.isPolished=false;
	marbel4.isAcidResistant=true;
	marbel4.color="Blue";
	marbel4.hardness="2 Mohs";


	Marble marbel5=new Marble();

	marbel5.marbelId=5;
	marbel5.texture="shiny";
	marbel5.isPolished=true;
	marbel5.isAcidResistant=true;
	marbel5.color="Yellow";
	marbel5.hardness="5 Mohs";



	Marble marbel6=new Marble();

	marbel6.marbelId=6;
	marbel6.texture="striped";
	marbel6.isPolished=false;
	marbel6.isAcidResistant=false;
	marbel6.color="Pink";
	marbel6.hardness="4 Mohs";


	Marble marbel7=new Marble();

	marbel7.marbelId=7;
	marbel7.texture="veined";
	marbel7.isPolished=true;
	marbel7.isAcidResistant=true;
	marbel7.color="Gray";
	marbel7.hardness="3 Mohs";



	Marble marbel8=new Marble();

	marbel8.marbelId=8;
	marbel8.texture="rough";
	marbel8.isPolished=false;
	marbel8.isAcidResistant=true;
	marbel8.color="Black";
	marbel8.hardness="2-3 Mohs";


	Marble marbel9=new Marble();

	marbel9.marbelId=9;
	marbel9.texture="glossy";
	marbel9.isPolished=true;
	marbel9.isAcidResistant=false;
	marbel9.color="Beige";
	marbel9.hardness="4-5 Mohs";


	Marble marbel10=new Marble();

	marbel10.marbelId=10;
	marbel10.texture="crystalline";
	marbel10.isPolished=true;
	marbel10.isAcidResistant=true;
	marbel10.color="Brown";
	marbel10.hardness="3.5 Mohs";

	
	Marble marbel11=new Marble();

	marbel11.marbelId=11;
	marbel11.texture="fine-grained";
	marbel11.isPolished=false;
	marbel11.isAcidResistant=false;
	marbel11.color="Orange";
	marbel11.hardness="2.5 Mohs";


	Marble marbel12=new Marble();

	marbel12.marbelId=12;
	marbel12.texture="coarse";
	marbel12.isPolished=true;
	marbel12.isAcidResistant=true;
	marbel12.color="Ivory";
	marbel12.hardness="4 Mohs";


	Marble marbel13=new Marble();

	marbel13.marbelId=13;
	marbel13.texture="mottled";
	marbel13.isPolished=false;
	marbel13.isAcidResistant=true;
	marbel13.color="Lavender";
	marbel13.hardness="3 Mohs";



	Marble marbel14=new Marble();

	marbel14.marbelId=14;
	marbel14.texture="fibrous";
	marbel14.isPolished=true;
	marbel14.isAcidResistant=false;
	marbel14.color="Turquoise";
	marbel14.hardness="3.2 Mohs";


	Marble marbel15=new Marble();

	marbel15.marbelId=15;
	marbel15.texture="metallic";
	marbel15.isPolished=false;
	marbel15.isAcidResistant=true;
	marbel15.color="Silver";
	marbel15.hardness="3.7 Mohs";



	Marble marbel16=new Marble();

	marbel16.marbelId=16;
	marbel16.texture="banded";
	marbel16.isPolished=true;
	marbel16.isAcidResistant=false;
	marbel16.color="Peach";
	marbel16.hardness="2.8 Mohs";


	Marble marbel17=new Marble();

	marbel17.marbelId=17;
	marbel17.texture="powdery";
	marbel17.isPolished=false;
	marbel17.isAcidResistant=false;
	marbel17.color="Cream";
	marbel17.hardness="3 Mohs";

	Marble marbel18=new Marble();

	marbel18.marbelId=18;
	marbel18.texture="fossilized";
	marbel18.isPolished=true;
	marbel18.isAcidResistant=true;
	marbel18.color="Gold";
	marbel18.hardness="4 Mohs";


	Marble marbel19=new Marble();

	marbel19.marbelId=19;
	marbel19.texture="waxed";
	marbel19.isPolished=false;
	marbel19.isAcidResistant=true;
	marbel19.color="Charcoal";
	marbel19.hardness="3.3 Mohs";


	Marble marbel20=new Marble();

	marbel20.marbelId=20;
	marbel20.texture="silky";
	marbel20.isPolished=true;
	marbel20.isAcidResistant=false;
	marbel20.color="Mint";
	marbel20.hardness="2.9 Mohs";
	
	marbel1.getInfo();
	marbel2.getInfo();
	marbel3.getInfo();
	marbel4.getInfo();
	marbel5.getInfo();
	marbel6.getInfo();
	marbel7.getInfo();
	marbel8.getInfo();
	marbel9.getInfo();
	marbel10.getInfo();
	marbel11.getInfo();
	marbel12.getInfo();
	marbel13.getInfo();
	marbel14.getInfo();
	marbel15.getInfo();
	marbel16.getInfo();
	marbel17.getInfo();
	marbel18.getInfo();
	marbel19.getInfo();
	marbel20.getInfo();


	
	System.out.println("\nmain ended");
	}
}