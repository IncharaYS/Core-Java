class MobileRunner{
	public static void main(String[] phone){
	System.out.println("\nmain started\n");

	Contacts contact1=new Contacts("Rashmi","9876543210","rashmi123@gmail.com");
	PhoneBook phoneBook1=new PhoneBook("Inchara",136,contact1);
	Mobile mobile1=new Mobile("Samsung","Galaxy S21",phoneBook1);
	mobile1.getMobileInfo();

	System.out.println("\nmain ended");
	}
}