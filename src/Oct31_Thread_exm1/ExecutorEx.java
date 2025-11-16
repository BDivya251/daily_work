package Oct31_Thread_exm1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorEx {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(int i=1;i<=5;i++) {
			int taskId=i;
			service.submit(()->
			System.out.println(Thread.currentThread().getName()+" i"+taskId));
		}
	}
}
