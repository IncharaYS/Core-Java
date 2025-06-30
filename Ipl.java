class Ipl{
	public static void main(String ipl[]){
		
	String	 teamNames[]={"RCB","CSK","RR","MI","GT","SRH","PKBS","LSG","KKR","DC"};
	//System.out.println("List of IPL teams are: "+teamNames[0]+","+teamNames[1]+","+teamNames[2]+","+teamNames[3] +","+teamNames[4]+","+teamNames[5] +","+teamNames[6]+","+teamNames[7]+","+teamNames[8]+","+teamNames[9]);
	
	System.out.println("List of IPL teams are:");
	for(String teamName:teamNames){
		System.out.println(teamName);
	}
	}
}