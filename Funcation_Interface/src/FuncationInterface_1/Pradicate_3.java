package FuncationInterface_1;

import java.util.function.Predicate;

public class Pradicate_3 {

	public static void main(String[] args) {

		
		Predicate<Integer>  ptr =(i)->{ return i%2==0;};
		
		System.out.println(ptr.test(46));
	}

}
