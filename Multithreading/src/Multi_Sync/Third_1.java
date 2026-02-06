package Multi_Sync;

import java.util.ArrayList;
import java.util.List;


public class Third_1 {

	public static void main(String[] args) {
		Sour s = new Sour();
		
		Produ s1 = new Produ();
		Consu c1 = new Consu();
		
		s1.sor=s;
		c1.sor=s;
		
		s1.start();
		c1.start();
		
		
	}

}
class Sour{
	List<Integer> list = new ArrayList<>();
	
	int num=0;
	
	public synchronized void Increament() throws InterruptedException {
		Thread.sleep(1000);
		if(list.size()==10) {
			Thread.sleep(2500);
			//wait();
		}
		System.out.println("Adding number::");

		list.add(num);
		//notify();
		num++;
		System.out.println("adding number::=>"+num);		
	}
	public synchronized void Decrement() throws InterruptedException {
		if(list.size()==0) {
			Thread.sleep(1000);
			wait();
			System.out.println("nothin to removed::");
		}
		else {
	int removed=	list.remove(0);
	//notify();
		System.out.println("Remove the element ::"+removed);
	}
	}
}
class Produ extends Thread{
	Sour sor;
	

	public void run() {
	//	while(true) {
			try {
			sor.Increament();
			System.out.println("Increment::");
			}
			catch(Exception ex){
			}
		
	}
		}
	//}
	
class Consu extends Thread{
	Sour sor;
	
	public void run () {
		//while (true) {
			try {
			Thread.sleep(10000 );
			sor.Decrement();
			System.out.println("decrement:::");
			}catch(Exception ex) {
		
		//	}
	}
	}
}
