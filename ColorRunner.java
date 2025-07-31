class ColorRunner{
    public static void main(String[] color){
    System.out.println("\nmain started\n");

	Color color1=new Color();
	color1.getInfo();

	Color color2=new Color(2);
	color2.getInfo();

	Color color3=new Color(true,"240,128,128","Warm");
	color3.getInfo();

	Color color4=new Color("#FF6347");
	color4.getInfo();

	Color color5=new Color("Lavender","#E6E6FA");
	color5.getInfo();

	Color color6=new Color("0,128,0");
	color6.getInfo();

	Color color7=new Color(7,"Coral","#FF7F50",false,"255,127,80","Vibrant");
    color7.getInfo();

	System.out.println("\nmain ended");
    }
}
