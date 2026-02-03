package Basic;

public class Fourth {

	public static void main(String[] args) throws Exception {
		Counter D1 = new Counter();
		
	//	Thread d1 = new Thread(Demo);
		
		one n1 = new one(D1);
		two n2 = new two(D1);
		
		//n1.Demo=Demo;
	//	n2.Demo=Demo;
		
		
		n1.start();
		n2.start();
		Thread.sleep(1000);
		System.out.println(D1.getcount());
	}

}


class Counter {
	int count=0;
	
	public void increase() {
		count ++;
	}
	
	public int getcount() {
		return this.count;
	}
	
	
}


class one extends Thread {
	
	Counter D1;
	
	public one(Counter coun) {
		
		this.D1=coun;
	}
	public void run() {
		for(int i=0; i<10000;i++) {
			
			D1.increase();
		}
	}
	}


class two extends Thread{
	Counter D1 ;
	
	public two (Counter coun) {
		this.D1 = coun;
	}
	public void run() {
		for(int i =0; i<10000; i++) {
			D1.increase();
		}
	}
}



