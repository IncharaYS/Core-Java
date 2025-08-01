class DefenceRunner{
	public static void main(String[] defence){
	System.out.println("\nmain started\n");

	Squad squad1=new Squad("Shadow Hawk",8,"Recon");
	Army army1=new Army("Infantry","Eastern Command",squad1);
	Defence defence1= new Defence("Indian Army",3,army1);
	defence1.getDefenceInfo();

	System.out.println("\nmain ended");
	}
}