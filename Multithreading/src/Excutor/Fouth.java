package Excutor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Fouth {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		// First Overload 
		
		Callable call =(()->"hello");
		
		try (ExecutorService ex = Executors.newFixedThreadPool(1);)
		{
		
		Future<String> f=ex.submit(call);
		/*
		 * sumbit return value
		 * sumbit return type store in Future
		 */
		System.err.println(f.get());
		} catch (Exception ex) {
			
		}
		//System.err.println(f.get());
				
	}

}
