package FuncationInterface_1;

import java.util.function.Predicate;

public class Predicate_2 {

	public static void main(String[] args) {
         Predicate<String> tr =(s)->{return s.length()>10;};
         
         System.out.println(tr.test("qwwwwwwwwwasas"));
	}

}
class I_add2 implements Predicate<Integer>{

	
	

	public boolean test( Integer t) {
		return t>10;
	}

	
	
	
}