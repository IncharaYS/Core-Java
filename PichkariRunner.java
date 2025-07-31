class PichkariRunner{
    public static void main(String[] pichkari){
	System.out.println("\nmain started\n");

	Pichkari pichkari1=new Pichkari();
	pichkari1.getInfo();

	Pichkari pichkari2=new Pichkari(2);
	pichkari2.getInfo();

	Pichkari pichkari3=new Pichkari(99.0,"Green");
	pichkari3.getInfo();

	Pichkari pichkari4=new Pichkari("Pump Action");
	pichkari4.getInfo();

	Pichkari pichkari5=new Pichkari('L');
	pichkari5.getInfo();

    Pichkari pichkari6=new Pichkari(1.8,'S',"Yellow");
	pichkari6.getInfo();

	Pichkari pichkari7=new Pichkari(7,"Trigger","Pink",120.0,2.5,'M');
	pichkari7.getInfo();

	System.out.println("\nmain ended");
    }
}
