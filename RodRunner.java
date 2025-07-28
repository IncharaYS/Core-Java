class RodRunner{
	public static void main(String rod[]){
	System.out.println("\nmain started\n");
	
	Rod rod1 = new Rod(1, "Iron", 87, 109, false, 2);
	
	/*rod1.rodId=1;
	rod1.material="Iron";
	rod1.length=87;
	rod1.weight=109;
	rod1.isFlexible=false;
	rod1.diameter=2;*/

	Rod rod2 = new Rod(2, "Steel", 90, 89, false, 1);
	
	/*rod2.rodId=2;
	rod2.material="Steel";
	rod2.length=90;
	rod2.weight=89;
	rod2.isFlexible=false;
	rod2.diameter=1;*/

	Rod rod3 = new Rod(3, "Plastic", 56, 23, false, 3);
	
	/*rod3.rodId=3;
	rod3.material="Plastic";
	rod3.length=56;
	rod3.weight=23;
	rod3.isFlexible=false;
	rod3.diameter=3;*/

	Rod rod4 = new Rod(4, "Rubber", 78, 26, true, 6);
	
	/*rod4.rodId=4;
	rod4.material="Rubber";
	rod4.length=78;
	rod4.weight=26;
	rod4.isFlexible=true;
	rod4.diameter=6;*/

	Rod rod5 = new Rod(5, "Steel", 98, 65, false, 3);
	
	/*rod5.rodId=5;
	rod5.material="Steel";
	rod5.length=98;
	rod5.weight=65;
	rod5.isFlexible=false;
	rod5.diameter=3;*/

	Rod rod6 = new Rod(6, "Alluminium", 80, 34, false, 3);
	
	/*rod6.rodId=6;
	rod6.material="Alluminium";
	rod6.length=80;
	rod6.weight=34;
	rod6.isFlexible=false;
	rod6.diameter=3;*/

	Rod rod7 = new Rod(7, "Stainless steel", 98, 56, false, 2);
	/*rod7.rodId=7;
	rod7.material="Stainless steel";
	rod7.length=98;
	rod7.weight=56;
	rod7.isFlexible=false;
	rod7.diameter=2;*/

	Rod rod8 = new Rod(8, "Plastic", 120, 43, false, 1);
	
	/*rod8.rodId=8;
	rod8.material="Plastic";
	rod8.length=120;
	rod8.weight=43;
	rod8.isFlexible=false;
	rod8.diameter=1;*/

	Rod rod9 = new Rod(9, "Plastic", 650, 134, true, 1);
	
	/*rod9.rodId=9;
	rod9.material="Plastic";
	rod9.length=650;
	rod9.weight=134;
	rod9.isFlexible=true;
	rod9.diameter=1;*/

	Rod rod10 = new Rod(10, "Ceramic", 87, 56, false, 4);
	
	/*rod10.rodId=10;
	rod10.material="Ceramic";
	rod10.length=87;
	rod10.weight=56;
	rod10.isFlexible=false;
	rod10.diameter=4;*/

	Rod rod11 = new Rod(11, "Alluminium", 98, 54, false, 2);
	
	/*rod11.rodId=11;
	rod11.material="Alluminium";
	rod11.length=98;
	rod11.weight=54;
	rod11.isFlexible=false;
	rod11.diameter=2;*/

	Rod rod12 = new Rod(12, "Rubber", 90, 32, true, 7);
	
	/*rod12.rodId=12;
	rod12.material="Rubber";
	rod12.length=90;
	rod12.weight=32;
	rod12.isFlexible=true;
	rod12.diameter=7;*/

	Rod rod13 = new Rod(13, "Rubber", 98, 32, true, 4);
	
	/*rod13.rodId=13;
	rod13.material="Rubber";
	rod13.length=98;
	rod13.weight=32;
	rod13.isFlexible=true;
	rod13.diameter=4;*/

	Rod rod14 = new Rod(14, "Steel", 129, 35, false, 2);
	
	/*rod14.rodId=14;
	rod14.material="Steel";
	rod14.length=129;
	rod14.weight=35;
	rod14.isFlexible=false;
	rod14.diameter=2;*/

	Rod rod15 = new Rod(15, "Alluminium", 345, 92, true, 1);
	
	/*rod15.rodId=15;
	rod15.material="Alluminium";
	rod15.length=345;
	rod15.weight=92;
	rod15.isFlexible=true;
	rod15.diameter=1;*/

	Rod rod16 = new Rod(16, "Copper", 98, 45, false, 3);
	
	/*rod16.rodId=16;
	rod16.material="Copper";
	rod16.length=98;
	rod16.weight=45;
	rod16.isFlexible=false;
	rod16.diameter=3;*/

	Rod rod17 = new Rod(17, "Steel", 87, 23, false, 2);
	
	/*rod17.rodId=17;
	rod17.material="Steel";
	rod17.length=87;
	rod17.weight=23;
	rod17.isFlexible=false;
	rod17.diameter=2;*/

	Rod rod18 = new Rod(18, "Iron", 98, 54, false, 3);
	
	/*rod18.rodId=18;
	rod18.material="Iron";
	rod18.length=98;
	rod18.weight=54;
	rod18.isFlexible=false;
	rod18.diameter=3;*/

	Rod rod19 = new Rod(19, "Stainless steel", 987, 671, false, 2);
	
	/*rod19.rodId=19;
	rod19.material="Stainless steel";
	rod19.length=987;
	rod19.weight=671;
	rod19.isFlexible=false;
	rod19.diameter=2;*/

	Rod rod20 = new Rod(20, "Rubber", 90, 25, true, 7);
	
	/*rod20.rodId=20;
	rod20.material="Rubber";
	rod20.length=90;
	rod20.weight=25;
	rod20.isFlexible=true;
	rod20.diameter=7;*/


	rod1.getInfo();
	rod2.getInfo();
	rod3.getInfo();
	rod4.getInfo();
	rod5.getInfo();
	rod6.getInfo();
	rod7.getInfo();
	rod8.getInfo();
	rod9.getInfo();
	rod10.getInfo();
	rod11.getInfo();
	rod12.getInfo();
	rod13.getInfo();
	rod14.getInfo();
	rod15.getInfo();
	rod17.getInfo();
	rod16.getInfo();
	rod18.getInfo();
	rod19.getInfo();
	rod20.getInfo();
	
	System.out.println("\nmain ended");
}
}