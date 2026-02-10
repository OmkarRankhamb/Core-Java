package Excutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Second {
      static int i =1;
	public static void main(String[] args) {
		
		Runnable r1 = ()->{
			System.out.println("First");
			System.out.println(Thread.currentThread().getName()+"working");
			
			while(i<5) {
				
				System.out.println(i);
				i++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Runnable r2 = ()->{
			System.out.println("Second");
			System.out.println(Thread.currentThread().getName()+"working");
			while(i<5) {
				System.out.println(i);
				i++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Runnable r3 = ()->{
			System.out.println("Third");
			System.out.println(Thread.currentThread().getName()+"working");
			while(i<5) {
				System.out.println(i);
				i++;
				
			}
		};
		Runnable r4 = ()->{
			System.out.println("Fourth");
			System.out.println(Thread.currentThread().getName()+"working");
			while(i<5) {
				System.out.println(i);
				i++;
			}
		};
		
		
			try(	ExecutorService ex = Executors.newFixedThreadPool(2);){
				
				ex.execute(r1);
				ex.execute(r2);
				ex.execute(r3);
				ex.execute(r4);
				
				
			}catch(Exception rx) {
				System.out.println(rx.getMessage());
			}
	}

}
