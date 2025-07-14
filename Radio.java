class Radio{
	static boolean isOn=true;
	static String color="Black";
	static double price=236.78d;
	static String brand="Artis";
	static boolean isWireless=true;
	
	public static boolean getStatus(){
		return isOn;
	}
	
	public static String getColor(){
		return color;
	}
	
	public static double getPrice(){
		return price;
	}
	
	public static String getBrand(){
		return brand;
	}
	
	public static boolean getConnection(){
		return isWireless	;
	}
}