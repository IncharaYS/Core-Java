class BlazerRunner{
	public static void main(String []blazer){
	System.out.println("\nmain started\n");
	
	Blazer blazer1=new Blazer(1,'S',"Black","Nehru Jacket Blazer","Raymond",2000.00);
	
	/*blazer1.itemId=1;
	blazer1.size='S';
	blazer1.color="Black";
	blazer1.style="Nehru Jacket Blazer";
	blazer1.brandName="Raymond";
	blazer1.price=2000.00;*/
	
	System.out.println("Blazer ID is:"+blazer1.itemId);
	System.out.println("Blazer size is:"+blazer1.size);
	System.out.println("Blazer color is:"+blazer1.color);
	System.out.println("Blazer style is:"+blazer1.style);
	System.out.println("Blazer brand name is:"+blazer1.brandName);
	System.out.println("Blazer price is:"+blazer1.price+"\n");


	Blazer blazer2=new Blazer();

	/*blazer2.itemId=2;
	blazer2.size='L';
	blazer2.color="Blacl";
	blazer2.style="Formal";
	blazer2.brandName="Manyavar";
	blazer2.price=5400.00;*/
	
	System.out.println("Blazer ID is:"+blazer2.itemId);
	System.out.println("Blazer size is:"+blazer2.size);
	System.out.println("Blazer color is:"+blazer2.color);
	System.out.println("Blazer style is:"+blazer2.style);
	System.out.println("Blazer brand name is:"+blazer2.brandName);
	System.out.println("Blazer price is:"+blazer2.price+"\n");


	Blazer blazer3=new Blazer(3);

	/*blazer3.itemId=3;
	blazer3.size='L';
	blazer3.color="Blue";
	blazer3.style="Formal";
	blazer3.brandName="Peter England";
	blazer3.price=4500.00;*/
	
	System.out.println("Blazer ID is:"+blazer3.itemId+"\n");


	Blazer blazer4=new Blazer(4,'M',"Blue","Brocade Blazer","Van Heusen India");

	/*blazer4.itemId=4;
	blazer4.size='M';
	blazer4.color="Blue";
	blazer4.style="Brocade Blazer";
	blazer4.brandName="Van Heusen India";
	blazer4.price=8900.00;*/
	
	System.out.println("Blazer ID is:"+blazer4.itemId);
	System.out.println("Blazer size is:"+blazer4.size);
	System.out.println("Blazer color is:"+blazer4.color);
	System.out.println("Blazer style is:"+blazer4.style);
	System.out.println("Blazer brand name is:"+blazer4.brandName);


	Blazer blazer5=new Blazer(3900.00);

	/*blazer5.itemId=5;
	blazer5.size='S';
	blazer5.color="Green";
	blazer5.style="Brocade Blazer";
	blazer5.brandName="Van Heusen India";
	blazer5.price=3900.00;*/
	
	System.out.println("Blazer price is:"+blazer5.price+"\n");


	System.out.println("\nmain ended");
	}
}