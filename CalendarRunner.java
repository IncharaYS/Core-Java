class CalendarRunner{
	public static void main(String[] calander){
	System.out.println("\nmain started\n");

	Invitee invitee1=new Invitee("Inchara");
	Meeting meeting1=new Meeting("Project Discussion",invitee1);
	Calendar calendar1=new Calendar("1/8/25",meeting1);
	calendar1.getCalenderInfo();

	System.out.println("\nmain ended");
	}
}