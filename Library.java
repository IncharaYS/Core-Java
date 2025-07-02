class Library{
	
	/*static String book1="Twisted love";
	static String book2="It ends with us";
	static String book3="Haunting adaline";
	static String book4="Shatter no";
	static String book5="Rich Dad Poor Dad";
	static String book6="Phycology of money";
	static String book7="To kill a mocking bind";
	static String book8="That's the way we met";
	
	static String[] bookNames={book1,book2,book3,book4,book5,book6,book7,book8};*/

	public static void main(String book[]){
	
	System.out.println("\nmain started\n");
	
	String book1="Twisted love";
	String book2="It ends with us";
	String book3="Haunting adaline";
	String book4="Shatter no";
	String book5="Rich Dad Poor Dad";
	String book6="Phycology of money";
	String book7="To kill a mocking bind";
	String book8="That's the way we met";
	
	String[] bookNames={book1,book2,book3,book4,book5,book6,book7,book8};
	
	System.out.println("List of book names are:");
	for(String bookName:bookNames){
		System.out.println(bookName);
	}
	System.out.println("\nmain ended");
	}
}