class Defence{
	String name;
	int branches;
	Army army;

	Defence(){
		
	}

	Defence(String name,int branches,Army army){
	this.name=name;
	this.branches=branches;
	this.army=army;
	}

	public void getDefenceInfo(){
		System.out.println("Defence name is: "+name);
		System.out.println("Branch is: "+branches+"\n");
		System.out.println("Army info is:");
		army.getArmyInfo();
	}
}