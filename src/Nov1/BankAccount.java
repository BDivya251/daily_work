package Nov1;

import java.util.concurrent.locks.ReentrantLock;
class Account{
	double balance=1000;
	private final ReentrantLock lock=new ReentrantLock();
	
	void withdraw(double amount,String user) {
		lock.lock();
		try {
			if(balance>=amount) {
		
			System.out.println(user +" is trying to transfer amount");
			balance-=amount;
			System.out.println(user+" completed processing."+"Updated balance is : "+balance);}
			else {
				System.out.println(user +"is trying to transter amount but no sufficient balance");
				
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			lock.unlock();
		}
	}
}

public class BankAccount {
	
	public static void main(String[] args) throws InterruptedException {
		Account a = new Account();
		Runnable r1 = ()->{
			a.withdraw(500, "User-a");
		};
		Runnable r2 = ()->{
			a.withdraw(450, "User-b");
		};
		Runnable r3 = ()->{
			a.withdraw(150, "User-a");
		};
		Thread t1 = new Thread(r1);
		Thread t3 = new Thread(r3);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
	}
}