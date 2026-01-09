package Supplier_Interface;

import java.util.function.Supplier;

public class Supplier_2 {

	public static void main(String[] args) {
         Supplier<String> str = ()-> {return new StringBuffer("Hello Word").toString();};
         
         
         System.out.println(str.get());
         
         
	}

}
