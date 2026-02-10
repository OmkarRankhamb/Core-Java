package Excutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class First {

	public static void main(String[] args) {
		
		
		Runnable r1 =()->{
			System.out.println("First");
			System.out.println(Thread.currentThread().getName()+"working");
		};
		
		Runnable r2 =()->{
			System.out.println("second");
			System.out.println(Thread.currentThread().getName()+"working");
		};
		
		Runnable r3 = ()->{
			System.out.println("Third");
			System.out.println(Thread.currentThread().getName()+"Third");
		};
		
		Runnable r4 = ()->{
			System.out.println("Fourth");
			System.out.println(Thread.currentThread().getName()+"working");
		};
		try {
		
		ExecutorService ex = Executors.newFixedThreadPool(4);
		
		ex.execute(r1);
		ex.execute(r2);
		ex.execute(r3);
		ex.execute(r4);
		
		
		ex.close(); // => AutoCloseble
		}
		catch(Exception rx){
			System.out.println(rx.getMessage());
			
		}
		
		
	}

}
