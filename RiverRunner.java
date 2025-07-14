class RiverRunner{
	public static void main(String dam[]){
		System.out.println("\nmain started\n");
		
		System.out.println("Location is: "+River.getLocation());
		System.out.println("Origin is: "+River.getOrigin());
		System.out.println("State is: "+River.getState());
		System.out.println("Has Drinking water?: "+River.getHasDrinkingWater());
		System.out.println("Has Dam?: "+River.getHasDam());
		
		System.out.println("\nmain ended");
	}
}