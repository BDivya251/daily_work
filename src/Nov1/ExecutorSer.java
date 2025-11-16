package Nov1;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//Thousands of orders hit the system every second — you need
//to match, process, and store them concurrently without
//corrupting shared data.Concurrent Collection 
//UsedConcurrentLinkedQueue<Order> to queue incoming orders
//safely from multiple threads.Thread LogicMultiple worker 
//threads poll from the queue, process payments, and update
//inventory.Why Concurrent CollectionArrayList or LinkedList 
//would cause ConcurrentModificationException. The concurrent 
//queue ensures safe iteration and modification across threads.
//Add-onUse ExecutorService to manage worker threads instead of 
//manually handling Thread objects.
//Snippet
//Queue<Order> orderQueue = new ConcurrentLinkedQueue<>();
//ExecutorService executor = Executors.newFixedThreadPool(5);
//
//for (int i = 0; i < 5; i++) {
//    executor.submit(() -> {
//        while (true) {
//            Order order = orderQueue.poll();
//            if (order != null) processOrder(order);
//        }
//    });
//}


public class ExecutorSer {
	public static ConcurrentHashMap<String,Integer> map  = new ConcurrentHashMap<>(5);
	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(3);
		ex.submit(()->{ExecutorSer.add("HDFC", 1000);});
		ex.submit(()->{ExecutorSer.add("SBI", 10000);});
		for(int i=0;i<10;i++) {
		ex.submit(()->{ExecutorSer.add("asd", 10000);});}
		for(int i=0;i<10;i++) {
		ex.submit(()->{ExecutorSer.add("HDFC",1000);});}
		ex.submit(()->{ExecutorSer.add("SB1I", 10000);});
		ex.submit(()->{ExecutorSer.add("SBI1", 10000);});
		ex.shutdown();
		try {
			ex.awaitTermination(5000, TimeUnit.MILLISECONDS);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("The total size of the concurrent hashmap is "+ExecutorSer.getSize());
	}
	public static void add(String name,int num) {
		map.put(name, num);
		System.out.println(Thread.currentThread().getName() + " added " + name + " -> " + num+"Map size is :"+map.size());
		 
	}
	public static int getSize() {
		return map.size();
	}

}
