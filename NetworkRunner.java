class NetworkRunner{
	public static void main(String[] net){
	System.out.println("\nmain started\n");
	
	Network network1 = new Network(1, "178.876.0.1", "Inchara", "56", 5, true);
	
	/*network1.networkId=1;
	network1.ipAddress="178.876.0.1";
	network1.hostName="Inchara";
	network1.bandwidth="56";
	network1.speed=5;
	network1.isConnected=true;*/

	Network network2 = new Network(2, "192.168.1.1", "AlphaNet", "100", 10, false);

	/*network2.networkId=2;
	network2.ipAddress="192.168.1.1";
	network2.hostName="AlphaNet";
	network2.bandwidth="100";
	network2.speed=10;
	network2.isConnected=false;*/

	Network network3 = new Network(3, "10.0.0.5", "BetaNode", "80", 15, true);

	/*network3.networkId=3;
	network3.ipAddress="10.0.0.5";
	network3.hostName="BetaNode";
	network3.bandwidth="80";
	network3.speed=15;
	network3.isConnected=true;*/

	Network network4 = new Network(4, "172.16.0.2", "GammaLink", "120", 20, false);

	/*network4.networkId=4;
	network4.ipAddress="172.16.0.2";
	network4.hostName="GammaLink";
	network4.bandwidth="120";
	network4.speed=20;
	network4.isConnected=false;*/

	Network network5 = new Network(5, "192.0.2.1", "DeltaWave", "95", 12, true);

	/*network5.networkId=5;
	network5.ipAddress="192.0.2.1";
	network5.hostName="DeltaWave";
	network5.bandwidth="95";
	network5.speed=12;
	network5.isConnected=true;*/

	Network network6 = new Network(6, "203.0.113.5", "EchoLAN", "150", 25, false);

	/*network6.networkId=6;
	network6.ipAddress="203.0.113.5";
	network6.hostName="EchoLAN";
	network6.bandwidth="150";
	network6.speed=25;
	network6.isConnected=false;*/

	Network network7 = new Network(7, "8.8.8.8", "GoogleDNS", "250", 100, true);

	/*network7.networkId=7;
	network7.ipAddress="8.8.8.8";
	network7.hostName="GoogleDNS";
	network7.bandwidth="250";
	network7.speed=100;
	network7.isConnected=true;*/

	Network network8 = new Network(8, "10.10.10.10", "LocalLoop", "60", 8, false);

	/*network8.networkId=8;
	network8.ipAddress="10.10.10.10";
	network8.hostName="LocalLoop";
	network8.bandwidth="60";
	network8.speed=8;
	network8.isConnected=false;*/

	Network network9 = new Network(9, "100.100.100.1", "NodeNine", "200", 50, true);

	/*network9.networkId=9;
	network9.ipAddress="100.100.100.1";
	network9.hostName="NodeNine";
	network9.bandwidth="200";
	network9.speed=50;
	network9.isConnected=true;*/

	Network network10 = new Network(10, "198.51.100.1", "TestHost", "90", 15, false);

	/*network10.networkId=10;
	network10.ipAddress="198.51.100.1";
	network10.hostName="TestHost";
	network10.bandwidth="90";
	network10.speed=15;
	network10.isConnected=false;*/

	Network network11 = new Network(11, "123.45.67.89", "ZetaZone", "300", 60, true);

	/*network11.networkId=11;
	network11.ipAddress="123.45.67.89";
	network11.hostName="ZetaZone";
	network11.bandwidth="300";
	network11.speed=60;
	network11.isConnected=true;*/

	Network network12 = new Network(12, "203.12.34.56", "SigmaNet", "170", 20, true);

	/*network12.networkId=12;
	network12.ipAddress="203.12.34.56";
	network12.hostName="SigmaNet";
	network12.bandwidth="170";
	network12.speed=20;
	network12.isConnected=true;*/

	Network network13 = new Network(13, "44.33.22.11", "OmegaLAN", "66", 7, false);

	/*network13.networkId=13;
	network13.ipAddress="44.33.22.11";
	network13.hostName="OmegaLAN";
	network13.bandwidth="66";
	network13.speed=7;
	network13.isConnected=false;*/

	Network network14 = new Network(14, "255.255.255.0", "BroadcastNet", "512", 120, true);

	/*network14.networkId=14;
	network14.ipAddress="255.255.255.0";
	network14.hostName="BroadcastNet";
	network14.bandwidth="512";
	network14.speed=120;
	network14.isConnected=true;*/

	Network network15 = new Network(15, "169.254.0.1", "AutoConfig", "10", 1, false);

	/*network15.networkId=15;
	network15.ipAddress="169.254.0.1";
	network15.hostName="AutoConfig";
	network15.bandwidth="10";
	network15.speed=1;
	network15.isConnected=false;*/

	Network network16 = new Network(16, "15.0.0.1", "Firewall", "240", 30, true);

	/*network16.networkId=16;
	network16.ipAddress="15.0.0.1";
	network16.hostName="Firewall";
	network16.bandwidth="240";
	network16.speed=30;
	network16.isConnected=true;*/

	Network network17 = new Network(17, "222.111.0.9", "EdgeRouter", "75", 10, false);

	/*network17.networkId=17;
	network17.ipAddress="222.111.0.9";
	network17.hostName="EdgeRouter";
	network17.bandwidth="75";
	network17.speed=10;
	network17.isConnected=false;*/

	Network network18 = new Network(18, "192.168.100.100", "DevMachine", "180", 22, true);

	/*network18.networkId=18;
	network18.ipAddress="192.168.100.100";
	network18.hostName="DevMachine";
	network18.bandwidth="180";
	network18.speed=22;
	network18.isConnected=true;*/

	Network network19 = new Network(19, "10.100.50.25", "VPNNode", "300", 60, true);

	/*network19.networkId=19;
	network19.ipAddress="10.100.50.25";
	network19.hostName="VPNNode";
	network19.bandwidth="300";
	network19.speed=60;
	network19.isConnected=true;*/

	Network network20 = new Network(20, "1.2.3.4", "XNet", "400", 90, false);

	/*network20.networkId=20;
	network20.ipAddress="1.2.3.4";
	network20.hostName="XNet";
	network20.bandwidth="400";
	network20.speed=90;
	network20.isConnected=false;*/



	network1.getInfo();
	network2.getInfo();
	network3.getInfo();
	network4.getInfo();
	network5.getInfo();
	network6.getInfo();
	network7.getInfo();
	network8.getInfo();
	network9.getInfo();
	network10.getInfo();
	network11.getInfo();
	network12.getInfo();
	network13.getInfo();
	network14.getInfo();
	network15.getInfo();
	network16.getInfo();
	network17.getInfo();
	network18.getInfo();
	network19.getInfo();
	network20.getInfo();

	
	System.out.println("\nmain ended");
	}
}