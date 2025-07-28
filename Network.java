class Network{
	Network(int networkId,String ipAddress,String hostName,String bandwidth,double speed,boolean isConnected){
	this.networkId=networkId;
	this.ipAddress=ipAddress;
	this.hostName=hostName;
	this.bandwidth=bandwidth;
	this.speed=speed;
	this.isConnected=isConnected;
	}
	int networkId;
	String ipAddress;
	String hostName;
	String bandwidth;
	double speed;
	boolean isConnected;
	
	public void getInfo(){
			
	System.out.println("Netword Id is:"+networkId);
	System.out.println("Netword ip Address is:"+ipAddress);
	System.out.println("Netword host name is:"+hostName);
	System.out.println("Netword bandwidth is:"+bandwidth);
	System.out.println("Netword speed is:"+speed);
	System.out.println("Netword  is connected?:"+isConnected+"\n");
	}
}