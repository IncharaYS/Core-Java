class Hospital{
	int hospitalId;
	String name;
	String location;
	Department department;
	
	Hospital(){
		
	}
	Hospital(int hospitalId,String name,String location,Department department){
	this.hospitalId=hospitalId;
	this.name=name;
	this.location=location;
	this.department=department;
	}
	
	public void getHospitalInfo(){
		System.out.println("Hospital Id is:"+hospitalId);
		System.out.println("Hospital name is:"+name);
		System.out.println("Hospital location is:"+location+"\n");
		System.out.println("Hospital department info is:");
		this.department.getDepartmentInfo();
	}
}