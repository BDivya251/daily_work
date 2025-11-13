package Nov13;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class BookProp{
	 public static void main(String[] args) {
//		 WorkerThre work = new WorkerThre();
//		 WorkerThre work1 = new WorkerThre();
////		 work.start();
//		 ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
//		 service.execute(work);
//		 service.execute(work1);
//		 service.execute(work);
//		 service.execute(work);
//		 //since pool is alive to stop the execution
//		 service.shutdown();
		 WorkerThre w1 = new WorkerThre();
		 ExecutorService service = Executors.newFixedThreadPool(3);
		 for(int i=0;i<10;i++)
		 {
		 service.execute(w1);
		 }
	 }
}