package MainPackage;

public class Employee extends Person {
	private String office;
	private double salary;
	private String date_hired;
	
	public Employee(String name, String address, String phone_number, String email_address, String office, Double salary, String date_hired){
		super(name, address, phone_number, email_address);
		this.office = office;
		this.salary = salary;
		this.date_hired = date_hired;
	}

	public String getOffice() {
		return office;
	}

	public double getSalary() {
		return salary;
	}

	public String getDate_hired() {
		return date_hired;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setDate_hired(String date_hired) {
		this.date_hired = date_hired;
	}

	@Override
	public String toString() {
		return "Name : " + getName() + ", Class: "
				+ getClass();
	}

	

}
