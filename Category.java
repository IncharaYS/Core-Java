class Category{
	String name;
	String description;
	Product product;

	Category(){
		
	}

	Category(String name,String description,Product product){
	this.name=name;
	this.description=description;
	this.product=product;
	}

	public void getCategoryInfo(){
		System.out.println("Category name is: "+name);
		System.out.println("Description is: "+description+"\n");
		System.out.println("Product info is: ");
		product.getProductInfo();
	}
}