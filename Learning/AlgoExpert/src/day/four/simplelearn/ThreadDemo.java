package day.four.simplelearn;

import java.util.concurrent.*;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		
		ExecutorService ex = Executors.newFixedThreadPool(2);
		Future<String> future = ex.submit(() -> {
			//System.out.println("Processing..." );
			Thread.sleep(10000); 
			return "Completed";
		});
		
		while(!future.isDone()) {
			System.out.println("Still processing...");
			Thread.sleep(10); 
		}
		
		System.out.println("Task completed...");
		String result = future.get(3000, TimeUnit.MILLISECONDS);
		
		System.out.println(result);
		
		ex.shutdown();

	}

}
