class BladeRunner{
	public static void main(String[] blade){
	System.out.println("\nmain started\n");
	
	Blade blade1=new Blade(1,"Natraja",20.00,"Utility",60,2);
	
	/*blade1.bladeId=1;
	blade1.bladeCompany="Natraja";
	blade1.price=20.00;
	blade1.bladeType="Utility";
	blade1.bladeLength=60;
	blade1.bladeThickness=2;*/
	//blade1.getInfo();
	
	System.out.println("Blade Id is:"+blade1.bladeId);
	System.out.println("Blade company is:"+blade1.bladeCompany);
	System.out.println("Blade price is:"+blade1.price);
	System.out.println("Blade type is:"+blade1.bladeType);
	System.out.println("Blade length is:"+blade1.bladeLength);
	System.out.println("Blade thickness is:"+blade1.bladeThickness+"\n");
	
	Blade blade2=new Blade();

	/*blade2.bladeId=2;
	blade2.bladeCompany="Glitte";
	blade2.price=56.00;
	blade2.bladeType="Mach3";
	blade2.bladeLength=40;
	blade2.bladeThickness=2;*/
	
	System.out.println("Blade Id is:"+blade2.bladeId);
	System.out.println("Blade company is:"+blade2.bladeCompany);
	System.out.println("Blade price is:"+blade2.price);
	System.out.println("Blade type is:"+blade2.bladeType);
	System.out.println("Blade length is:"+blade2.bladeLength);
	System.out.println("Blade thickness is:"+blade2.bladeThickness+"\n");

	
	Blade blade3=new Blade(3,"schick");

	/*blade3.bladeId=3;
	blade3.bladeCompany="schick";
	blade3.price=87.00;
	blade3.bladeType="Hydro 5";
	blade3.bladeLength=20;
	blade3.bladeThickness=1;*/
	
	System.out.println("Blade Id is:"+blade3.bladeId);
	System.out.println("Blade company is:"+blade3.bladeCompany+"\n");


	Blade blade4=new Blade(4,"Gillette",130.00,"Double Edge");

	/*blade4.bladeId=4;
	blade4.bladeCompany="Gillette";
	blade4.price=130.00;
	blade4.bladeType="Double edge";
	blade4.bladeLength=23;
	blade4.bladeThickness=2;*/
	
	System.out.println("Blade Id is:"+blade4.bladeId);
	System.out.println("Blade company is:"+blade4.bladeCompany);
	System.out.println("Blade price is:"+blade4.price);
	System.out.println("Blade type is:"+blade4.bladeType+"\n");


	Blade blade5=new Blade(3,1);

	/*blade5.bladeId=5;
	blade5.bladeCompany="Derby";
	blade5.price=70.00;
	blade5.bladeType="Double edge";
	blade5.bladeLength=3;
	blade5.bladeThickness=1;*/
	
	System.out.println("Blade length is:"+blade5.bladeLength);
	System.out.println("Blade thickness is:"+blade5.bladeThickness+"\n");


	System.out.println("\nmain ended");
	}
}