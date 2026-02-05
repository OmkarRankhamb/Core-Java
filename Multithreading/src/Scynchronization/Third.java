package Scynchronization;

public class Third {

	public static void main1(String[] args) throws InterruptedException {

		multi mu = new multi();
		multi m1 = new multi();
		
		pahila p1 = new pahila(mu);
		Dusra p2 = new Dusra(mu);
		

		p1.start();
		//p1.join();
		p2.start();
		Thread.sleep(2500);
		
		System.out.println(m1.getcount());
		//System.out.println(mu.getcount());
	}

}

class multi { 
	int count =0;

	public synchronized void incrase() {
		//synchronized(this) {
		this.count++;
	}
//	}
	public  void Decrese() {
		count--;
	}

	public int getcount() {
		
		return this.count;
	}
}

class pahila extends Thread {

	multi mu;

	public pahila(multi mu) {
		this.mu = mu;
	}

	public void run() {
		for (int i = 0; i < 15000; i++) {
               mu.incrase();
              // System.out.println(i);
		}

	}
}
class Dusra extends Thread{
	multi mu;
	
	public Dusra(multi mu) {
		this.mu=mu;
	}
	public void run() {
		for(int i=0; i<10000; i++) {
			mu.Decrese();
			
		}
	}




	



}




