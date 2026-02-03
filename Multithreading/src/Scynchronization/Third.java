package Scynchronization;

public class Third {

	public static void main(String[] args) throws InterruptedException {

		multi mu = new multi();
		
		pahila p1 = new pahila(mu);
		Dusra d1 = new Dusra(mu);
		
		p1.start();
		d1.start();
		Thread.sleep(2500);
		
		System.out.println(mu.getcount());
	}

}

class multi {
	int count = 0;

	public void incrase() {
		count++;
	}
	public void Decreas() {
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
		for (int i = 0; i < 10000; i++) {
               mu.incrase();
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
			mu.Decreas();
		}
	}
}










