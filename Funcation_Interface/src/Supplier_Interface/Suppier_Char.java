package Supplier_Interface;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Suppier_Char {
          
	public static void  main(String[] args) {
		
		Predicate<Integer> stc = (i)->{return i%2==0;};
		
		System.out.println(stc.test(62));
			
		};
       
	}

