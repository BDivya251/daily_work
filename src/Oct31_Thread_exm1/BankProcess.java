package Oct31_Thread_exm1;
import java.util.*;
public class BankProcess {
	HashMap<String,Integer> map = new HashMap<>();
	public synchronized void withdraw(String ac,int amount) {
		if(!map.containsKey(ac)) {
			System.out.println("Not a crt account");
			notify();
		}
		
		else {
			int a=map.get(ac);
			if(a<amount) {
				System.out.println("Not sufficient Balance");
				notify();
			}
			map.put(ac, a-amount);
			System.out.println("Debited");
		}
	}
	public synchronized void addAmount(String ac,int amount) {
		if(!map.containsKey(ac)) {
			map.put(ac,amount);
		}
		else {
			int a=map.get(ac);
			map.put(ac, amount+a);
			System.out.println("Inserted");
		}
	}
}
