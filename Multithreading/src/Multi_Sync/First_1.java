package Multi_Sync;

import java.util.ArrayList;


public class First_1 {

	public static void main(String[] args) throws InterruptedException {
		
		Demo_2 demo = new Demo_2();
//		d.Addnumber();
//		d.removeNumber();
		
		one first = new one();
		two second = new two();
		
		first.dm=demo;
		second.dm=demo;
	
		first.start();
		second.start();
	
	}

}

class Demo_2{
	ArrayList<Integer> list = new ArrayList<Integer>();
	int num = 1;
	public synchronized void Addnumber() throws InterruptedException {
		
		Thread.sleep(1000);
		if(list.size()==10) {
			Thread.sleep(2500);
			wait();
		}
			
			System.out.println("Adding number is:::"+num);
			list.add(num);
			notify();
			num++;
		//	System.out.println("Adding number size is fullilled:::");
		
	}
	public synchronized void removeNumber() throws InterruptedException {
		if(list.size()==0) {
			Thread.sleep(1000);
			wait();
		System.out.println("nathing to remove ::");
		}
		else {
		int removd = list.remove(0);
		notify();
			System.out.println("number is removed:: : "+removd);
		}
		
	}
}

class one extends Thread{
	Demo_2 dm;
	
	public void run() {
		
		while(true) {
		try {
			dm.Addnumber();
			System.out.println("increment::::  ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
class two extends Thread{
	Demo_2 dm;
	
	public void run() {
		while(true) {
		try {
			Thread.sleep(10000);
			dm.removeNumber();
			System.out.println("decrement::: ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
}