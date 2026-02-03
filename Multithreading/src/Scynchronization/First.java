package Scynchronization;

public class First {

	public static void main(String[] args) throws InterruptedException {
		
		counter_1 coun = new counter_1();
		
		
		onee p1 = new onee(coun);
		twoo p2 = new twoo(coun);
		
		p1.start();
		p2.start();
		Thread.sleep(2500);
  System.out.println(coun.getcount());
	}

}

class counter_1 extends Thread{
	int count =0;
	
	public void increase() {
		count ++;
		
	}
	
	public int  getcount() {
		return this.count++;
	}
}

class onee extends Thread {
	counter_1 coun;
	
	public onee(counter_1 Demo) {
		this.coun=Demo;
	}
	
   public void run() {
	   
	for(int i=0; i<10000; i++) {
		
		coun.increase();
	}
}
}

class twoo extends Thread{
	counter_1 coun;
	
	public twoo( counter_1 Demo) {
	 this.coun=Demo;
	 
	}
	public void run() {
		for(int i =0; i<10000;i++) {
			coun.increase();
			
		}
	}
}


