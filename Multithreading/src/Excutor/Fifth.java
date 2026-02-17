package Excutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fifth {

	public static void main(String[] args) {
		Runnable r1 = ()->{
			System.out.println("abcdef");
		};
		ExecutorService ex = Executors.newSingleThreadExecutor();
		
		ex.execute(r1);
		ex.submit(r1);
		ex.shutdown();
		
	}

}
