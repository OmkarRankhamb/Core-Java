package Excutor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Rune_2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		Runnable re =()->{
			System.out.println(Thread.currentThread().getName());
			System.out.println("abcd");
		};
		
		ExecutorService ex= Executors.newCachedThreadPool();
		
		Future<?> f = 	ex.submit(re,"Default value");
		//ex.submit(re);
		System.out.println(f.get());
	}

}
