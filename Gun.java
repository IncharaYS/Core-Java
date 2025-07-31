class Gun{
    int gunId;
    String name;
    int magazineCapacity;
    String material;
    String manufacturer;
    double price;

    Gun(){
	this(1,"AK-47",30,"Steel","Kalashnikov",50000.00);
	System.out.println("Default constructor");
    }

    Gun(int gunId,String name,int magazineCapacity,String material,String manufacturer,double price){
	this("M416");
	this.gunId=gunId;
	this.name=name;
	this.magazineCapacity=magazineCapacity;
	this.material=material;
	this.manufacturer=manufacturer;
	this.price=price;
	System.out.println("Constructor with all values initialization");
    }

    Gun(int gunId){
	this("Glock");
	this.gunId=gunId;
	System.out.println("Constructor with gunId initialization");
    }

    Gun(String manufacturer){
	this(true,40000.00,"FN Herstal");
	this.manufacturer=manufacturer;
	System.out.println("Constructor with manufacturer initialization");
    }

    Gun(int magazineCapacity,int gunId){
	this(5);
	this.magazineCapacity=magazineCapacity;
	this.gunId=gunId;
	System.out.println("Constructor with magazineCapacity and gunId initialization");
    }

    Gun(boolean isAutomatic,double price,String manufacturer){
	this.price=price;
	this.manufacturer=manufacturer;
	System.out.println("Constructor with isAutomatic, price, manufacturer initialization");
    }

    Gun(String material,String manufacturer){
	this(2);
	this.material=material;
	this.manufacturer=manufacturer;
	System.out.println("Constructor with material, manufacturer initialization");
    }

    public void getInfo(){
        System.out.println("Gun ID: "+gunId);
        System.out.println("Name: "+name);
        System.out.println("Magazine Capacity: "+magazineCapacity);
        System.out.println("Material: "+material);
        System.out.println("Manufacturer: "+manufacturer);
        System.out.println("Price: ₹"+price+"\n");
    }
}
