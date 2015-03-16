package MainPackage;

public enum ClassStatus {
	
	
	FRESHMAN(2),
	SOPHOMORE(3),
	JUNIOR(4),
	SENIOR(5);
	
	private int grade;
	
	private ClassStatus(int ClassStatus){
		this.grade = ClassStatus;
	}
	public int getClassStatus(){
		return grade;
	}
	
	

}


