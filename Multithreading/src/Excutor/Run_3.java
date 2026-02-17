package Excutor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Run_3 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Runnable r1 = ()->{
			System.out.println(Thread.currentThread().getName());
			System.out.println(1);
		};
	try  (	ExecutorService ex = Executors.newSingleThreadExecutor();){
		Future<?> f = ex.submit(r1,1);
		
		System.out.println(f.get());
	}
	}

}
