class PmoRunner{
	public static void main(String[] pmo){
	System.out.println("\nmain started\n");

	CabinetMinister minister1=new CabinetMinister("Finance","Nirmala Sitharaman",2019);
	PrimeMinister pm1= new PrimeMinister("Narendra Modi",2014,minister1);
	Pmo pmo1= new Pmo("India PMO","New Delhi",pm1);
	pmo1.getPmoInfo();

	System.out.println("\nmain ended");
	}
}