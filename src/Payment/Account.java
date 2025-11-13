package Payment;

import java.util.*;
import java.io.*;

class Customer implements Comparable<Customer>{
	String accountNo;
	String accountHolderName;
	String transCode;
	String Country;
	int ifscCode;
	int balance;
	
	public Customer(String accountNo,String accountHolderName,String transCode,String Country,int ifscCode,int balance) {
		this.accountNo=accountNo;
		this.accountHolderName=accountHolderName;
		this.transCode=transCode;
		this.Country=Country;
		this.ifscCode=ifscCode;
		this.balance=balance;
	}
	public String getAccountNO() {
		return this.accountNo;
	}
	public int balance() {
		return this.balance;
	}
	public int compare(Object o) {
		Customer c1=(Customer)o;
		return 0;
	}
	public String getHolderName() {
		return this.accountHolderName;
	}
	@Override
	public int compareTo(Customer c1) {
		if(c1.accountHolderName.compareTo(c1.getHolderName())>0) {
			return 1;
		}
		else if(c1.accountHolderName.compareTo(c1.getHolderName())<0) {
			return -1;
		}
		else {
			return 0;
		}
	} 
	@Override
	public int hashCode() {
		return this.ifscCode;
	}
	@Override
	public boolean equals(Object o) {
		Customer c1=(Customer)o;
		if(c1.accountHolderName.equalsIgnoreCase(this.accountHolderName) && c1.accountNo.equalsIgnoreCase(this.accountNo)) {
			return true;
		}
		return false;
	}
}
class CompareByAccountNo implements Comparator<Customer>{
	@Override
	public int compare(Customer c1,Customer c2) {
		if((c1.accountNo.compareTo(c2.accountNo))>0 ) {
			return 1;
		}
		else if((c1.accountNo.compareTo(c2.accountNo))<0) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}
class CompareByBalance implements Comparator<Customer>{
	@Override
	public int compare(Customer c1,Customer c2) {
		if(c1.balance>c2.balance) {
			return 1;
		}
		else if(c1.balance<c2.balance) {
			return -1;
		}
		else {
			return 0;
		}
	}
}

public class Account {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> list = new ArrayList<>();
		String data="";
		File f = new File("data.txt");
		try {
			FileWriter wrt = new FileWriter(f);
			wrt.write("Ajay,India,424243443,HDFC00002131,230000,200000,NEFT,James,India,5455535354,HDFC00002301");
			wrt.close();
			FileReader reader = new FileReader(f);
			int ch;
			while((ch=reader.read())!=-1) {
				char a=(char)ch;
				data+=a;
			}
			String[] ar = data.split(",");
			for(int i=0;i<ar.length;i++) {
				System.out.println(ar[i]);
			}
			int balance=Integer.parseInt(ar[4]);
			int transfer=Integer.parseInt(ar[5]);
			if(balance<transfer) {
				System.out.println("Transfer amount is more");
			}
//			System.out.println(data);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		
//		list.add(new Customer("A101", "Alice", "TXN001", "India", 560001, 75000));
//		list.add(new Customer("A102", "Bob", "TXN002", "USA", 94016, 62000));
//		list.add(new Customer("A103", "Charlie", "TXN003", "UK", 10001, 83000));
//		list.add(new Customer("A104", "Diana", "TXN004", "Canada", 90001, 54000));
//		list.add(new Customer("A105", "Ethan", "TXN005", "Germany", 80331, 91000));
//		list.add(new Customer("A106", "Fiona", "TXN006", "Australia", 2000, 67000));
//		list.add(new Customer("A105", "Ethan", "TXN005", "Germany", 80331, 91000));
//		list.add(new Customer("A106", "Fiona", "TXN006", "Australia", 2000, 67000));

//		Collections.sort(list,new CompareByBalance());
//		Collections.sort(list,new CompareByAccountNo());
//		Comparator<Customer> c1=new CompareByBalance().thenComparing(new CompareByAccountNo());
//		Collections.sort(list,c1);
//		Iterator<Customer> itr = list.iterator();
//		while(itr.hasNext()) {
//			Customer c=itr.next();
//			System.out.println("Account Balance "+c.balance);
//			System.out.println("Account Number "+c.accountNo);
//		}

//		HashSet<Customer> set = new HashSet<>();
//		set.add(new Customer("A101", "Alice", "TXN001", "India", 560001, 75000));
//		set.add(new Customer("A101", "Alice", "TXN001", "India", 560001, 75000));
//		set.add(new Customer("A102", "Bob", "TXN002", "USA", 94016, 62000));
//		set.add(new Customer("A103", "Charlie", "TXN003", "UK", 10001, 83000));
//		set.add(new Customer("A104", "Diana", "TXN004", "Canada", 90001, 54000));
//		set.add(new Customer("A105", "Ethan", "TXN005", "Germany", 80331, 91000));
//		set.add(new Customer("A106", "Fiona", "TXN006", "Australia", 2000, 67000));
//		set.add(new Customer("A105", "Ethan", "TXN005", "Germany", 80331, 91000));
//		set.add(new Customer("A106", "Fiona", "TXN006", "Australia", 2000, 67000));
//		System.out.println("The size of the set is "+set.size());
	}

}
