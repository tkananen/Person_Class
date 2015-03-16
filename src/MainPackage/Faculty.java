package MainPackage;

public class Faculty extends Employee {
	private String office_hours;
	private String Rank;
	
	public Faculty(String name, String address, String phone_number, String email_address, String office, Double salary, String date_hired, String office_hours, String Rank){
		super(name, address, phone_number, email_address, office, salary, date_hired);
		this.office_hours = office_hours;
		this.Rank = Rank;
	}

	public String getOffice_hours() {
		return office_hours;
	}

	public String getRank() {
		return Rank;
	}

	public void setOffice_hours(String office_hours) {
		this.office_hours = office_hours;
	}

	public void setRank(String rank) {
		Rank = rank;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + ", Class: " + getClass();
	}

	
	
	
}
