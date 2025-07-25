class Pipe{
	String material;
	int pipeId;
	double width;
	double length;
	boolean isFireResistance;
	String shape;
	
	public void getInfo(){
	System.out.println("Pipe id is:"+pipeId);
	System.out.println("Pipe width is:"+width);
	System.out.println("Pipe length is:"+length);
	System.out.println("Pipe material is:"+material);
	System.out.println("Pipe is fire resistant?:"+isFireResistance);
	System.out.println("Pipe shapa is:"+shape+"\n");
	}
}