package MainPackage;

public class Student extends Person  {
	
		
	
	



	public Student(String name, String address, String phone_number, String email_address, int ClassStatus){
		super(name, address, phone_number, email_address);
		this.grade = ClassStatus;
		
				
	}



	@Override
	public String toString() {
		return "Name: " + getName() + ", Class: " + getClass();
	}

 
	
	
	
	

	
	
	

}
