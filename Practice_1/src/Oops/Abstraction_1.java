package Oops;

public class Abstraction_1 {

	public static void main(String[] args) {
		picx d2 = new picx();
          d2.print();
          d2.add(0);
          
          
	}

}
abstract class Demo2{
	abstract public void add(int id);
	
	public void print() {
		System.out.println("public methos is callting ");
	}
}
class picx extends Demo2{

	
	public void add(int id) {
		id =101;
		System.out.println(id);
		
	}
	
	
}
