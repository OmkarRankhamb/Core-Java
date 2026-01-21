package instance_refarance;

import java.util.List;

public class First {

	public static void main(String[] args) {
		 Demo_1 d = new Demo_1();
		 
   int sum =    List.of(12,23,45,56,324,543)
       .stream()
       .filter(d::get)
       .reduce(0,d::add);
       System.out.println(sum);
       
       
	}

}
class Demo_1{
	public  boolean get (int i) {
		return i >30;
	}
	public int add(int i ,int j) {
		return i+j;
	}
	public void sam(int i) {
		System.out.println(i);
	}
}
