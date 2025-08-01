class Squad{
	String codeName;
	int members;
	String mission;

	Squad(){
		
	}

	Squad(String codeName,int members,String mission){
	this.codeName=codeName;
	this.members=members;
	this.mission=mission;
	}

	public void getSquadInfo(){
		System.out.println("Squad code is: "+codeName);
		System.out.println("No of members is: "+members);
		System.out.println("Mission is: "+mission);
	}
}