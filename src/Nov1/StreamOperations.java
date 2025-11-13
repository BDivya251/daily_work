package Nov1;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Customer{
	private String name;
	private int amount;
	private String acno;
	private int balance;
	
	public int getBalance()
	{
		return this.balance;
	}
	
}
public class StreamOperations {
	public static void main(String[] agrs) {
		List<String> logs = Arrays.asList("login","fundtransfer","logout");
		Stream<String> str = logs.stream();
//		boolean a=str.anyMatch("login");
//		str.allMatch("login")
		List<String> log1 = new ArrayList<String>();
		log1.add(null);
		boolean status=str.allMatch((str1)->str1.startsWith("l"));
		System.out.println("value of status "+status);
		Stream<String> str1 =logs.stream();
		long count=str1.filter((str2)->str2.startsWith("l")).count();
		System.out.println("value of count is "+count);
		Stream<String> filtername = logs.stream().filter((str2)->str2.startsWith("l"));
		filtername.forEach(System.out::println);
		List<String> filtername1 = logs.stream().filter((str2)->str2.startsWith("l")).collect(Collectors.toList());
		filtername1.forEach(System.out::println);
		
		Stream<Integer> str5 = Stream.of(1,2,3,4,4);
		List<Integer> numsqr=str5.map(x->x*x).collect(Collectors.toList());
		long a = numsqr.stream().filter(i->i>8).count();
		System.out.println("Total number greater than 8 "+a);
		numsqr.forEach(System.out::println);
		Stream<Integer> str6 = Stream.of(1,2,3,4,4);
		int aa=str6.mapToInt(Integer::intValue).sum();
		System.out.println(aa);
		Stream<Double> strDou = Stream.of(101.1,102.2);
		double aa1=strDou.mapToDouble(Double::doubleValue).sum();
		System.out.println(aa1);
		
		
		
	}
	
	
	
	public void streamWithList() {
		
		//ready made comparator ->Comparator.comparingDouble(Customer::getAmountbalance)
//		cusList.steam().filter(cus->cus.getName.equalsIgnoreCase("joy")).collect(Collectos.toList()).count()
//		for array list (List<Customer>))cusList.stream().sorted(comparator(other method)).collect(Collectors.toList());
//	in customer we have :: getName
		
	}
}
