class EcommerceRunner{
	public static void main(String[] ecommerce){
	System.out.println("\nmain started\n");

	Product product1=new Product("Broom",130.00,"swathi");
	Category category1=new Category("Houseold","Cleaning and Decor",product1);
	Ecommerce ecommerce1=new Ecommerce("Amazon", "Online Retail",category1);
	ecommerce1.getEcommerceInfo();

	System.out.println("\nmain ended");
	}
}