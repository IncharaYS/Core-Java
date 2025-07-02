class Hospital{
	
	/*static String docOne="Nirmala";
	static String docTwo="Gangadhar";
	static String docThree="Sam";
	static String docFour="Suraj";
	static String docFive="Harsha";
	static String docSix="Samruddhi";
	static String docSeven="Sarasvathi";
	static String docEight="Srujan";
	static String docNine="Rashmi";
	static String docTen="Renuka Prasad";
	
	static String[] doctorNames={docOne,docTwo,docThree,docFour,docFive,docSix,
	docSeven,docEight,docNine,docTen};*/

	public static void main(String[] docnames){
	
	System.out.println("\nmain started\n");
	
	String docOne="Nirmala";
	String docTwo="Gangadhar";
	String docThree="Sam";
	String docFour="Suraj";
	String docFive="Harsha";
	String docSix="Samruddhi";
	String docSeven="Sarasvathi";
	String docEight="Srujan";
	String docNine="Rashmi";
	String docTen="Renuka Prasad";
	
	String[] doctorNames={docOne,docTwo,docThree,docFour,docFive,docSix,docSeven,docEight,docNine,docTen};
	
	System.out.println("List of Doctor names are:");
	for(String doctorName:doctorNames){
		System.out.println(doctorName);
	}
	System.out.println("\nmain ended");
	}
}