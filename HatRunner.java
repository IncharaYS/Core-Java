class HatRunner{
	public static void main(String hat[]){
	System.out.println("\nmain started\n");
	
	Hat hat1=new Hat(1,230.00,"Black","Cowboy","Leather",'M');
	
	/*hat1.itemId=1;
	hat1.price=230.00;
	hat1.color="Black";
	hat1.type="Cowboy";
	hat1.material="Leather";
	hat1.size='M';*/
	System.out.println("Hat Id is:"+hat1.itemId);
	System.out.println("Hat price is:"+hat1.price);
	System.out.println("Hat color is:"+hat1.color);
	System.out.println("Hat type is:"+hat1.type);
	System.out.println("Hat material is:"+hat1.material);
	System.out.println("Hat size is:"+hat1.size+"\n");

	Hat hat2=new Hat();
	
	/*hat2.itemId=2;
	hat2.price=230.00;
	hat2.color="Black";
	hat2.type="Top hat";
	hat2.material="Wool";
	hat2.size='S';*/
	System.out.println("Hat Id is:"+hat2.itemId);
	System.out.println("Hat price is:"+hat2.price);
	System.out.println("Hat color is:"+hat2.color);
	System.out.println("Hat type is:"+hat2.type);
	System.out.println("Hat material is:"+hat2.material);
	System.out.println("Hat size is:"+hat2.size+"\n");

	Hat hat3=new Hat(3);
	
	/*hat3.itemId=3;
	hat3.price=450.00;
	hat3.color="Blue";
	hat3.type="Bowler";
	hat3.material="Silk";
	hat3.size='S';*/
	System.out.println("Hat Id is:"+hat3.itemId+"\n");


	Hat hat4=new Hat(4,340.00);
	
	/*hat4.itemId=4;
	hat4.price=340.00;
	hat4.color="Blue";
	hat4.type="Baseball";
	hat4.material="Cotton";
	hat4.size='L';*/
	System.out.println("Hat Id is:"+hat4.itemId);
	System.out.println("Hat price is:"+hat4.price+"\n");


	Hat hat5=new Hat(5,30.00,"Green");
	
	/*hat5.itemId=5;
	hat5.price=30.00;
	hat5.color="Green";
	hat5.type="Tucker";
	hat5.material="Cotton";
	hat5.size='M';*/
	System.out.println("Hat Id is:"+hat5.itemId);
	System.out.println("Hat price is:"+hat5.price);
	System.out.println("Hat color is:"+hat5.color+"\n");

	
	System.out.println("\nmain ended");
}
}