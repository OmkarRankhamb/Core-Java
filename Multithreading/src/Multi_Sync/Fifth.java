package Multi_Sync;

import java.util.ArrayList;
import java.util.List;

public class Fifth {

	public static void main(String[] args) {

		 prder_p p = new  prder_p();
		 
		 First_f f = new First_f();
		 Second_s s = new Second_s();
		 
		f.pre=p;
		s.pre=p;
		 
		 f.start();
		 s.start();
		 
		 
		 
	}

}
class prder_p{
	int num =1;
	List<Integer> list = new ArrayList<>();
	
	public synchronized void Increas() throws InterruptedException {
		if(list.size()==10) {
			wait();
		}
		list.add(num);
		notify();
		num++;
		System.out.println("Adding the element ::"+num);
	}
	
	public synchronized void Decres() throws InterruptedException {
		if(list.size()==0) {
			wait();
		//	System.out.println("nothing to remove");
			
		}
		
		int removed=list.remove(0);
		notify();
		System.out.println("remove elemnt :=>"+removed);
	}
}
class First_f extends Thread{
	 prder_p pre;
	 
	 public void run() {
		 while(true) {
		 try {
			// Thread.sleep(10000);
			pre.Increas();
		 } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		 }
	 }
}

class Second_s extends Thread{
	 prder_p pre;
	 
	 public void run() {
		 while(true) {
		 try {
			 Thread.sleep(10000);
			pre.Decres();
		 } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		 }
	 }
}











