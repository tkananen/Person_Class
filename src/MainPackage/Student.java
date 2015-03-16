package MainPackage;

public class Student extends Person  {
	private EClassStatus grade;
	
		
	
	



	public Student(String name, String address, String phone_number, String email_address, EClassStatus grade){
		super(name, address, phone_number, email_address);
		this.grade = grade;
		
				
	}



	@Override
	public String toString() {
		return "Name: " + getName() + ", Class: " + getClass();
	}

 
	
	
	
	

	
	
	

}
