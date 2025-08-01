class PvrRunner{
	public static void main(String pvr[]){
	System.out.println("\nmain started\n");
	
	Movie movie1=new Movie(1,"Dia","Kannada","21/6/25");
	Screen screen1=new Screen(1,"Gold class","IMAX",movie1);
	Pvr pvr1=new Pvr(1,"Orian mall","Rajajunagar",screen1);
	
	pvr1.getPvrInfo();
	
	System.out.println("\nmain ended");
	}
}