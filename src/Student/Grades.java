package Student;

public enum Grades {
	O,A,B,C,D,E,F;
	public boolean isValid(char g) {
		try {
			for(Grades grade:Grades.values()) {
				if(grade.name().charAt(0)==g) {
					return true;
				}
			}
			return false;
		}
		catch(Exception e) {
			return false;
		}
	}
}
