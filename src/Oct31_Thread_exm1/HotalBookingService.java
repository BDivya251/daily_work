package Oct31_Thread_exm1;

public class HotalBookingService {
	//3. Hotel Booking Service (Deadlock Simulation)
	//
	//Scenario: Two users try to book the same room and pay simultaneously.
	//Goal: Handle lock ordering to avoid deadlocks.
	//
	//Key Learning: Acquire locks in a consistent order.
	public static void main(String[] args) throws InterruptedException {
		Hotal h  = new Hotal("ABC",1000);
		Runnable r1 = ()->{h.booking("ABC", 1000);};
		Runnable r2 = ()->{h.booking("ABC", 1000);};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	
	}
}
class Hotal{
	String hotal;
	int amount;
	boolean available=true;
	Hotal(String hotal,int amount){
		this.hotal=hotal;
		this.amount=amount;
	}
	public synchronized void booking(String hotal,int amount) {
		if(hotal.equals(this.hotal) && amount==this.amount) {
			if( available==true) {
			available=false;
			System.out.println("Hotal booked");}
			else {
				System.out.println("Already booked");
			}
		}
		else {
			System.out.println("Hotal booked");
		}
		
	}
}
