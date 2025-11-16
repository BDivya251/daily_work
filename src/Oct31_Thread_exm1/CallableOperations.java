package Oct31_Thread_exm1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableOperations {
	public static void main(String[] args) {
		CallableCounter callobj = new CallableCounter();
		ExecutorService exc=Executors.newSingleThreadExecutor();
//		exc.submit(callobj);
//		callobj.call();
		exc.shutdown();
	}
}
