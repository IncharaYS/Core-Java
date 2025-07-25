class Casino{
	int casinoId;
	String location;
	String name;
	boolean hasLisence;
	String owner;
	boolean isOpen;
	
	public void getInfo(){
	System.out.println("Casino id is: "+casinoId);
	System.out.println("Casino location is: "+location);
	System.out.println("Casino name is: "+name);
	System.out.println("Casino  has lisence: "+hasLisence);
	System.out.println("Casino owner is: "+owner);
	System.out.println("Casino is open?: "+isOpen+"\n");
	}
}