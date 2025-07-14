class RadioRunner{
	public static void main(String radio[]){
		System.out.println("\nmain started\n");
		
		System.out.println("Is radio on: "+Radio.getStatus());
		System.out.println("Radio color is: "+Radio.getColor());
		System.out.println("Radio brand is: "+Radio.getBrand());
		System.out.println("Is wireless: "+Radio.getConnection());
		System.out.println("Radio price is: "+Radio.getPrice());
		
		System.out.println("\nmain ended");
	}
}