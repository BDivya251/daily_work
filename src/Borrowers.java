import java.util.*;
public class Borrowers {
	private String borName;
	private String borId;
	private int bookId;
//	class borrow{
//		String boName;
//		
//		borrow(String boId,String boName){
//			this.boId=boId;
//			this.boName=boName;
//		}
//	}
	HashMap<String,List<Integer>> map = new HashMap<>();
//	public String getBorName() {
//		return borName;
//	}
	public void addBorrow(String borName,String borId,int bookid){
		this.borName=borName;
		this.borId = borId;
		this.bookId=bookid;
		if(!map.containsKey(borId)) {
			map.put(borId,new ArrayList<Integer>());
		}
		map.get(borId).add(bookId);
		
	}
	public void showBorrow(Books book){
		
		Set<String> set = map.keySet();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String id=itr.next();
	System.out.println("Booked Borrowed by roll no :"+id);
		for(Integer it : map.get(id)) {
		System.out.println("Book id : "+it+" book name is "+book.getBook(it));
	}
		}
	}
//	public void setBorName(String borName) {
//		this.borName = borName;
//	}
//	public String getBorId() {
//		return borId;
//	}
//	public void setBorId(String borId) {
//		this.borId = borId;
//	}
//	public int getBookId() {
//		return bookId;
//	}
//	public void setBookId(int bookId) {
//		this.bookId = bookId;
//	}
}
