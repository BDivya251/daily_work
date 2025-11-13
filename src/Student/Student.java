package Student;

public class Student extends Person{
	
	private char grade;
	Student(String id,char grade){
		super(id);
		this.grade=grade;
	}
	public void setGrade(char grade) {
		this.grade=grade;
	}
	public char getGrade() {
		return this.grade;
	}
}
