package Volatile_sync;

public class Second {
     volatile   static boolean falg;
	public static void main(String[] args) throws InterruptedException {
		
		Thread t = new Thread(()->{
			System.out.println("Thread is start");
			while(falg) {
				
			}
			System.out.println("Thread is ending");
		});
		t.start();
		falg = false;
		System.out.println("setting thread is flase");
		Thread.sleep(10000);
         System.out.println("thread is finish ::"+falg);
	}

}
