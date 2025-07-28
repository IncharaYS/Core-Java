class Marble{
	Marble(int marbelId,String texture,boolean isPolished,boolean isAcidResistant,String color,String hardness){
	this.marbelId=marbelId;
	this.texture=texture;
	this.isPolished=isPolished;
	this.color=color;
	this.hardness=hardness;
	this.isAcidResistant=isAcidResistant;
	}
	int marbelId;
	String texture;
	boolean isPolished;
	String color;
	String hardness;
	boolean isAcidResistant;
	
	public void getInfo(){
	System.out.println("Marbel id is:"+marbelId);
	System.out.println("Marbel texture is:"+texture);
	System.out.println("Marbel color is:"+color);
	System.out.println("Marbel hardness is:"+hardness);
	System.out.println("Marbel  is polisher?:"+isPolished);
	System.out.println("Marbel is acid resistant?:"+isAcidResistant+"\n");
	}
}