class GymEquipment{
	GymEquipment(int equipmentId,String type,String material,String name,double price,String brand){
	this.equipmentId=equipmentId;
	this.type=type;
	this.price=price;
	this.material=material;
	this.name=name;
	this.brand=brand;
	}
	GymEquipment(){
		
	}
	GymEquipment(int equipmentId,String type,String material){
	this.equipmentId=equipmentId;
	this.type=type;
	this.price=price;
	}
	GymEquipment(int equipmentId,String type){
	this.equipmentId=equipmentId;
	this.type=type;	
	}
	GymEquipment(int equipmentId){
	this.equipmentId=equipmentId;	
	}
	int equipmentId;
	String type;
	double price;
	String material;
	String name;
	String brand;
	
	public void getInfo(){
	System.out.println("Gym equipment ID is:"+equipmentId);
	System.out.println("Gym equipment name is:"+name);
	System.out.println("Gym equipment type is:"+type);
	System.out.println("Gym equipment brand is:"+brand);
	System.out.println("Gym equipment price is:"+price);
	System.out.println("Gym equipment material is:"+material+"\n");
	}
}