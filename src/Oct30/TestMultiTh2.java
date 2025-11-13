package Oct30;

public class TestMultiTh2 {
	public static void main(String[] args) throws Exception{
		BookMgn bk = new BookMgn();
		Runnable r1 = ()-> {
				for(int i=0;i<1000;i+=50) {
					bk.incrementCount();
				}
		};
		Runnable r2 = ()-> {
			for(int i=0;i<200;i+=50) {
				bk.incrementCount();
			}
	};
	Runnable r3 = ()-> {
		for(int i=0;i<920;i+=50) {
			bk.incrementCount();
		}
};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		System.out.println(bk.getCount());
	}
}


class BookMgn{
	 int count=0;
	public synchronized  void incrementCount() {
		count+=50;
		System.out.println(count);
		
	}
	public int getCount() {
		return count;
	}
	
}