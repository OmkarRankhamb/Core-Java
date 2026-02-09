package Volatile_sync;

public class Custom_class {

	public static void main(String[] args) {
		
		Order onr = new Order();
		
		one_o first = new one_o();
		two_t second = new two_t();
		
		first.or=onr;
		second.or=onr;
		
		first.start();
		second.start();
		
		System.out.println(onr.getflag());

	}

}
class Order{
	boolean flag = true;
	
	public void increas() {
		while(flag) {
			for(int i =0;i<500;i++) {
				
			}

		}
	}
		public boolean getflag() {
			return this.flag;
		
	}
}
class one_o extends Thread{
	Order or;
	
	public void run() {
		or.increas();
	}
}

class two_t extends Thread{
	
	Order or;
	
	public void run() {
		or.increas();
	}
}