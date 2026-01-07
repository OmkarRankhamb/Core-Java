package FuncationInterface_1;

import java.util.function.Predicate;

public class Predicate_4 {

	public static void main(String[] args) {
		
		Predicate<String> pt =(s)->{
			StringBuffer sb = new StringBuffer(s);
			String s1=sb.reverse().toString();
			return s.equals(s1);
			
		};
		System.out.println(pt.test("aana"));
	
		
	}

}
