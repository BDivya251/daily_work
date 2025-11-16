package Oct30;

public class CounterJobProcess {
	public static void main(String[] args) {
		//CountingWork,COuntingWorker2-inc/dec(ProcessCounter)
		//start executing in CounterJob
		
		ProcessCounter p1 = new ProcessCounter();
		CountingWork w1= new CountingWork(p1);
		CountingWork w3 = new CountingWork(p1);
		CountingWorker2 w2 = new CountingWorker2(p1);
//		Thread t1 = new Thread(w1);
//		t1.start();
//		Thread t2 = new Thread(w2);
//		t2.start();
		w1.start();
//		w3.start();
		w2.start();
		System.out.println(p1.getValue());
	}
}
