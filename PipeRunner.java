class PipeRunner{
	public static void main(String[] pipe){
	System.out.println("\nmain started\n");
	
	Pipe pipe1=new Pipe();
	
	pipe1.pipeId=1;
	pipe1.width=4.00;
	pipe1.length=7.00;
	pipe1.material="Plastic";
	pipe1.isFireResistance=true;
	pipe1.shape="circle";
	
	
	Pipe pipe2=new Pipe();

	pipe2.pipeId=2;
	pipe2.width=5.25;
	pipe2.length=6.80;
	pipe2.material="Steel";
	pipe2.isFireResistance=false;
	pipe2.shape="square";


	Pipe pipe3=new Pipe();

	pipe3.pipeId=3;
	pipe3.width=3.50;
	pipe3.length=5.00;
	pipe3.material="Copper";
	pipe3.isFireResistance=true;
	pipe3.shape="circle";


	Pipe pipe4=new Pipe();

	pipe4.pipeId=4;
	pipe4.width=4.75;
	pipe4.length=8.50;
	pipe4.material="PVC";
	pipe4.isFireResistance=false;
	pipe4.shape="rectangle";


	Pipe pipe5=new Pipe();

	pipe5.pipeId=5;
	pipe5.width=2.90;
	pipe5.length=6.10;
	pipe5.material="Aluminum";
	pipe5.isFireResistance=true;
	pipe5.shape="oval";



	Pipe pipe6=new Pipe();

	pipe6.pipeId=6;
	pipe6.width=6.00;
	pipe6.length=10.00;
	pipe6.material="Iron";
	pipe6.isFireResistance=true;
	pipe6.shape="triangle";



	Pipe pipe7=new Pipe();

	pipe7.pipeId=7;
	pipe7.width=3.33;
	pipe7.length=7.77;
	pipe7.material="Plastic";
	pipe7.isFireResistance=false;
	pipe7.shape="circle";



	Pipe pipe8=new Pipe();

	pipe8.pipeId=8;
	pipe8.width=4.10;
	pipe8.length=9.90;
	pipe8.material="Brass";
	pipe8.isFireResistance=true;
	pipe8.shape="hexagon";


	Pipe pipe9=new Pipe();

	pipe9.pipeId=9;
	pipe9.width=7.00;
	pipe9.length=5.50;
	pipe9.material="Lead";
	pipe9.isFireResistance=false;
	pipe9.shape="circle";


	Pipe pipe10=new Pipe();

	pipe10.pipeId=10;
	pipe10.width=8.25;
	pipe10.length=6.75;
	pipe10.material="Glass";
	pipe10.isFireResistance=true;
	pipe10.shape="square";



	Pipe pipe11=new Pipe();

	pipe11.pipeId=11;
	pipe11.width=2.22;
	pipe11.length=4.44;
	pipe11.material="Plastic";
	pipe11.isFireResistance=true;
	pipe11.shape="circle";


	Pipe pipe12=new Pipe();

	pipe12.pipeId=12;
	pipe12.width=1.50;
	pipe12.length=3.75;
	pipe12.material="CarbonFiber";
	pipe12.isFireResistance=false;
	pipe12.shape="ellipse";


	Pipe pipe13=new Pipe();

	pipe13.pipeId=13;
	pipe13.width=6.60;
	pipe13.length=9.99;
	pipe13.material="Fiberglass";
	pipe13.isFireResistance=true;
	pipe13.shape="rectangle";


	Pipe pipe14=new Pipe();

	pipe14.pipeId=14;
	pipe14.width=9.90;
	pipe14.length=12.34;
	pipe14.material="Steel";
	pipe14.isFireResistance=true;
	pipe14.shape="circle";


	Pipe pipe15=new Pipe();

	pipe15.pipeId=15;
	pipe15.width=3.00;
	pipe15.length=3.00;
	pipe15.material="PVC";
	pipe15.isFireResistance=false;
	pipe15.shape="square";


	Pipe pipe16=new Pipe();

	pipe16.pipeId=16;
	pipe16.width=2.75;
	pipe16.length=5.50;
	pipe16.material="Iron";
	pipe16.isFireResistance=true;
	pipe16.shape="octagon";


	Pipe pipe17=new Pipe();

	pipe17.pipeId=17;
	pipe17.width=3.95;
	pipe17.length=6.80;
	pipe17.material="Aluminum";
	pipe17.isFireResistance=true;
	pipe17.shape="triangle";


	Pipe pipe18=new Pipe();

	pipe18.pipeId=18;
	pipe18.width=5.55;
	pipe18.length=10.10;
	pipe18.material="Copper";
	pipe18.isFireResistance=false;
	pipe18.shape="circle";


	Pipe pipe19=new Pipe();

	pipe19.pipeId=19;
	pipe19.width=1.10;
	pipe19.length=2.20;
	pipe19.material="Glass";
	pipe19.isFireResistance=false;
	pipe19.shape="rectangle";


	Pipe pipe20=new Pipe();

	pipe20.pipeId=20;
	pipe20.width=4.44;
	pipe20.length=8.88;
	pipe20.material="Steel";
	pipe20.isFireResistance=true;
	pipe20.shape="hexagon";

	pipe1.getInfo();
	pipe2.getInfo();
	pipe3.getInfo();
	pipe4.getInfo();
	pipe5.getInfo();
	pipe6.getInfo();
	pipe7.getInfo();
	pipe8.getInfo();
	pipe9.getInfo();
	pipe10.getInfo();
	pipe11.getInfo();
	pipe12.getInfo();
	pipe13.getInfo();
	pipe14.getInfo();
	pipe15.getInfo();
	pipe16.getInfo();
	pipe17.getInfo();
	pipe18.getInfo();
	pipe19.getInfo();
	pipe20.getInfo();
	
	
	System.out.println("\nmain ended");

	}
}