class Pichkari{
    int pichkariId;
    String type;
    String color;
    double price;
    double capacity;
    char size;

    Pichkari(){
	this(1,"Water Gun","Red",45.00,1.5,'M');
	System.out.println("Default constructor");
    }

    Pichkari(int pichkariId,String type,String color,double price,double capacity,char size){
	this(2.0,'L',"Blue");
	this.pichkariId=pichkariId;
	this.type=type;
	this.color=color;
	this.price=price;
	this.capacity=capacity;
	this.size=size;
	System.out.println("Constructor with all values initialization");
    }

    Pichkari(int pichkariId){
	this(100.00,"Blue");
	this.pichkariId=pichkariId;
	System.out.println("Constructor with pichkariId initialization");
    }

    Pichkari(String type){
	this(5);
	this.type=type;
	System.out.println("Constructor with type initialization");
    }

    Pichkari(double price,String color){
	this(1.2,'L',"Green");
	this.price=price;
	this.color=color;
	System.out.println("Constructor with price and color initialization");
    }

    Pichkari(char size){
	this(13);
	this.size=size;
	System.out.println("Constructor with size initialization");
    }

    Pichkari(double capacity,char size,String color){
	this.capacity=capacity;
	this.size=size;
	this.color=color;
	System.out.println("Constructor with capacity, size, color initialization");
    }

    public void getInfo(){
        System.out.println("Pichkari ID is: "+pichkariId);
        System.out.println("Type is: "+type);
        System.out.println("Color is: "+color);
        System.out.println("Price is: "+price);
        System.out.println("Capacity is: "+capacity+" l");
        System.out.println("Size is: "+size+"\n");
    }
}
