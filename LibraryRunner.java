class LibraryRunner{
	public static void main(String library[]){
	System.out.println("\nmain started\n");
	
	Book book1=new Book(1,"To kill a Mocking bird","Harper Lee","Novel",156);
	Shelf shelf1=new Shelf(1,134,book1);
	Library library1=new Library(1,"Shravani","Mariappanpalya",shelf1);
	
	library1.getLibraryInfo();
	
	System.out.println("\nmain ended");
	}
}