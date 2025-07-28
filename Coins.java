class Coins{
	
	Coins(int coinId,String type,double price,double weight,double diameter,double thickness){
	this.coinId=coinId;
	this.type=type;
	this.price=price;
	this.weight=weight;
	this.diameter=diameter;
	this.thickness=thickness;
	}
	int coinId;
	String type;
	double price;
	double weight;
	double diameter;
	double thickness;
	
	public void getInfo(){
	System.out.println("Coin id is: " +coinId);
	System.out.println("Coin type is: " +type);
	System.out.println("Coin price is: " +price);
	System.out.println("Coin weight is: " +weight);
	System.out.println("Coin diameter is: " +diameter);
	System.out.println("Coin thickness is: " +thickness + "\n");
	}
}