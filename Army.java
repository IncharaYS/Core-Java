class Army{
	String type;
	String division;
	Squad squad;

	Army(){
		
	}

	Army(String type,String division,Squad squad){
	this.type=type;
	this.division=division;
	this.squad=squad;
	}

	public void getArmyInfo(){
		System.out.println("Army type is: "+type);
		System.out.println("Division is: "+division+"\n");
		System.out.println("Squad info is: ");
		squad.getSquadInfo();
	}
}