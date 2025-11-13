package Oct31_Thread_exm1;

import java.util.concurrent.Callable;

public class CallableCounter implements Callable<String> {
	
	public String call() throws Exception{
//		what are tasks to be done
		return "True";
	}

}
