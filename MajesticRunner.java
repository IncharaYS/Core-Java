class MajesticRunner{
	public static void main(String[] mejestic){
	System.out.println("\nmain started\n");

	Platform platform1=new Platform(12,"North Wing",true);
	BusStand busStand1=new BusStand("KSRTC Stand",30,platform1);
	Majestic majestic1=new Majestic("Majestic Bangalore",busStand1);
	majestic1.getMajesticInfo();

	System.out.println("\nmain ended");
	}
}