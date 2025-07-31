class NailPolishRunner{
    public static void main(String[] polish){
    System.out.println("\nmain started\n");

    NailPolish polish1=new NailPolish();
	polish1.getInfo();

	NailPolish polish2=new NailPolish(2);
	polish2.getInfo();

	NailPolish polish3=new NailPolish(true,99.99,"Elle18");
	polish3.getInfo();

	NailPolish polish4=new NailPolish("Green");
	polish4.getInfo();

	NailPolish polish5=new NailPolish(5,303);
	polish5.getInfo();

	NailPolish polish6=new NailPolish(5.5,"Faces Canada");
	polish6.getInfo();

	NailPolish polish7=new NailPolish(7,"Black","Colorbar",8,false,249.99);
	polish7.getInfo();

	System.out.println("\nmain ended");
    }
}
