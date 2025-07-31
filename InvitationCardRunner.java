class InvitationCardRunner{
	public static void main(String jewels[]){
	System.out.println("\nmain started\n");
	
	InvitationCard card1=new InvitationCard(1,"Sana","Sridhar","21/10/25","10:40","Shimogga");
	
	/*card1.invitationId=1;
	card1.hostName="Sana";
	card1.guestName="Sridhar";
	card1.date="21/10/25";
	card1.time="10:40";
	card1.venue="Shimogga";*/
	System.out.println("Invitation card Id is: "+card1.invitationId);
	System.out.println("Host name is: "+card1.hostName);
	System.out.println("Guest name is: "+card1.guestName);
	System.out.println("Date is: "+card1.date);
	System.out.println("Time is: "+card1.time);
	System.out.println("Venue is: "+card1.venue+"\n");

	InvitationCard card2=new InvitationCard();
	
	/*card2.invitationId=2;
	card2.hostName="Samay";
	card2.guestName="Ranveer";
	card2.date="6/7/25";
	card2.time="5:40";
	card2.venue="Davangere";*/
	System.out.println("Invitation card Id is: "+card2.invitationId);
	System.out.println("Host name is: "+card2.hostName);
	System.out.println("Guest name is: "+card2.guestName);
	System.out.println("Date is: "+card2.date);
	System.out.println("Time is: "+card2.time);
	System.out.println("Venue is: "+card2.venue+"\n");

	InvitationCard card3=new InvitationCard(3);
	
	/*card3.invitationId=3;
	card3.hostName="Sanjana";
	card3.guestName="Sandeer";
	card3.date="3/5/25";
	card3.time="12:30";
	card3.venue="Davangere";*/
	System.out.println("Invitation card Id is: "+card3.invitationId+"\n");

	InvitationCard card4=new InvitationCard(4,"Sunil");
	
	/*card4.invitationId=4;
	card4.hostName="Sunil";
	card4.guestName="Sanni";
	card4.date="5/7/25";
	card4.time="5:00";
	card4.venue="Shimoga";*/
	System.out.println("Invitation card Id is: "+card4.invitationId);
	System.out.println("Host name is: "+card4.hostName+"\n");


	InvitationCard card5=new InvitationCard(5,"Inchara","Rashmi");
	
	/*card5.invitationId=5;
	card5.hostName="Inchara";
	card5.guestName="Rashmi";
	card5.date="24/7/25";
	card5.time="11:00";
	card5.venue="banglore";*/
	System.out.println("Invitation card Id is: "+card5.invitationId);
	System.out.println("Host name is: "+card5.hostName);
	System.out.println("Guest name is: "+card5.guestName+"\n");


	
	
	System.out.println("\nmain ended");
}
}