package Stream_ApI;

import java.util.List;

public class Custom_class {

	public static void main(String[] args) {
		Demo d = new Demo();
		
	   List.of(12,344,556,433,67,35,34)
	   .stream()
	   .filter(d::get)
	   .peek((i)->System.out.println(i+"*"))
	   .sorted(d::set)
	
	   .forEach(System.out::println);

	}

}
class Demo{
	public boolean get(int i) {
		return i>30;
	}
	public int set(int i,int j) {
		return i+j;
	}
	public boolean see (boolean i) {
		return i;
	}
}
