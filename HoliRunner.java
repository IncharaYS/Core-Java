class HoliRunner{
	public static void main(String[] holi){
	System.out.println("\nmain started\n");
	
	Holi holi1=new Holi();
	holi1.getInfo();
	
	Holi holi2=new Holi(2);
	holi2.getInfo();
	
	Holi holi3=new Holi(true,true,true);
	holi3.getInfo();
	
	Holi holi4=new Holi("Banglore");
	holi4.getInfo();
	
	Holi holi5=new Holi(2,2);
	holi5.getInfo();
	
	Holi holi6=new Holi(false,false,false);
	holi6.getInfo();
	
	Holi holi7=new Holi(7,true,2,true,false,"Davangere");
	holi7.getInfo();
	
	
	System.out.println("\nmain ended");
	}
}