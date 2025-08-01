class Block{
	String blockId;
	String wing;
	Company company;

	Block(){
		
	}

	Block(String blockId,String wing,Company company){
	this.blockId=blockId;
	this.wing=wing;
	this.company=company;
	}

	public void getBlockInfo(){
		System.out.println("Block ID is: "+blockId);
		System.out.println("Wing is: "+wing+"\n");
		System.out.println("Company info is: ");
		company.getCompanyInfo();
	}
}