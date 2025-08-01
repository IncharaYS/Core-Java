class TechPark{
	String location;
	int totalBlocks;
	Block block;

	TechPark(){
		
	}

	TechPark(String location,int totalBlocks,Block block){
	this.location=location;
	this.totalBlocks=totalBlocks;
	this.block=block;
	}

	public void getTechParkInfo(){
		System.out.println("TechPark Location is: "+location);
		System.out.println("Total Blocks is: "+totalBlocks+"\n");
		System.out.println("Block info is: ");
		block.getBlockInfo();
	}
}