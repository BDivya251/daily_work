package Oct30;
import java.util.*;
import java.util.concurrent.*;
class Student implements Comparable<Student>{
	int id;
	String name;
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public int compareTo(Student s1) {
//		Student s11=(Student)s1;
//		Student s22=(Student)s2;
//		return s11.id-s22.id;
		if(this.id>s1.id) {
			return 1;
		}
		else {
			return -1;
		}
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
	
//	this refers to the current object in the set
	@Override
	public boolean equals(Object o) {
		Student s=(Student)o;
		if(this.id==s.getId() && this.name.equalsIgnoreCase(s.getName())) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Student{id=" + id + ", name='" + name + "'}";
	}
}
class func{
	public void func1() throws InterruptedException {
		
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;;i++) {
			set.add(i);
			Thread.sleep(500);
		}
		
		
	}
}
//implements Comparator override compare
public class pract1 {
	public static void main(String[] args) throws InterruptedException {
//		HashMap<Integer,Student> st = new HashMap<>();
		Map<Integer,Student> st = new TreeMap<>((a,b)->b-a);
		st.put(1,new Student(2,"Divya"));
		st.put(2,new Student(1,"bhavya"));
		st.put(0, new Student(3,"kavya"));
		st.put(0, new Student(3,"kavya"));
//		for(st.Entry<Integer,Student> e:st.entrySet()) {
//			System.out.println(e.get)
//		}
		Set<Integer> st1 = st.keySet();
		Iterator<Integer> it = st1.iterator();
		while(it.hasNext()) {
			int a=it.next();
			System.out.println(st.get(a));
		}
		
		HashSet<Student> set = new HashSet<>();
		set.add(new Student(1,"Divya"));
		set.add(new Student(3,"Bhavya"));
		set.add(new Student(2,"seetha"));
		set.add(new Student(2,"seetha"));
		Iterator<Student> itr = set.iterator();
		while(itr.hasNext()) {
			Student s= itr.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s);
		}
//		func f = new func();
//		f.func1();
//		HashMap<Integer,Integer> map = new HashMap<>();
		
//		ArrayList<String> name=new ArrayList<>();
//		name.add("james");
//		name.add("hello");
//		name.add("app");
//		name.add("Di");
//		Collections.sort(name);
//		for(int i=0;i<name.size();i++) {
//			System.out.println(name.get(i));
//		}
//		TreeSet<Student> stu  = new TreeSet<>();
//		stu.add(new Student(1,"Divya"));
//		stu.add(new Student(3,"Bhavya"));
//		stu.add(new Student(2,"seetha"));
//		Iterator<Student> itr = stu.iterator();
//		while(itr.hasNext()) {
//			Student s= itr.next();
//			System.out.println(s.id);
//		BlockingQueue<String> s = new ArrayBlockingQueue<>(3);
//		s.add("AB");
//		s.add("c");
//		s.add("de");
//		s.add("Hello");
//		s.add("wipro");
//		System.out.println(s.poll());
//		System.out.println(s.poll());
//		System.out.println(s.poll());
//		System.out.println(s.poll());
//		}
		
//		LinkedBlockingQueue<String> l = new LinkedBlockingQueue<>(3);
		
		
	}
	
}
