package Oct31_Thread_exm1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
abstract class thread extends Thread {
	public abstract void run();
}
abstract class thread1 extends Thread{
	public abstract void run();
}
//public class ThreadAndInterfa extends thread {
//	int count=1;
//	
//	public static void main(String[] args) {
//		
//		
//	}
//}
@FunctionalInterface
interface Greet1
{
	void sayHello(String name);
}

//functional Interface - which has exactly one abstract method 
@FunctionalInterface

interface Cal{
	abstract int add(int a,int b);
}
public class ThreadAndInterfa{
public static void main(String[] args) {
	
	
	
	
	Greet1 greet=(name)->{System.out.println("Hello "+name);};
	greet.sayHello("Divya");
	
	Cal c=(a,b)->{return a+b;};
	int f=c.add(5, 9);
	System.out.println(f);
	
    // Create a thread pool with 3 worker threads
//    ExecutorService pool = Executors.newFixedThreadPool(3);
//
//    for (int i = 1; i <= 5; i++) {
//        int orderId = i;
//        pool.submit(() -> {
//            System.out.println("Processing order #" + orderId + " by " + Thread.currentThread().getName());
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Completed order #" + orderId);
//        });
//    }
//
//
//    pool.shutdown();
}}