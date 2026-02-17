package Excutor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable_2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable c2 =(()->{return new String("om");});
		
		try(ExecutorService tc = 	Executors.newFixedThreadPool(2);){
		
		Future<?> f= tc.submit(c2);
		System.out.println(f.get());

	}
	}

}
