package Oct30;

public class TestMultiTh {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		System.out.println("Thread Priority "+Thread.currentThread().getPriority());
		System.out.println("Active Threads " +Thread.activeCount());
//		System.out.println(Thread.currentThread().getId()); 
		Thread t1 = new Thread();
		t1.start();
		System.out.println("Active Threads after t1 " +Thread.activeCount());
		Student1 s1 = new Student1("student"); //Thread object
		s1.start();
		Employee e1 = new Employee("employee");
		e1.start();
		Employee2 e2= new Employee2();
		e2.hello();
		Thread t4 = new Thread(e2,"Employee2");
		
		//anonymous objects
		Runnable r1 = new Runnable() {
			public void run() {
				for(int i=0;i<10;i++) {
				System.out.println("Executing from anonymous obj,Executing Thread is "+Thread.currentThread().getName());
			}}
		};
		Thread t5 = new Thread(r1,"Object");
		
		//lambda expressions
		Runnable r2 = ()->{
			for(int i=0;i<10;i++) {
			System.out.println("Executing from anonymous obj,Executing Thread is "+Thread.currentThread().getName());}};
		Thread t6 = new Thread(r2,"object2");
		t4.start();
		t5.start();
//		t5.join();
//		t5.sleep(10000);
		t6.start();
		System.out.println("Total active threads "+Thread.activeCount());
		s1.start();
	}
}

class Student1 extends Thread{
	public Student1(String name) {
		super(name);
	}
	@Override
	public void run() {
		System.out.println("Executing "+Thread.currentThread().getName());
		
	}
	
}
class Employee extends Thread{
	public Employee(String name) {
		super(name);
	}
	@Override
	public void run() {
		System.out.println("Executing "+Thread.currentThread().getName());
	}
}
interface output{
	public void hello();
}

class Employee2 implements Runnable,output{
	@Override
	public void hello() {
		System.out.println("In Hello method");
	}
	
	@Override
	public void run() {
		System.out.println("Executing "+Thread.currentThread().getName());
	}
}