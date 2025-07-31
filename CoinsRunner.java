class CoinsRunner{
	public static void main(String[] coin){
	System.out.println("\nmain started\n");
	
	Coins coin1=new Coins(1,"Gold",100.0,10.5,25.0,2.0);
	
	/*coin1.coinId=1;
	coin1.type="Gold";
	coin1.price=100.0;
	coin1.weight=10.5;
	coin1.diameter=25.0;
	coin1.thickness=2.0;*/
	
	System.out.println("Coin id is: " + coin1.coinId);
	System.out.println("Coin type is: " + coin1.type);
	System.out.println("Coin price is: " + coin1.price);
	System.out.println("Coin weight is: " + coin1.weight);
	System.out.println("Coin diameter is: " + coin1.diameter);
	System.out.println("Coin thickness is: " + coin1.thickness + "\n");

	Coins coin2=new Coins();
	
	/*coin2.coinId=2;
	coin2.type="Silver";
	coin2.price=50.0;
	coin2.weight=8.0;
	coin2.diameter=22.0;
	coin2.thickness=1.8;*/
	
	System.out.println("Coin id is: " + coin2.coinId);
	System.out.println("Coin type is: " + coin2.type);
	System.out.println("Coin price is: " + coin2.price);
	System.out.println("Coin weight is: " + coin2.weight);
	System.out.println("Coin diameter is: " + coin2.diameter);
	System.out.println("Coin thickness is: " + coin2.thickness + "\n");

	Coins coin3=new Coins(3);
	
	/*coin3.coinId=3;
	coin3.type="Bronze";
	coin3.price=20.0;
	coin3.weight=7.5;
	coin3.diameter=20.0;
	coin3.thickness=1.5;*/
	
	System.out.println("Coin id is: " + coin3.coinId+"\n");

	Coins coin4=new Coins(4,"Platinum",200.0,12.0);
	
	/*coin4.coinId=4;
	coin4.type="Platinum";
	coin4.price=200.0;
	coin4.weight=12.0;
	coin4.diameter=26.5;
	coin4.thickness=2.3;*/
	
	System.out.println("Coin id is: " + coin4.coinId);
	System.out.println("Coin type is: " + coin4.type);
	System.out.println("Coin price is: " + coin4.price);
	System.out.println("Coin weight is: " + coin4.weight+"\n");


	Coins coin5=new Coins(19.0,1.2);
	
	/*coin5.coinId=5;
	coin5.type="Copper";
	coin5.price=10.0;
	coin5.weight=6.2;
	coin5.diameter=19.0;
	coin5.thickness=1.2;*/

	System.out.println("Coin diameter is: " + coin5.diameter);
	System.out.println("Coin thickness is: " + coin5.thickness + "\n");

		
	System.out.println("\nmain ended");	
	}
}