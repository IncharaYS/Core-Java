class State{
	String name;
	City city;

	State(){
		
	}

	State(String name,City city){
	this.name=name;
	this.city=city;
	}

	public void getStateInfo(){
		System.out.println("State name is: "+name+"\n");
		System.out.println("City info is: ");
		city.getCityInfo();
	}
}