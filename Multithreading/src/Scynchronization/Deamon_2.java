package Scynchronization;

public class Deamon_2 {

	public static void main(String[] args) throws InterruptedException {
		Insert In = new Insert();
		
		F1 f1 = new F1(In);
		F2 f2 = new F2(In);
		
		f1.setDaemon(true);
		f1.start();
		
		f2.start();
		Thread.sleep(1500);
		System.out.println(In.count);

	}

}
class Insert{
	int count;
	
	public void Increas() {
		count++;
		
	}
	
	public int getcount() {
		return count;
	}
}

class F1 extends Thread{
	Insert in;
	
	public F1(Insert in) {
		this.in=in;
	}
	public void run() {
		for(int i=0; i<4000;i++) {
			in.Increas();
		}
	}
}
class F2 extends Thread{
	Insert in;
	
	public F2(Insert in) {
		this.in=in;
	}
	public void run() {
		for(int i=0; i<4000;i++) {
			in.Increas();
		}
	}
}