class Product{
	String productName;
	double price;
	String brand;

	Product(){
		
	}

	Product(String productName,double price,String brand){
	this.productName=productName;
	this.price=price;
	this.brand=brand;
	}

	public void getProductInfo(){
		System.out.println("Product name is: "+productName);
		System.out.println("Price is: "+price);
		System.out.println("Brand is: "+brand);
	}
}