class FlowersRunner{
	public static void main(String[] flower){
	System.out.println("\nmain started\n");
	
	Flowers flower1=new Flowers(1,"Red","Rose",25.00,true,true);
	
	
	/*flower1.flowerId=1;
	flower1.color="Red";
	flower1.name="Rose";
	flower1.price=25.00;
	flower1.isFresh=true;
	flower1.hasLongLife=true;*/
	System.out.println("Flower Id is"+flower1.flowerId);
	System.out.println("Flower color is"+flower1.color);
	System.out.println("Flower name is"+flower1.name);
	System.out.println("Flower price is"+flower1.price);
	System.out.println("Flower is Fresh?"+flower1.isFresh);
	System.out.println("Flower has long life?:"+flower1.hasLongLife+"\n");

	Flowers flower2=new Flowers();
	
	/*flower2.flowerId=2;
	flower2.color="White";
	flower2.name="Lily";
	flower2.price=30.50;
	flower2.isFresh=true;
	flower2.hasLongLife=false;*/
	System.out.println("Flower Id is"+flower2.flowerId);
	System.out.println("Flower color is"+flower2.color);
	System.out.println("Flower name is"+flower2.name);
	System.out.println("Flower price is"+flower2.price);
	System.out.println("Flower is Fresh?"+flower2.isFresh);
	System.out.println("Flower has long life?:"+flower2.hasLongLife+"\n");

	Flowers flower3=new Flowers(3,"Yellow","Sunflower",15.00,false);
	
	/*flower3.flowerId=3;
	flower3.color="Yellow";
	flower3.name="Sunflower";
	flower3.price=15.00;
	flower3.isFresh=false;
	flower3.hasLongLife=true;*/
	System.out.println("Flower Id is"+flower3.flowerId);
	System.out.println("Flower color is"+flower3.color);
	System.out.println("Flower name is"+flower3.name);
	System.out.println("Flower price is"+flower3.price);
	System.out.println("Flower is Fresh?"+flower3.isFresh+"\n");

	Flowers flower4=new Flowers(4,"Pink","Tulip",20.00);
	
	
	/*flower4.flowerId=4;
	flower4.color="Pink";
	flower4.name="Tulip";
	flower4.price=20.00;
	flower4.isFresh=true;
	flower4.hasLongLife=true;*/
	System.out.println("Flower Id is"+flower4.flowerId);
	System.out.println("Flower color is"+flower4.color);
	System.out.println("Flower name is"+flower4.name);
	System.out.println("Flower price is"+flower4.price+"\n");


	Flowers flower5=new Flowers(5,"Orange","Marigold");
	
	
	/*flower5.flowerId=5;
	flower5.color="Orange";
	flower5.name="Marigold";
	flower5.price=10.00;
	flower5.isFresh=false;
	flower5.hasLongLife=false;*/
	System.out.println("Flower Id is"+flower5.flowerId);
	System.out.println("Flower color is"+flower5.color);
	System.out.println("Flower name is"+flower5.name+"\n");




	System.out.println("\nmain ended");
	}
}