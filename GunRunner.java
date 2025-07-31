class GunRunner{
    public static void main(String[] gun){
	System.out.println("\nmain started\n");

	Gun gun1=new Gun();
	gun1.getInfo();

	Gun gun2=new Gun(1);
	gun2.getInfo();

	Gun gun3=new Gun(true,35000.00,"scarl");
	gun3.getInfo();

	Gun gun4=new Gun("Polymer");
	gun4.getInfo();

	Gun gun5=new Gun(5,303);
	gun5.getInfo();

	Gun gun6=new Gun("Heckler & Koch");
	gun6.getInfo();

	Gun gun7=new Gun(7,"M4 Carbine",25,"Alloy","Colt",60000.00);
	gun7.getInfo();

	System.out.println("\nmain ended");
    }
}
