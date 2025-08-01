class Book{
	int bookId;
	String name;
	String author;
	String genre;
	int noOfPages;
	
	Book(){
		
	}
	Book(int bookId,String name,String author,String genre,int noOfPages){
	this.bookId=bookId;
	this.name=name;
	this.author=author;
	this.genre=genre;
	this.noOfPages=noOfPages;	
	}
	
	public void getBookInfo(){
		System.out.println("Book Id is:"+bookId);
		System.out.println("Book name is:"+name);
		System.out.println("Book author is:"+author);
		System.out.println("Book genre is:"+genre);
		System.out.println("Book noOfPages is:"+noOfPages);
	}
}