class BaloonRunner{
	public static void main(String[] balloon){
	System.out.println("\nmain started\n");
	
	Baloon balloon1=new Baloon();
	balloon1.getInfo();
	
	Baloon balloon2=new Baloon(1);
	balloon2.getInfo();
	
	Baloon balloon3=new Baloon(1,"Round");
	balloon3.getInfo();
	
	Baloon balloon4=new Baloon(40.00);
	balloon4.getInfo();
	
	Baloon balloon5=new Baloon(true,800);
	balloon5.getInfo();
	
	Baloon balloon6=new Baloon("Oxygen",false);
	balloon6.getInfo();
	
	Baloon balloon7=new Baloon(1,"Circular","Air",false,false,5.00);
	balloon7.getInfo();
	
	System.out.println("\nmain ended");
	}
}