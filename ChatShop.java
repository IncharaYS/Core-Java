class ChatShop{
	
	/*static String paniPuri="Pani Puri";
	static String gobiMunchuri="Gobi Munchuri";
	static String gobiDry="Gobi dry";
	static String babycornMunchuri="Baby Munchuri";
	static String paneerDry="Paneer dry";
	static String fries="Fries";
	static String gobiChilli="Gobi Chilli";
	static String sevPuri="Sev Puri";
	static String masalaPuri="Masala Puri";
	static String paneerMunchuri="Paneer Munchuri";
	
	static String[] chat={paniPuri,gobiMunchuri,gobiDry,babycornMunchuri,paneerDry,
	fries,gobiChilli,sevPuri,masalaPuri,paneerMunchuri};*/

	
	public static void main(String []chatnames){

	System.out.println("\nmain started\n");
	
	String paniPuri="Pani Puri";
	String gobiMunchuri="Gobi Munchuri";
	String gobiDry="Gobi dry";
	String babycornMunchuri="Baby Munchuri";
	String paneerDry="Paneer dry";
	String fries="Fries";
	String gobiChilli="Gobi Chilli";
	String sevPuri="Sev Puri";
	String masalaPuri="Masala Puri";
	String paneerMunchuri="Paneer Munchuri";
	
	String[] chat={paniPuri,gobiMunchuri,gobiDry,babycornMunchuri,paneerDry,fries,gobiChilli,sevPuri,masalaPuri,paneerMunchuri};

	System.out.println("List of chats are:");
	for(String chatNames:chat){
		System.out.println(chatNames);
	}
	
	System.out.println("\nmain ended");
	}
}