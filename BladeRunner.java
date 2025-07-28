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
	
	blade1.getInfo();
	
	Blade blade2=new Blade(2,"Glitte",56.00,"Mach3",40,2);

	/*blade2.bladeId=2;
	blade2.bladeCompany="Glitte";
	blade2.price=56.00;
	blade2.bladeType="Mach3";
	blade2.bladeLength=40;
	blade2.bladeThickness=2;*/

	
	Blade blade3=new Blade(3,"schick",87.00,"Hydro 5",20,1);

	/*blade3.bladeId=3;
	blade3.bladeCompany="schick";
	blade3.price=87.00;
	blade3.bladeType="Hydro 5";
	blade3.bladeLength=20;
	blade3.bladeThickness=1;*/


	Blade blade4=new Blade(4,"Gillette",130.00,"Double edge",23,2);

	/*blade4.bladeId=4;
	blade4.bladeCompany="Gillette";
	blade4.price=130.00;
	blade4.bladeType="Double edge";
	blade4.bladeLength=23;
	blade4.bladeThickness=2;*/


	Blade blade5=new Blade(5,"Derby",70.00,"Double edge",3,1);

	/*blade5.bladeId=5;
	blade5.bladeCompany="Derby";
	blade5.price=70.00;
	blade5.bladeType="Double edge";
	blade5.bladeLength=3;
	blade5.bladeThickness=1;*/


	Blade blade6=new Blade(6,"Feather",130.00,"Double edge",56,0.6);

	/*blade6.bladeId=6;
	blade6.bladeCompany="Feather";
	blade6.price=130.00;
	blade6.bladeType="Double edge";
	blade6.bladeLength=56;
	blade6.bladeThickness=0.6;*/


	Blade blade7=new Blade(7,"Olaf",97.00,"Utility",67,1);

	/*blade7.bladeId=7;
	blade7.bladeCompany="Olaf";
	blade7.price=97.00;
	blade7.bladeType="Utility";
	blade7.bladeLength=67;
	blade7.bladeThickness=1;*/


	Blade blade8=new Blade(8,"Stanly",789.00,"Katana",200,1);

	/*blade8.bladeId=8;
	blade8.bladeCompany="Stanly";
	blade8.price=789.00;
	blade8.bladeType="Katana";
	blade8.bladeLength=200;
	blade8.bladeThickness=1;*/


	Blade blade9=new Blade(9,"Stanly",78.00,"Utility",67,2);

	/*blade9.bladeId=9;
	blade9.bladeCompany="Stanly";
	blade9.price=78.00;
	blade9.bladeType="Utility";
	blade9.bladeLength=67;
	blade9.bladeThickness=2;*/


	Blade blade10=new Blade(10,"Slice",45.00,"Utility",67,0.8);

	/*blade10.bladeId=10;
	blade10.bladeCompany="Slice";
	blade10.price=45.00;
	blade10.bladeType="Utility";
	blade10.bladeLength=67;
	blade10.bladeThickness=0.8;*/


	Blade blade11=new Blade(11,"Slice",89.00,"Utility",67,2);

	/*blade11.bladeId=11;
	blade11.bladeCompany="Slice";
	blade11.price=89.00;
	blade11.bladeType="Utility";
	blade11.bladeLength=67;
	blade11.bladeThickness=2;*/


	Blade blade12=new Blade(12,"Albion",165.00,"Medieval sword",45,1);

	/*blade12.bladeId=12;
	blade12.bladeCompany="Albion";
	blade12.price=165.00;
	blade12.bladeType="Medieval sword";
	blade12.bladeLength=45;
	blade12.bladeThickness=1;*/


	Blade blade13=new Blade(13,"Albion",123.00,"Medieval sword",30,2);

	/*blade13.bladeId=13;
	blade13.bladeCompany="Albion";
	blade13.price=123.00;
	blade13.bladeType="Medieval sword";
	blade13.bladeLength=30;
	blade13.bladeThickness=2;*/


	Blade blade14=new Blade(14,"Leon paul",1200.00,"Fencing foil",450,0.9);

	/*blade14.bladeId=14;
	blade14.bladeCompany="Leon paul";
	blade14.price=1200.00;
	blade14.bladeType="Fencing foil";
	blade14.bladeLength=450;
	blade14.bladeThickness=0.9;*/


	Blade blade15=new Blade(15,"Hanwai",450.00,"Rapier",900,0.9);

	/*blade15.bladeId=15;
	blade15.bladeCompany="Hanwai";
	blade15.price=450.00;
	blade15.bladeType="Rapier";
	blade15.bladeLength=900;
	blade15.bladeThickness=0.9;*/


	Blade blade16=new Blade(16,"hanwai",200.00,"Rapier",1000,2);

	/*blade16.bladeId=16;
	blade16.bladeCompany="hanwai";
	blade16.price=200.00;
	blade16.bladeType="Rapier";
	blade16.bladeLength=1000;
	blade16.bladeThickness=2;*/


	Blade blade17=new Blade(17,"Cold steel",240.00,"Katana",700,0.9);

	/*blade17.bladeId=17;
	blade17.bladeCompany="Cold steel";
	blade17.price=240.00;
	blade17.bladeType="Katana";
	blade17.bladeLength=700;
	blade17.bladeThickness=0.9;*/


	Blade blade18=new Blade(18,"X-Acto",130.00,"No 11 precision type",39,0.5);

	/*blade18.bladeId=18;
	blade18.bladeCompany="X-Acto";
	blade18.price=130.00;
	blade18.bladeType="No 11 precision type";
	blade18.bladeLength=39;
	blade18.bladeThickness=0.5;*/


	Blade blade19=new Blade(19,"Olaf",120.00,"Utility",20,1);

	/*blade19.bladeId=19;
	blade19.bladeCompany="Olaf";
	blade19.price=120.00;
	blade19.bladeType="Utility";
	blade19.bladeLength=20;
	blade19.bladeThickness=1;*/


	Blade blade20=new Blade(20,"Olaf",120.00,"Snap-of",39,2);

	/*blade20.bladeId=20;
	blade20.bladeCompany="Olaf";
	blade20.price=120.00;
	blade20.bladeType="Snap-of";
	blade20.bladeLength=39;
	blade20.bladeThickness=2;*/

	
	blade2.getInfo();
	blade3.getInfo();
	blade4.getInfo();
	blade5.getInfo();
	blade6.getInfo();
	blade7.getInfo();
	blade8.getInfo();
	blade9.getInfo();
	blade10.getInfo();
	blade11.getInfo();
	blade12.getInfo();
	blade13.getInfo();
	blade14.getInfo();
	blade15.getInfo();
	blade16.getInfo();
	blade17.getInfo();
	blade18.getInfo();
	blade19.getInfo();
	blade20.getInfo();

	System.out.println("\nmain ended");
	}
}