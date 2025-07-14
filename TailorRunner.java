class TailorRunner{
	public static void main(String tailor[]){
		System.out.println("\nmain started\n");
		
		System.out.println("Location is: "+Tailor.getLocation());
		System.out.println("Gender is: "+Tailor.getGender());
		System.out.println("Rating is: "+Tailor.getRating());
		System.out.println("Has Changing room?: "+Tailor.getHasChangingRoom());
		System.out.println("No of machines is: "+Tailor.getNoOfMachines());
		
		System.out.println("\nmain ended");
	}
}