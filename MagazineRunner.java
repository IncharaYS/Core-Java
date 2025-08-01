class MagazineRunner{
	public static void main(String[] magazine){
	System.out.println("\nmain started\n");
	
	Article article1=new Article(1,"Quantum computing","Stevan Hawking",45000);
	Page page1=new Page(45,"Articles",article1);
	Magazine magazine1=new Magazine(1,"Times Now","7/6/98",page1);
	magazine1.getMagazineInfo();
	
	System.out.println("\nmain ended");
	}
}