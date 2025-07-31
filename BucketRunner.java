class BucketRunner{
    public static void main(String[] bucket){
	System.out.println("\nmain started\n");

	Bucket bucket1=new Bucket();
	bucket1.getInfo();

	Bucket bucket2=new Bucket(2);
    bucket2.getInfo();

	Bucket bucket3=new Bucket(true,120.00,"White");
	bucket3.getInfo();

	Bucket bucket4=new Bucket("Black");
	bucket4.getInfo();

	Bucket bucket5=new Bucket(5,15.0);
	bucket5.getInfo();

	Bucket bucket6=new Bucket(89.50,"Grey");
	bucket6.getInfo();

	Bucket bucket7=new Bucket(7,"Orange",12.5,true,179.00,true);
	bucket7.getInfo();

	System.out.println("\nmjain ended");
    }
}
