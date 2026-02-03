package Scynchronization;

public class second {

	public static void main(String[] args) throws InterruptedException {
		print pri = new print();
		
		first f1 = new first(pri);
		secondd f2 = new secondd(pri);
		
		f1.start();
		f2.start();
		Thread.sleep(2500);
		System.out.println(pri.getcoun());
		
		
	}

}

class print{
	int count =0;
	
	public void increase() {
		count++;
	}
	
//	public void Decrease() {
//		count--;
//	}
//	
	public int getcoun() {
		return this.count;
	}
}

class first extends Thread{
	print pre;
	
	public first(print pm) {
		this.pre=pm;
	}
	
	
	public void run () {
		for(int i=0; i<10000; i++) {
			pre.increase();
		}
	}
}
class secondd extends Thread{
	print pre;
	
	public secondd(print pm) {
		this.pre=pm;
	} 
	
	public void run() {
		for (int i=0; i<10000; i++) {
			pre.increase();
		}
	}
}
