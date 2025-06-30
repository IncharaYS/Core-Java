class StockMarket{
	public static void main(String names[]){
	
	String stockNames[]={"Reliance","HDFC Bank","TCS","Bharti Airtel","ICICI Bank","SBI","Bajaj","Nestle","Castrol India","Hyundai Motor"};
	//System.out.println("List of stock names are: "+stockNames[0]+","+stockNames[1]+","+stockNames[2]+","+stockNames[3]+","+stockNames[4]+","+stockNames[5]+","+stockNames[6] +","+stockNames[7]+","+stockNames[8]+","+stockNames[9 ]);
	
	System.out.println("List of stock names are:");
	 for(String stockName:stockNames){
		System.out.println(stockName);
	}
	}
}