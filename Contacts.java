class Contacts{
	String name;
	String phoneNumber;
	String email;

	Contacts(){
		
	}

	Contacts(String name,String phoneNumber,String email){
	this.name=name;
	this.phoneNumber=phoneNumber;
	this.email=email;
	}

	public void getContactsInfo(){
		System.out.println("Contact name is: "+name);
		System.out.println("Contact number is: "+phoneNumber);
		System.out.println("Email is: "+email);
	}
}