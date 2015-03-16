package MainPackage;

public class Student extends Person {
	private String classStatus;
	
	
		
	
	public Student(String name, String address, String phone_number, String email_address, String classStatus){
		super(name, address, phone_number, email_address);
		this.classStatus = classStatus;
		
				
	}



	public String getClassStatus() {
		return classStatus;
	}

	public void setClassStatus(String classStatus) {
		this.classStatus = classStatus;
	}



	@Override
	public String toString() {
		return "Name: " + getName() + ", Class: " + getClass();
	}

 
	
	
	
	

	
	
	

}
