package Scynchronization;

public class Deamon_1 {

	public static void main(String[] args) throws InterruptedException {
         Fifo count = new Fifo();
        // Fifo countt = new Fifo();
         
         f1 f = new f1(count);
         f2 p = new f2(count);
         
         f.setDaemon(true);
         f.start();
        
         p.start();
         Thread.sleep(2500);
         
         System.out.println(count.getcount());
      //   System.out.println(countt.getcount());
	}

}
class Fifo{
	
	int counter;
	
	public void Increas() {
		counter++;
	}
	
	public int getcount() {
		return counter;
	}
}
class f1 extends Thread{
	Fifo count;
	public f1( Fifo count) {
		this.count=count;
	}
	
	public void run () {
		for(int i=0;i<40000;i++) {
			count.Increas();
		}
	}
}

class f2 extends Thread{
	Fifo count;
	
	public f2(Fifo count) {
		this.count=count;
	}
	public void run() {
		for(int i =0; i<40000; i++) {
			count.Increas();
		}
	}
}