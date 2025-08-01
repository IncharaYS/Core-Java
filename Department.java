class Department{
	int departmentId;
	String name;
	Doctor doctor;
	
	Department(int departmentId,String name,Doctor doctor){
	this.departmentId=departmentId;
	this.name=name;
	this.doctor=doctor;
	}
	Department(){
		
	}
	public void getDepartmentInfo(){
		System.out.println("Department Id is: "+departmentId);
		System.out.println("Department name is: "+name+"\n");
		System.out.println("Department doctors info is: ");
		this.doctor.getDoctorInfo();
	}
}