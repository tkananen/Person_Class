package MainPackage;

public enum EClassStatus {
	
	
	FRESHMAN(2),
	SOPHOMORE(3),
	JUNIOR(4),
	SENIOR(5);
	
	private int grade;
	
	private EClassStatus(int grade){
		this.grade = grade;
	}
	public int getEClassStatus(){
		return grade;
	}
	
	

}


