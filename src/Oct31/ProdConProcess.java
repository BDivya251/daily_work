package Oct31;
import java.util.*;
public class ProdConProcess {
	Queue<Integer> que = new LinkedList<>();
	int max_limit=10;
	public void add(int a) throws InterruptedException {
		if(que.size()>max_limit) {
			notify();
		}
		else {
			que.add(a);
			System.out.println("Added to the que "+a);
		}
	}
	public void del() throws InterruptedException {
		if(que.size()<=0) {
			notify();
		}
		else {
			que.poll();
		}
	}
}
