package Multi_Sync;

import java.util.ArrayList;
import java.util.List;

public class Fourth_1 {

	public static void main(String[] args) {
     Print p = new Print();
     
    Fir fir = new Fir();
    Sir sir = new Sir();
    
    fir.re = p;
    sir.re =p;
    
    fir.start();
    sir.start();
     
 
     
	}

}

class Print {
	int num = 1;
	List<Integer> list = new ArrayList<Integer>();

	public synchronized void Increas() throws InterruptedException {
		if (list.size() == 10) {
          wait();
		}
		list.add(num);
		System.out.println("Adding element = "+num);
		notify();
		num++;
	}

	public synchronized void Decre() throws InterruptedException {
		if (list.size() == 0) {
             wait();
		}
		int Removed = list.remove(0);
		notify();
		System.out.println("Removed element::=>"+Removed);
	}
}

class Fir extends Thread{
	Print re;
	
	public void run() {
		while(true) {
		try {
			re.Increas();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}

class Sir extends Thread{
	Print re;
	
	public void run() {
		while(true) {
		try {
			Thread.sleep(4000);
			re.Decre();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}









