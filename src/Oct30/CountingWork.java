package Oct30;

public class CountingWork extends Thread {
	ProcessCounter obj;
	CountingWork(ProcessCounter obj){
		this.obj = obj;
	}
	@Override
	public void run() {
		for(int i=0;i<50;i++) {
		obj.decrement();
		try {
			Thread.sleep(10);
			System.out.println("Decrementing "+obj.getValue()+" this thread "+this.getName());
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
	
	}
}
