package FuncationInterface_1;

import java.util.function.Predicate;

public class Predicate_1 {

	public static void main(String[] args) {
		
           Demo_I d = new Demo_I();		
		System.out.println(d.test(9));
		
		Predicate<Integer> ptr =(i)->{return i%2==0;};
		System.out.println(ptr.test(56));
	}

}
class Demo_I implements Predicate<Integer>{

	public boolean test(Integer t) {
		return t>10;
	}

	
}