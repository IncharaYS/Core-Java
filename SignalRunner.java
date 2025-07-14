class SignalRunner{
	public static void main(String signal[]){
		System.out.println("\nmain started\n");
		
		System.out.println("Location is: "+Signal.getLocation());
		System.out.println("Current signal color is: "+Signal.getColor());
		System.out.println("Time limit is: "+Signal.getTimeLimit());
		System.out.println("Is it working: "+Signal.getStatus());
		System.out.println("Crossing time is: "+Signal.getCrossingTime());
		
		System.out.println("\nmain ended");
	}
}