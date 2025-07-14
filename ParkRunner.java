class ParkRunner{
	public static void main(String park[]){
		System.out.println("\nmain started\n");
		
		System.out.println("Park location : "+Park.getLocation());
		System.out.println("Name is: "+Park.getName());
		System.out.println("Area is: "+Park.getArea());
		System.out.println("Has playground?: "+Park.getHasPlayGround());
		System.out.println("Opening time is: "+Park.getOpeningTime());
		
		System.out.println("\nmain ended");
	}
}