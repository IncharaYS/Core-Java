class GymEquipmentRunner{
	public static void main(String[] gymEquip){
	System.out.println("\nmain started\n");
	
	GymEquipment equipment1=new GymEquipment(1,"Threadmill","Cardio","Sole",8000,"Steel");
	
	
	/*equipment1.equipmentId=1;
	equipment1.name="Threadmill";
	equipment1.type="Cardio";
	equipment1.brand="Sole";
	equipment1.price=8000;
	equipment1.material="Steel";*/
	System.out.println("Gym equipment ID is:"+equipment1.equipmentId);
	System.out.println("Gym equipment name is:"+equipment1.name);
	System.out.println("Gym equipment type is:"+equipment1.type);
	System.out.println("Gym equipment brand is:"+equipment1.brand);
	System.out.println("Gym equipment price is:"+equipment1.price);
	System.out.println("Gym equipment material is:"+equipment1.material+"\n");
	

	GymEquipment equipment2=new GymEquipment();
	
	
	/*equipment2.equipmentId=2;
	equipment2.name="Dumbbell";
	equipment2.type="Strength";
	equipment2.brand="Bowflex";
	equipment2.price=2500.00;
	equipment2.material="Iron";*/
	System.out.println("Gym equipment ID is:"+equipment2.equipmentId);
	System.out.println("Gym equipment name is:"+equipment2.name);
	System.out.println("Gym equipment type is:"+equipment2.type);
	System.out.println("Gym equipment brand is:"+equipment2.brand);
	System.out.println("Gym equipment price is:"+equipment2.price);
	System.out.println("Gym equipment material is:"+equipment2.material+"\n");
	

	GymEquipment equipment3=new GymEquipment(3);
	
	
	/*equipment3.equipmentId=3;
	equipment3.name="Exercise Bike";
	equipment3.type="Cardio";
	equipment3.brand="Peloton";
	equipment3.price=9000.00;
	equipment3.material="Steel";*/
	System.out.println("Gym equipment ID is:"+equipment3.equipmentId+"\n");

	

	GymEquipment equipment4=new GymEquipment(4,"Bench Press");
	
	
	/*equipment4.equipmentId=4;
	equipment4.name="Bench Press";
	equipment4.type="Strength";
	equipment4.brand="Decathlon";
	equipment4.price=7000.00;
	equipment4.material="Alloy";*/
	System.out.println("Gym equipment ID is:"+equipment4.equipmentId);
	System.out.println("Gym equipment name is:"+equipment4.name+"\n");
	

	GymEquipment equipment5=new GymEquipment(5,"Rowing Machine","Cardio");
	
	
	/*equipment5.equipmentId=5;
	equipment5.name="Rowing Machine";
	equipment5.type="Cardio";
	equipment5.brand="Concept2";
	equipment5.price=10000.00;
	equipment5.material="Aluminum";*/
	System.out.println("Gym equipment ID is:"+equipment5.equipmentId);
	System.out.println("Gym equipment name is:"+equipment5.name);
	System.out.println("Gym equipment type is:"+equipment5.type+"\n");
	

	
		
	System.out.println("\nmain ended");	
	}
	
}