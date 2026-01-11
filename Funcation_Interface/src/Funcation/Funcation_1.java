package Funcation;

import java.util.function.Function;

public class Funcation_1 {

	public static void main(String[] args) {
   
		Function<String , Integer> fun =(i)->{return i.length();};
		
		Function<Character[] , String > fun2 =(i)->{String s = new String ();
		for(char C:i) {
			
			s=s+C;
		}
		return s;
		};
		
		Function<Character[] , Integer> fun3 = fun.compose(fun2);
		
		System.out.println(fun3.apply(new Character [] {'a','b','c'}));
	}
}

