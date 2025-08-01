class Country{
	String name;
	State state;

	Country(){
		
	}

	Country(String name,State state){
	this.name=name;
	this.state=state;
	}

	public void getCountryInfo(){
		System.out.println("Country name is: "+name+"\n");
		System.out.println("State info is: ");
		state.getStateInfo();
	}
}