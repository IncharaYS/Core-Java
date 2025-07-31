class EggRunner{
    public static void main(String[] egg){
	System.out.println("\nmain started\n");

	Egg egg1=new Egg();
	egg1.getInfo();

	Egg egg2=new Egg(2);
	egg2.getInfo();

	Egg egg3=new Egg(true,true,'M');
	egg3.getInfo();

	Egg egg4=new Egg("Quail");
	egg4.getInfo();

	Egg egg5=new Egg(10.00,"Duck");
	egg5.getInfo();

	Egg egg6=new Egg('L');
	egg6.getInfo();

	Egg egg7=new Egg(7,"Country",'S',true,false,15.00);
	egg7.getInfo();

    System.out.println("\nmain ended");
    }
}