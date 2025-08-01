class PhoneBook{
	String owner;
	int totalContacts;
	Contacts contacts;

	PhoneBook(){
		
	}

	PhoneBook(String owner,int totalContacts,Contacts contacts){
	this.owner=owner;
	this.totalContacts=totalContacts;
	this.contacts=contacts;
	}

	public void getPhoneBookInfo(){
		System.out.println("PhoneBook owner is: "+owner);
		System.out.println("Total contacts is: "+totalContacts+"\n");
		System.out.println("Contact info is: ");
		contacts.getContactsInfo();
	}
}