class WaterBallRunner{
    public static void main(String[] ball){
	System.out.println("\nmain started\n");

	WaterBall ball1=new WaterBall();
	ball1.getInfo();

	WaterBall ball2=new WaterBall(2);
	ball2.getInfo();

	WaterBall ball3=new WaterBall(true,4.5,"Rectangle");
	ball3.getInfo();

	WaterBall ball4=new WaterBall("Red");
	ball4.getInfo();

	WaterBall ball5=new WaterBall(5,8.2);
	ball5.getInfo();

	WaterBall ball6=new WaterBall(5.0,"Triangle");
	ball6.getInfo();

	WaterBall ball7=new WaterBall(7,"Purple","Hexagon",false,9.00,60.00);
	ball7.getInfo();

	System.out.println("\nmain ended");
    }
}
