package Nov6;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class PaymentsOps {
	public static void main(String args[]) {
		Account acct = new Account("2121",877912);
		System.out.println("Account details - "+acct.accountNo()+"balance details "+acct.balance());
		Account acct1 = new Account("212121",8712);
		Account acct2 = new Account("312121112",87112);
		System.out.println("Account details - "+acct1.accountNo()+"balance details "+acct1.balance());
		PaymentsOps pay = new PaymentsOps();
		Beneficiery bf = new Beneficiery("james","2121212");
//		pay.fundtransfer(acct, acct1,1000,bf);
		boolean a=acct1.equals(acct2);
		System.out.println(a);
		System.out.println(acct1);
		System.out.println(acct1.hashCode());
		
		//VAR
		var b=100;
		b+=200;
		System.out.println(b);
		var nameList = new ArrayList<String>();
		var companymap = new HashMap<String,List<String>>();
		nameList.add("ahjhj");
		nameList.add("byghb");
		nameList.add("bwuyrgh");
		nameList.add("quwyuq");
		companymap.put("a", nameList);
		System.out.println(companymap.get("a"));
		var name1=new ArrayList<String>();
		name1.add("Divya");
		
		
		//streams
		nameList.stream().filter(p->p.startsWith("ahj")).forEach(name->System.out.println(name));
		nameList.stream().map(name->name.substring(0, 3)).forEach(name->System.out.println(name));
		List<Account> acctList = List.of(acct,acct1,acct2); //immutable list,unmodified set -Set.of() unmodified map-Map.of()
		acctList.add(null);
//		System.out.println(acctList.size()); //error ImmutableCollections
		List<Account> acctList1 = Arrays.asList(acct,acct1,acct2);
		acctList1.stream().filter(acc->acc.balance()>10000).forEach(acc->System.out.println(acc.accountNo()));
//		.collect(Collectors.toMap(a->a && use comparator method seperatly
//		acctList1.stream().filter(acc->acc.accountNo()!=null).forEach(n->System.out.println(n));
//	.sorted((a1,a2)->a1.accountNumber().compareTo(a2.accountNumber()))
		
		acctList1.stream().filter(acc->acc.accountNo()!=null).sorted(Comparator.comparing(Account::accountNo)).forEach(System.out::println);
		var sortedList=acctList.stream().sorted(Comparator.comparing(Account::accountNo)).collect(Collectors.toList());
		
		//		var sorted1=acctList.stream().sorted()
		Stream<Integer> strmIng  = Stream.of(1,2,3,4123,67);
		strmIng.sorted().forEach(System.out::println);
		var sortedStrem  = acctList1.stream();
		sortedStrem=sortedStrem.filter(p->p.balance()>2000);
		sortedStrem.forEach(System.out::println);
		comp1 comp1= new comp1();
		acctList1.stream().sorted(comp1).forEach(System.out::println);
	}
	public boolean fundtransfer(Account acc,Account acc2,int amount,Beneficiery bf) {
		
		
//		System.out.println(bf.validate("james"));
		if(!bf.equals(acc2,bf)) {
			System.out.println("Beneficiery details and account details are not the same");
			return false;
		}
		else if(acc.balance()>amount) {
			int a=(int) acc.balance();
			int b=(int)acc2.balance();
			acc=new Account(acc.accountNo(),a-amount);
			acc2=new Account(acc2.accountNo(),b+amount);
			System.out.println("Updated account details of sender account details "+acc.accountNo() +" balance "+acc.balance());
			System.out.println("Updated account details of receiver  account details "+acc2.accountNo() +" balance "+acc2.balance());
//			acc.balance()=a-amount;
			System.out.println("Money transfered");
//			Benerficiery bf1 = new Beneficiery(acc2.accountNo(),)
			return  true;
		}
		else {
			System.out.println("Insufficient balance");
		return false;
		}
	}
	
}
class comp1 implements Comparator<Account>{
	

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		Account a1=(Account)o1;
		Account a2=(Account)o2;
		if(a1.accountNo().compareTo(a2.accountNo())>0) {
			return -1;
		}
		else if(a1.accountNo().compareTo(a2.accountNo())<0) {
			return 1;
		}
		else {
			return 0;
		}
//		 if (a1.balance() < a2.balance()) {
//	            return -1; 
//	        } else if (a1.balance() > a2.balance()) {
//	            return 1; 
//	        } else {
//	            return 0;  
//	        }
	}
}
