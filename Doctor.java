class Doctor{
	int doctorId;
	String name;
	int age;
	char gender;
	
	Doctor(){
	}
	Doctor(int doctorId,String name,int age,char gender){
	this.doctorId=doctorId;
	this.name=name;
	this.age=age;
	this.gender=gender;
	}
	public void getDoctorInfo(){
		System.out.println("Doctor Id is: "+doctorId);
		System.out.println("Doctor name is: "+name);
		System.out.println("Doctor age is: "+age);
		System.out.println("Doctor gender is: "+gender);
	}
	
}