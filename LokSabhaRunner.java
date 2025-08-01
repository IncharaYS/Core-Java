class LokSabhaRunner{
	public static void main(String[] lokSabha){
	System.out.println("\nmain started\n");

	Politician politician1=new Politician("Modi","BJP",24);
	Seat seat1=new Seat(42,"General",politician1);
	LokSabha lokSabha1= new LokSabha("UP",80,seat1);
	lokSabha1.getLokSabhaInfo();

	System.out.println("\nmain ended");
	}
}