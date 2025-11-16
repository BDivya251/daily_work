package Student;
import java.util.*;

public class Students {
	public static void main(String[] args) {
		HashMap<String,Student> map = new HashMap<>();
		
		int i=0;
		Scanner scan = new Scanner(System.in);
		
		while(i<=3) {
			System.out.println("Enter one of the option");
			System.out.println("1-Enter the details of the student");
			System.out.println("2-Update the details of Student");
			System.out.println("3-Exit");
			i=scan.nextInt();
			if(i==1) {
				String id;
				char grade;
				System.out.println("Enter the student ID");
				id=scan.next();
				System.out.println("Enter the student Grade");
				grade=scan.next().charAt(0);
				Student s= new Student(id,grade);
				Grades g = Grades.A;
				boolean b=g.isValid(grade);
				if(b==false) {
					System.out.println("Entered wrong Grade");
				}
				else {
				 map.put(id, s);
				}
			}
			else if(i==2) {
				String id;
				char grade;
				System.out.println("Enter the student ID to Update");
				id=scan.next();
				System.out.println("Enter the student Grade to Update");
				grade=scan.next().charAt(0);
				Grades g = Grades.A;
				
				if(!g.isValid(grade)) {
					System.out.println("Entered wrong Grade");
				}
//				s.setGrade(grade);
				else if(!map.containsKey(id) ) {
					System.out.println("Wrong student ID");
				}
				else {
					Student s1=map.get(id);
					s1.setGrade(grade);
					
					System.out.println("Updated Succesfully");
				}
			}
			else if(i==3) {
				for(Student s2:map.values()) {
					System.out.println("Student ID :"+s2.getId()+" Grade : "+s2.getGrade());
				}
				break;
			}
			else {
				System.out.println("Entered wrong option.Please enter the correct option");
			}
			
		}
	}
}
