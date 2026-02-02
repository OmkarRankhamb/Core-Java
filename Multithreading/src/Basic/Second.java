package Basic;


public class Second {

	public static void main(String[] args) throws InterruptedException {
		print p = new print();
		p.start();
		//p.join();
		
		int Count = 1;
		while (Count < 30) {
			
			Thread.sleep(3000);
			System.out.println("Heloo");
		}
	}

}
class print extends Thread{
	public void run() {
		
     for(int i=0 ;i<40; i++) {
    	 try {
    	Thread.sleep(2000);
    	 }
    	 catch(Exception ex) {
    		System.out.println(ex.getMessage());
    	 }
    	 System.out.println(i);
		
			
		
	}
}
}