class Mobile{
	String brand;
	String model;
	PhoneBook phoneBook;

	Mobile(){
		
	}

	Mobile(String brand,String model,PhoneBook phoneBook){
	this.brand=brand;
	this.model=model;
	this.phoneBook=phoneBook;
	}

	public void getMobileInfo(){
		System.out.println("Mobile brand is: "+brand);
		System.out.println("Model name is: "+model+"\n");
		System.out.println("Phonebook info is:");
		phoneBook.getPhoneBookInfo();
	}
}