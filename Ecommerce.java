class Ecommerce{
	String siteName;
	String sector;
	Category category;

	Ecommerce(){
		
	}

	Ecommerce(String siteName,String sector,Category category){
	this.siteName=siteName;
	this.sector=sector;
	this.category=category;
	}

	public void getEcommerceInfo(){
		System.out.println("Ecommerce site is: "+siteName);
		System.out.println("Sector is: "+sector+"\n");
		System.out.println("Category info is:");
		category.getCategoryInfo();
	}
}