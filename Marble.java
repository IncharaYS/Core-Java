class Marble{
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