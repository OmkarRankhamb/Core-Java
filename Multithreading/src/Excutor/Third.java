 package Excutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Third {
	static int i = 1;

	public static void main(String[] args) {
		Runnable r1 = () -> {
			System.out.println("First");
			System.out.println(Thread.currentThread().getName() + "working");
			while (i < 5) {
				System.out.println(i);
				
			}
			i++;
		};
		Runnable r2 = () -> {
			System.out.println("second");
			System.out.println(Thread.currentThread().getName() + "working");
			while (i < 5) {
				System.out.println(i);

				i++;
			}
		};
		Runnable r3 = () -> {
			System.out.println("Third");
			System.out.println(Thread.currentThread().getName() + "working");
			while(i<5) {
				System.out.println(i);
				i++;
			}

		};
		Runnable r4 = () -> {
			System.out.println("Fourth");
			System.out.println(Thread.currentThread().getName() + "working");
			while (i<5) {
				System.out.println(i);
				i++;
			}

		};

		try (ExecutorService tr = Executors.newFixedThreadPool(4);) {

			tr.execute(r1);
			tr.execute(r2);
			tr.execute(r3);
			tr.execute(r4);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
