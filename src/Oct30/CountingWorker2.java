package Oct30;


public class CountingWorker2 extends Thread {
	ProcessCounter obj;
	CountingWorker2(ProcessCounter obj){
		this.obj = obj;
	}
	@Override
	public void run() {
		for(int i=0;i<200;i++) {
		obj.increment();
		try {
			Thread.sleep(20);
			System.out.println("Incrementing "+obj.getValue()+" this thread "+this.getName());
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
	}
}