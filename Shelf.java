class Shelf{
	int shelfId;
	int noOfBooks;
	Book book;
	
	Shelf(){
		
	}
	Shelf(int shelfId,int noOfBooks,Book book){
	this.shelfId=shelfId;
	this.noOfBooks=noOfBooks;
	this.book=book;	
	}
	
	public void getShelfInfo(){
		System.out.println("Shelf ID is: "+shelfId);
		System.out.println("Shelf no of books is: "+noOfBooks+"\n");
		System.out.println("Shelf books info is: ");
		this.book.getBookInfo();
	}
}