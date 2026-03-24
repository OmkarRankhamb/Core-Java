package Reduce;

import java.util.List;
import java.util.Optional;

public class FIrst {

	public static void main(String[] args) {

      Optional<Integer> sum =  List.of(12,34,56,78,67).stream().reduce((a,b)->a+b);
      
      System.out.println(sum);
	}

}
