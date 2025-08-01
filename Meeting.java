class Meeting{
	String topic;
	Invitee invitee;

	Meeting(){
		
	}

	Meeting(String topic,Invitee invitee){
	this.topic=topic;
	this.invitee=invitee;
	}

	public void getMeetingInfo(){
		System.out.println("Meeting Topic is: "+topic+"\n");
		System.out.println("Invitee info is: ");
		invitee.getInviteeInfo();
	}
}