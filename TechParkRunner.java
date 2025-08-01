class TechParkRunner{
	public static void main(String[] tech){
	System.out.println("\nmain started\n");

	Company company1=new Company("IBM","IT",10200);
	Block block1=new Block("B1","North Wing",company1);
	TechPark techPark1=new TechPark("Silicon Valley",20,block1);
	techPark1.getTechParkInfo();

	System.out.println("\nmain ended");
	}
}