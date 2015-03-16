package MainPackage;

public class Staff extends Employee {
	private String title;
	
	public Staff(String name, String address, String phone_number, String email_address, String office, Double salary, String date_hired, String title){
		super(name, address, phone_number, email_address, office, salary, date_hired);
		this.setTitle(title);
	}

	

	@Override
	public String toString() {
		return "Name:" + getName() + ", Class: " + getClass();
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

}
