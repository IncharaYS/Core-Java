class NetworkRunner{
	public static void main(String[] net){
	System.out.println("\nmain started\n");
	
	Network network1=new Network();
	
	network1.networkId=1;
	network1.ipAddress="178.876.0.1";
	network1.hostName="Inchara";
	network1.bandwidth="56";
	network1.speed=5;
	network1.isConnected=true;
	
	System.out.println("Netword Id is:"+network1.networkId);
	System.out.println("Netword ip Address is:"+network1.ipAddress);
	System.out.println("Netword host name is:"+network1.hostName);
	System.out.println("Netword bandwidth is:"+network1.bandwidth);
	System.out.println("Netword speed is:"+network1.speed);
	System.out.println("Netword  is connected?:"+network1.isConnected+"\n");
	
		Network network2=new Network();
	
	network2.networkId=2;
	network2.ipAddress="192.168.1.1";
	network2.hostName="AlphaNet";
	network2.bandwidth="100";
	network2.speed=10;
	network2.isConnected=false;
	
	System.out.println("Netword Id is:"+network2.networkId);
	System.out.println("Netword ip Address is:"+network2.ipAddress);
	System.out.println("Netword host name is:"+network2.hostName);
	System.out.println("Netword bandwidth is:"+network2.bandwidth);
	System.out.println("Netword speed is:"+network2.speed);
	System.out.println("Netword  is connected?:"+network2.isConnected+"\n");

	Network network3=new Network();
	
	network3.networkId=3;
	network3.ipAddress="10.0.0.5";
	network3.hostName="BetaNode";
	network3.bandwidth="80";
	network3.speed=15;
	network3.isConnected=true;
	
	System.out.println("Netword Id is:"+network3.networkId);
	System.out.println("Netword ip Address is:"+network3.ipAddress);
	System.out.println("Netword host name is:"+network3.hostName);
	System.out.println("Netword bandwidth is:"+network3.bandwidth);
	System.out.println("Netword speed is:"+network3.speed);
	System.out.println("Netword  is connected?:"+network3.isConnected+"\n");

	Network network4=new Network();
	
	network4.networkId=4;
	network4.ipAddress="172.16.0.2";
	network4.hostName="GammaLink";
	network4.bandwidth="120";
	network4.speed=20;
	network4.isConnected=false;
	
	System.out.println("Netword Id is:"+network4.networkId);
	System.out.println("Netword ip Address is:"+network4.ipAddress);
	System.out.println("Netword host name is:"+network4.hostName);
	System.out.println("Netword bandwidth is:"+network4.bandwidth);
	System.out.println("Netword speed is:"+network4.speed);
	System.out.println("Netword  is connected?:"+network4.isConnected+"\n");

	Network network5=new Network();
	
	network5.networkId=5;
	network5.ipAddress="192.0.2.1";
	network5.hostName="DeltaWave";
	network5.bandwidth="95";
	network5.speed=12;
	network5.isConnected=true;
	
	System.out.println("Netword Id is:"+network5.networkId);
	System.out.println("Netword ip Address is:"+network5.ipAddress);
	System.out.println("Netword host name is:"+network5.hostName);
	System.out.println("Netword bandwidth is:"+network5.bandwidth);
	System.out.println("Netword speed is:"+network5.speed);
	System.out.println("Netword  is connected?:"+network5.isConnected+"\n");

	Network network6=new Network();
	
	network6.networkId=6;
	network6.ipAddress="203.0.113.5";
	network6.hostName="EchoLAN";
	network6.bandwidth="150";
	network6.speed=25;
	network6.isConnected=false;
	
	System.out.println("Netword Id is:"+network6.networkId);
	System.out.println("Netword ip Address is:"+network6.ipAddress);
	System.out.println("Netword host name is:"+network6.hostName);
	System.out.println("Netword bandwidth is:"+network6.bandwidth);
	System.out.println("Netword speed is:"+network6.speed);
	System.out.println("Netword  is connected?:"+network6.isConnected+"\n");

	Network network7=new Network();
	
	network7.networkId=7;
	network7.ipAddress="8.8.8.8";
	network7.hostName="GoogleDNS";
	network7.bandwidth="250";
	network7.speed=100;
	network7.isConnected=true;
	
	System.out.println("Netword Id is:"+network7.networkId);
	System.out.println("Netword ip Address is:"+network7.ipAddress);
	System.out.println("Netword host name is:"+network7.hostName);
	System.out.println("Netword bandwidth is:"+network7.bandwidth);
	System.out.println("Netword speed is:"+network7.speed);
	System.out.println("Netword  is connected?:"+network7.isConnected+"\n");

	Network network8=new Network();
	
	network8.networkId=8;
	network8.ipAddress="10.10.10.10";
	network8.hostName="LocalLoop";
	network8.bandwidth="60";
	network8.speed=8;
	network8.isConnected=false;
	
	System.out.println("Netword Id is:"+network8.networkId);
	System.out.println("Netword ip Address is:"+network8.ipAddress);
	System.out.println("Netword host name is:"+network8.hostName);
	System.out.println("Netword bandwidth is:"+network8.bandwidth);
	System.out.println("Netword speed is:"+network8.speed);
	System.out.println("Netword  is connected?:"+network8.isConnected+"\n");

	Network network9=new Network();
	
	network9.networkId=9;
	network9.ipAddress="100.100.100.1";
	network9.hostName="NodeNine";
	network9.bandwidth="200";
	network9.speed=50;
	network9.isConnected=true;
	
	System.out.println("Netword Id is:"+network9.networkId);
	System.out.println("Netword ip Address is:"+network9.ipAddress);
	System.out.println("Netword host name is:"+network9.hostName);
	System.out.println("Netword bandwidth is:"+network9.bandwidth);
	System.out.println("Netword speed is:"+network9.speed);
	System.out.println("Netword  is connected?:"+network9.isConnected+"\n");

	Network network10=new Network();
	
	network10.networkId=10;
	network10.ipAddress="198.51.100.1";
	network10.hostName="TestHost";
	network10.bandwidth="90";
	network10.speed=15;
	network10.isConnected=false;
	
	System.out.println("Netword Id is:"+network10.networkId);
	System.out.println("Netword ip Address is:"+network10.ipAddress);
	System.out.println("Netword host name is:"+network10.hostName);
	System.out.println("Netword bandwidth is:"+network10.bandwidth);
	System.out.println("Netword speed is:"+network10.speed);
	System.out.println("Netword  is connected?:"+network10.isConnected+"\n");

	Network network11=new Network();
	
	network11.networkId=11;
	network11.ipAddress="123.45.67.89";
	network11.hostName="ZetaZone";
	network11.bandwidth="300";
	network11.speed=60;
	network11.isConnected=true;
	
	System.out.println("Netword Id is:"+network11.networkId);
	System.out.println("Netword ip Address is:"+network11.ipAddress);
	System.out.println("Netword host name is:"+network11.hostName);
	System.out.println("Netword bandwidth is:"+network11.bandwidth);
	System.out.println("Netword speed is:"+network11.speed);
	System.out.println("Netword  is connected?:"+network11.isConnected+"\n");

	Network network12=new Network();
	
	network12.networkId=12;
	network12.ipAddress="203.12.34.56";
	network12.hostName="SigmaNet";
	network12.bandwidth="170";
	network12.speed=20;
	network12.isConnected=true;
	
	System.out.println("Netword Id is:"+network12.networkId);
	System.out.println("Netword ip Address is:"+network12.ipAddress);
	System.out.println("Netword host name is:"+network12.hostName);
	System.out.println("Netword bandwidth is:"+network12.bandwidth);
	System.out.println("Netword speed is:"+network12.speed);
	System.out.println("Netword  is connected?:"+network12.isConnected+"\n");

	Network network13=new Network();
	
	network13.networkId=13;
	network13.ipAddress="44.33.22.11";
	network13.hostName="OmegaLAN";
	network13.bandwidth="66";
	network13.speed=7;
	network13.isConnected=false;
	
	System.out.println("Netword Id is:"+network13.networkId);
	System.out.println("Netword ip Address is:"+network13.ipAddress);
	System.out.println("Netword host name is:"+network13.hostName);
	System.out.println("Netword bandwidth is:"+network13.bandwidth);
	System.out.println("Netword speed is:"+network13.speed);
	System.out.println("Netword  is connected?:"+network13.isConnected+"\n");

	Network network14=new Network();
	
	network14.networkId=14;
	network14.ipAddress="255.255.255.0";
	network14.hostName="BroadcastNet";
	network14.bandwidth="512";
	network14.speed=120;
	network14.isConnected=true;
	
	System.out.println("Netword Id is:"+network14.networkId);
	System.out.println("Netword ip Address is:"+network14.ipAddress);
	System.out.println("Netword host name is:"+network14.hostName);
	System.out.println("Netword bandwidth is:"+network14.bandwidth);
	System.out.println("Netword speed is:"+network14.speed);
	System.out.println("Netword  is connected?:"+network14.isConnected+"\n");

	Network network15=new Network();
	
	network15.networkId=15;
	network15.ipAddress="169.254.0.1";
	network15.hostName="AutoConfig";
	network15.bandwidth="10";
	network15.speed=1;
	network15.isConnected=false;
	
	System.out.println("Netword Id is:"+network15.networkId);
	System.out.println("Netword ip Address is:"+network15.ipAddress);
	System.out.println("Netword host name is:"+network15.hostName);
	System.out.println("Netword bandwidth is:"+network15.bandwidth);
	System.out.println("Netword speed is:"+network15.speed);
	System.out.println("Netword  is connected?:"+network15.isConnected+"\n");

	Network network16=new Network();
	
	network16.networkId=16;
	network16.ipAddress="15.0.0.1";
	network16.hostName="Firewall";
	network16.bandwidth="240";
	network16.speed=30;
	network16.isConnected=true;
	
	System.out.println("Netword Id is:"+network16.networkId);
	System.out.println("Netword ip Address is:"+network16.ipAddress);
	System.out.println("Netword host name is:"+network16.hostName);
	System.out.println("Netword bandwidth is:"+network16.bandwidth);
	System.out.println("Netword speed is:"+network16.speed);
	System.out.println("Netword  is connected?:"+network16.isConnected+"\n");

	Network network17=new Network();
	
	network17.networkId=17;
	network17.ipAddress="222.111.0.9";
	network17.hostName="EdgeRouter";
	network17.bandwidth="75";
	network17.speed=10;
	network17.isConnected=false;
	
	System.out.println("Netword Id is:"+network17.networkId);
	System.out.println("Netword ip Address is:"+network17.ipAddress);
	System.out.println("Netword host name is:"+network17.hostName);
	System.out.println("Netword bandwidth is:"+network17.bandwidth);
	System.out.println("Netword speed is:"+network17.speed);
	System.out.println("Netword  is connected?:"+network17.isConnected+"\n");

	Network network18=new Network();
	
	network18.networkId=18;
	network18.ipAddress="192.168.100.100";
	network18.hostName="DevMachine";
	network18.bandwidth="180";
	network18.speed=22;
	network18.isConnected=true;
	
	System.out.println("Netword Id is:"+network18.networkId);
	System.out.println("Netword ip Address is:"+network18.ipAddress);
	System.out.println("Netword host name is:"+network18.hostName);
	System.out.println("Netword bandwidth is:"+network18.bandwidth);
	System.out.println("Netword speed is:"+network18.speed);
	System.out.println("Netword  is connected?:"+network18.isConnected+"\n");

	Network network19=new Network();
	
	network19.networkId=19;
	network19.ipAddress="10.100.50.25";
	network19.hostName="VPNNode";
	network19.bandwidth="300";
	network19.speed=60;
	network19.isConnected=true;
	
	System.out.println("Netword Id is:"+network19.networkId);
	System.out.println("Netword ip Address is:"+network19.ipAddress);
	System.out.println("Netword host name is:"+network19.hostName);
	System.out.println("Netword bandwidth is:"+network19.bandwidth);
	System.out.println("Netword speed is:"+network19.speed);
	System.out.println("Netword  is connected?:"+network19.isConnected+"\n");

	Network network20=new Network();
	
	network20.networkId=20;
	network20.ipAddress="1.2.3.4";
	network20.hostName="XNet";
	network20.bandwidth="400";
	network20.speed=90;
	network20.isConnected=false;
	
	System.out.println("Netword Id is:"+network20.networkId);
	System.out.println("Netword ip Address is:"+network20.ipAddress);
	System.out.println("Netword host name is:"+network20.hostName);
	System.out.println("Netword bandwidth is:"+network20.bandwidth);
	System.out.println("Netword speed is:"+network20.speed);
	System.out.println("Netword  is connected?:"+network20.isConnected+"\n");

	
	System.out.println("\nmain ended");
	}
}