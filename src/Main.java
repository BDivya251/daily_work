import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		try {
			Borrowers b1=new Borrowers();
		Books book = new Books();
		book.initBook();
		Scanner scan = new Scanner(System.in);
		int i=1;
		
		Members m1=new Members();
		m1.add("Divya","22071A1208",98263627);
		while(i>0 && i<=6) {
			
			System.out.println("Enter the option");
			System.out.println("1-Show the list of books");
			System.out.println("2-Add a member");
			System.out.println("3-Borrow a book if you are member");
			System.out.println("4-show the members of library");
			System.out.println("5-To add the books");
			System.out.println("6-Exit");
		i=scan.nextInt();
			if(i==1) {
				book.showBooks();
			}
			else if(i==2) {
				String name;
				long phono;
				String rollno;
				System.out.println("Enter your name");
				name=scan.next();
				System.out.println("Enter your id");
				rollno=scan.next();
				System.out.println("Enter your phono");
				phono=scan.nextLong();
			    
				
				if(m1.alreadMem(rollno)) {
					System.out.println("Already a member");
				}
				else {
					m1.add(name,rollno,phono);
					System.out.println("Sucessfully added!!");
				}
				
			}
			else if(i==3) {
				System.out.println("Enter the RollNo or ID");
				String rollno=scan.next();
				if(!m1.alreadMem(rollno)) {
					System.out.println("Not a member.You can only borrow if you are a member");
				}
				else {
					book.showBooks();
					System.out.println("Enter the book id");
					int bookid=scan.nextInt();
//					Members m = new Members();
					String name=m1.getName(rollno);
					
					b1.addBorrow(name,rollno,bookid);
					book.setQun(bookid, 1);
					String na=book.getBook(bookid);
					System.out.println("Sucessfullt borrowed one "+na);
				}
				
			}
			else if(i==4) {
				m1.showMem();
			}
			else if(i==5) {
				int bookId;
				String bookName;
				int qun;
				System.out.println("Enter the book Id");
				bookId = scan.nextInt();
				System.out.println("Enter the book Name");
				bookName=scan.next();
				System.out.println("Enter the number of books available");
				qun=scan.nextInt();
				book.add(bookId, bookName, qun);
			}
			else if(i==6) {
				b1.showBorrow(book);
				break;
			}
			else {
				System.out.println("Entered wrong option");
			}
		}}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
