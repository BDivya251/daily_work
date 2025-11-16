package Oct30;

public class JobProcessing {
	
	public static void main(String[] args)
	{
//		JobThread t1 = new JobThread("Hello");
//		t1.start();	
//		JobThread t2 = new JobThread("2nd");
//		t2.start();
//		System.out.println("Thread details "+ t1.getName());
//		System.out.println("Thread details "+t1.getPriority());
//		System.out.println("Thread details "+t2.getPriority());
		
		Worker obj = new Worker();
		Thread t21 = new Thread(obj);
		t21.start();
	}

}
