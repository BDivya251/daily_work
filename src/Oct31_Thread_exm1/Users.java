package Oct31_Thread_exm1;

//Scenario: Two users transfer money from the same account at the same time.
//Goal: Avoid race conditions on account balance updates.
//3. Hotel Booking Service (Deadlock Simulation)
//
//Scenario: Two users try to book the same room and pay simultaneously.
//Goal: Handle lock ordering to avoid deadlocks.
//
//Key Learning: Acquire locks in a consistent order.

public class Users {
	public static void main(String[] args) {
		BankProcess bp = new BankProcess();
	UserAddThread t1 = new UserAddThread(bp,"ABC",10000);
	UserWithDrawThread t2 = new UserWithDrawThread(bp,"ABC",100001);
	t2.start();
	t1.start();
}
}
