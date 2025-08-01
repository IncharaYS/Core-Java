class Library{
	int libraryId;
	String name;
	String location;
	Shelf shelf;
	
	Library(){
		
	}
	
	Library(int libraryId,String name,String location,Shelf shelf){
	this.libraryId=libraryId;
	this.name=name;
	this.location=location;
	this.shelf=shelf;
	}
	
	public void getLibraryInfo(){
		System.out.println("Library ID is: "+libraryId);
		System.out.println("Library name is: "+name);
		System.out.println("Library location is: "+location+"\n");
		System.out.println("Library Shelf info is: ");
		this.shelf.getShelfInfo();
	}
	
}