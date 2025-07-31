class TomatoRunner{
    public static void main(String[] tomato){
	System.out.println("\nmain started\n");

	Tomato tomato1=new Tomato();
	tomato1.getInfo();

	Tomato tomato2=new Tomato(2);
	tomato2.getInfo();

	Tomato tomato3=new Tomato(true,false,4);
	tomato3.getInfo();

	Tomato tomato4=new Tomato("Orange");
	tomato4.getInfo();

	Tomato tomato5=new Tomato(5,30.0);
	tomato5.getInfo();

	Tomato tomato6=new Tomato(15.0,"Black");
	tomato6.getInfo();

	Tomato tomato7=new Tomato(7,"Purple",45.5,true,false,6);
	tomato7.getInfo();

	System.out.println("\nmain ended");
    }
}
