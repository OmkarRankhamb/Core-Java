package Volatile_sync;

public class First {

	 static boolean flag = true;
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(()->{
			System.out.println("Thread t1 is start::");
			while (flag) {
				
			}
			System.out.println("Thread t1 is end::");
			
		});
		
		
		t1.start();
		Thread.sleep(1000);
		System.out.println("setting flag to flase::");
		flag = false;
		System.out.println("flag is new ::"+flag);
	}

}
