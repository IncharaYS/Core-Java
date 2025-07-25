class InvitationCard{
	int invitationId;
	String hostName;
	String guestName;
	String date;
	String time;
	String venue;
	
	public void getInfo(){
	System.out.println("Invitation card Id is: "+invitationId);
	System.out.println("Host name is: "+hostName);
	System.out.println("Guest name is: "+guestName);
	System.out.println("Date is: "+date);
	System.out.println("Time is: "+time);
	System.out.println("Venue is: "+venue+"\n");
		
	}
}