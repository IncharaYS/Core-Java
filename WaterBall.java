class WaterBall{
    int waterBallId;
    String color;
    String shape;
    boolean isBuoyant;
    double diameter;
    double price;

    WaterBall(){
	this(1,"Blue","Round",true,6.5,50.00);
	System.out.println("Default constructor");
    }

    WaterBall(int waterBallId,String color,String shape,boolean isBuoyant,double diameter,double price){
	this(true,5.5,"Oval");
	this.waterBallId=waterBallId;
	this.color=color;
	this.shape=shape;
	this.isBuoyant=isBuoyant;
	this.diameter=diameter;
	this.price=price;
	System.out.println("Constructor with all values initialization");
    }

    WaterBall(int waterBallId){
	this("Yellow");
	this.waterBallId=waterBallId;
	System.out.println("Constructor with waterBallId initialization");
    }

    WaterBall(String color){
	this(false,90.00,"Pinnaple");
	this.color=color;
	System.out.println("Constructor with color initialization");
    }

    WaterBall(int waterBallId,double diameter){
	this("Green");
	this.waterBallId=waterBallId;
	this.diameter=diameter;
	System.out.println("Constructor with waterBallId and diameter initialization");
    }

    WaterBall(boolean isBuoyant,double price,String shape){
	this.isBuoyant=isBuoyant;
	this.price=price;
	this.shape=shape;
	System.out.println("Constructor with isBuoyant, price, shape initialization");
    }

    WaterBall(double price,String shape){
	this(false,3.5,"Square");
	this.price=price;
	this.shape=shape;
	System.out.println("Constructor with price and shape initialization");
    }

    public void getInfo(){
		System.out.println("WaterBall ID is: "+waterBallId);
        System.out.println("Color is: "+color);
        System.out.println("Shape is: "+shape);
        System.out.println("Is Buoyant?: "+isBuoyant);
        System.out.println("Diameter is:: "+diameter+" cm");
        System.out.println("Price is: "+price+"\n");
    }
}
