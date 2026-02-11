package Multi_Sync;

import java.util.ArrayList;
import java.util.List;

public class One_1 {

	public static void main(String[] args) {
		Order_r  dr = new Order_r();
		
		one_e first = new one_e();
		two_t second = new two_t();
		first.or=dr;
		second.or=dr;
		
		first.start();
		second.start();
		
		//System.out.println(dr);
		
	}

}

class Order_r{
	int num =0;
	List<Integer> list = new ArrayList<>();
	
	
	public synchronized void Inceas() throws InterruptedException {
		if(list.size()==10) {
			wait();
		}
		System.out.println("added element::=>"+num);
		list.add(num);
		
	//	notify();
		num++;
	}
	
	public synchronized void Decres() throws InterruptedException {
		if(list.size()==0) {
			wait();
		}
		else {
	int remove=	list.remove(0);
	//notify();
	System.out.println("romved the element :=>"+remove);
		
	}
	}
}
class one_e extends Thread{
	Order_r or;
	
	public void run() {
		while(true) {
		try {
			or.Inceas();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}

class two_t extends Thread{
	Order_r or;
	
	public void run () {
		while(true) {
		try {
			Thread.sleep(10000);
			or.Decres();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
}
