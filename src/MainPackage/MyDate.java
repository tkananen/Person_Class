package MainPackage;

public class MyDate {
	private int Year;
	private int Month;
	private int Day;
	
	public MyDate(){
		
	}
	
	public MyDate(int Year, int Month, int Day){
		this.Year = Year;
		this.Month = Month;
		this.Day = Day;
	
		}





	@Override
	public String toString() {
		return "Class: " + getClass();
	}





	

	public int getYear() {
		return Year;
	}

	public int getMonth() {
		return Month;
	}

	public int getDay() {
		return Day;
	}

	public void setYear(int year) {
		Year = year;
	}

	public void setMonth(int month) {
		Month = month;
	}

	public void setDay(int day) {
		Day = day;
	}

}
