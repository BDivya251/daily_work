import java.util.*;
public class Books {
	class Quantity{
		String name;
		int qun;
		Quantity(String name,int qun){
			this.name=name;
			this.qun=qun;
		}
	}
	HashMap<Integer,Quantity> map = new HashMap<>();
	public void initBook() {
	map.put(101, new Quantity("Atomic Habits",10));
	map.put(102, new Quantity("Concept of Physics",10));
	map.put(103, new Quantity("Java for Everyone",20));
	map.put(104, new Quantity("DSA mad easy in python",30));}
	Books(){
		
	}
	public void add(int id,String name,int qun){
		map.put(id, new Quantity(name,qun));
	}
	public void showBooks() {
		
		Set<Integer> set1 = map.keySet();
		Iterator<Integer> itr = set1.iterator();
		while(itr.hasNext()) {
			int a=itr.next();
			System.out.println("ID: "+a+" : "+map.get(a).name +" - "+map.get(a).qun);
		}
	}
	public String getBook(int id) {
		if(!map.containsKey(id)) {
			return null;
		}
		return map.get(id).name;
	}
	public void setQun(int id,int taken) {
		if(!map.containsKey(id)) {
			System.out.println("Not in the list");
			return;
		}
		int a=map.get(id).qun;
		String n=map.get(id).name;
		if((a-taken)==0) {
			map.remove(id);
		}
		else {
		map.put(id, new Quantity(n,a-taken));
		}
	}

//	public static void main(String[] agrs) {
//		Books book = new Books();
//		book.showBooks();
//	}
}
