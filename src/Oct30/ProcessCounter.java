package Oct30;
import java.util.concurrent.atomic.*;
public class ProcessCounter {
//	private int counter;
	private AtomicInteger counter1=new AtomicInteger(0);
	synchronized void increment() {
//		counter++;
		counter1.getAndIncrement();
//		System.out.println("While incrementing"+counter1.get());
	}
	
	synchronized void decrement() {
//		counter--;
		counter1.getAndDecrement();
//		System.out.println("while decrementing"+counter1.get());
	}
	public int getValue() {
		return counter1.get();
	}
}
