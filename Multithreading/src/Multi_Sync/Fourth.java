package Multi_Sync;

import java.util.ArrayList;
import java.util.List;




public class Fourth {

	public static void main(String[] args) {
		Basic bs = new Basic();
		Basic bs1 = new Basic();
		
		First f = new First();
		Second s = new Second();
		
		f.bas=bs;
		s.bas=bs;
		
		s.start();
		f.start();
	}

}
class Basic{
	List<Integer> list = new ArrayList<Integer>();
	int num =0;
	
	public synchronized void Increment() throws InterruptedException {
		Thread.sleep(1000);
		if(list.size()==10) {
			Thread.sleep(1000);
			wait();
			
			
		}
		System.out.println("add number::");
		list.add(num);
		//System.out.println("notifyalll Calling::");
		notify();
		num++;
		System.out.println("adding number::=>"+num);
		
	}
	
	
	public synchronized void Decrement() throws InterruptedException {
		if(list.size()==0) {
			System.out.println("nothing to romove::");
			wait();
		}
		else {
		int removed = list.remove(0);
		notify();
		System.out.println("remove element::"+removed);
		}
	}
}

class First extends Thread{
	Basic bas;
	
	public void run() {
		while(true) {
		try {
			bas.Increment();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}

class Second extends Thread{
	Basic bas;
	
	public void run () {
		
		while(true) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		try {
			bas.Decrement();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}