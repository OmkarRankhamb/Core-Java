package Excutor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Colle_4 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable c1 = (()->{return new String("abcd");});
		
		ExecutorService ex = Executors.newCachedThreadPool();
		
		Future<?> f = ex.submit(c1);
		
		System.out.println(f.get());
          
		ex.shutdown();
	}

}
