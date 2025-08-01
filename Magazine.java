class Magazine{
	int magazineId;
	String name;
	String publicationDate;
	Page page;
	
	Magazine(){
		
	}
	
	Magazine(int magazineId,String name,String publicationDate,Page page){
	this.magazineId=magazineId;
	this.name=name;
	this.publicationDate=publicationDate;
	this.page=page;	
	}
	public void getMagazineInfo(){
		System.out.println("Magazine Id is: "+magazineId);
		System.out.println("Magazine name is: "+name);
		System.out.println("Magazine publication date is: "+publicationDate+"\n");
		System.out.println("Magazine page info is: ");
		this.page.getPageInfo();
	}
}