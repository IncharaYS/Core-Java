class Color{
    int colorId;
    String colorName;
    String hexCode;
    boolean isPastel;
    String rgb;
    String shade;

    Color(){
	this(1,"Sky Blue","#87CEEB",true,"135,206,235","Cool");
	System.out.println("Default constructor");
    }

    Color(int colorId,String colorName,String hexCode,boolean isPastel,String rgb,String shade){
	this(true,"255,192,203","Soft");
	this.colorId=colorId;
	this.colorName=colorName;
	this.hexCode=hexCode;
	this.isPastel=isPastel;
	this.rgb=rgb;
	this.shade=shade;
	System.out.println("Constructor with all values initialization");
    }

    Color(int colorId){
	this("#FFFFFF");
	this.colorId=colorId;
	System.out.println("Constructor with colorId initialization");
    }

    Color(String hexCode){
	this("Blue",9);
	this.hexCode=hexCode;
	System.out.println("Constructor with hexCode initialization");
    }

    Color(String colorName,int colorId){
	this("255,255,0","#FFFF00");
	this.colorName=colorName;
	this.colorId=colorId;
	System.out.println("Constructor with colorName and hexCode initialization");
    }

    Color(String rgb,String hexCode){
	this(true,"222,165,164","Warm");
	this.rgb=rgb;
	this.hexCode=hexCode;
	System.out.println("Constructor with rgb initialization");
    }

    Color(boolean isPastel,String rgb,String shade){
	this.isPastel=isPastel;
	this.rgb=rgb;
	this.shade=shade;
	System.out.println("Constructor with isPastel, rgb, shade initialization");
    }

    public void getInfo(){
	System.out.println("Color ID is: "+colorId);
	System.out.println("Color Name is: "+colorName);
	System.out.println("Hex Code is: "+hexCode);
	System.out.println("Is Pastel?: "+isPastel);
	System.out.println("RGB value is: "+rgb);
	System.out.println("Shade is: "+shade+"\n");
    }
}
