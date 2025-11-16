package Nov13;

public class WorkerThre extends Thread{
	@Override
	public void run() {
		System.out.println("In the worker thread"+currentThread().getName());
	}
}
