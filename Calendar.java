class Calendar{
	String date;
	Meeting meeting;

	Calendar(){
		
	}

	Calendar(String date,Meeting meeting){
	this.date=date;
	this.meeting=meeting;
	}

	public void getCalenderInfo(){
		System.out.println("Calendar Date is: "+date+"\n");
		System.out.println("Meeting info is: ");
		meeting.getMeetingInfo();
	}
}