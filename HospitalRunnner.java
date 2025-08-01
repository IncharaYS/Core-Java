class HospitalRunnner{
	public static void main(String hospital[]){
	System.out.println("\nmain started\n");
	
	Doctor doctor1=new Doctor(1,"Ramesh",43,'M');
	Department department1=new Department(1,"Surgery",doctor1);
	Hospital hospital1=new Hospital(1,"Metro","Mejistic",department1);
	
	hospital1.getHospitalInfo();
	
	System.out.println("\nmain ended");
	}
}