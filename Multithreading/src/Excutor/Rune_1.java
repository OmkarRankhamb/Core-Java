package Excutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Rune_1 {

	public static void main(String[] args) {
		Runnable r1 =()->{
			System.out.println(Thread.currentThread().getName());
			for(int i=1; i<10;i++) {
				System.out.println(i);
			}
		};
		
		Runnable r2 =()->{
			System.out.println(Thread.currentThread().getName());
			for(int i=1; i<=5;i++) {
				for(int j =1; j<=5;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		};
		Runnable r3 =()->{
			System.out.println(Thread.currentThread().getName());
			for(int i=1;i<=5;i++) {
				for(int j=1; j<=5;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		};
		
	try(	ExecutorService ex =Executors.newFixedThreadPool(5);){
		
		ex.execute(r1);
		ex.execute(r2);
        ex.execute(r3);
	}
	}

}
