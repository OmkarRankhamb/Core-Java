package Excutor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Siixth {

	public static void main(String[] args) throws Exception {

		Callable call = (() -> "hello man ");

		try (ExecutorService ex = Executors.newFixedThreadPool(1);) {
			
			
			
			Future<String> f = ex.submit(call);
              f.cancel(true);        // concurrent.CancellationException
			
		
			System.out.println(f.get());
		} catch (Exception rc) {
			System.out.println(rc);
		}
	}

}
