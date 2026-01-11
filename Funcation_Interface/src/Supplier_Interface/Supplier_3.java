package Supplier_Interface;

import java.util.Random;
import java.util.function.Supplier;

public class Supplier_3 {

	public static void main(String[] args) {
      Supplier<Integer> str = ()->new Random().nextInt(102);
      
      System.out.println(str.get());
	}

}
