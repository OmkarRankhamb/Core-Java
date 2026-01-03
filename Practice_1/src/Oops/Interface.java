package Oops;

public class Interface {

	public static void main(String[] args) {
		Machean m1 = new Machean();
		m1.macanic();
	
	}

}
interface Saso{
	//public static final int  id=10;
	//public static final String name = "Sham";

	public static  void print() {
		System.out.println("print is calling ........");
	}
	abstract void macanic();
		
	
}
class Machean implements Saso{
 int a;
	
	public void macanic() {
		
		int a = 19;
		System.out.println(a);
	}
	
}

