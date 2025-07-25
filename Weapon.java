class Weapon{
	int weponId;
	String name;
	String size;
	String type;
	String range;
	double weight;
	
	public void getInfo(){
	System.out.println("Weapon id is: "+weponId);
	System.out.println("Weapon name is: "+name);
	System.out.println("Weapon size is: "+size);
	System.out.println("Weapon type is: "+type);
	System.out.println("Weapon range is: "+range);
	System.out.println("Weapon weight is: "+weight+"\n");
	}
}