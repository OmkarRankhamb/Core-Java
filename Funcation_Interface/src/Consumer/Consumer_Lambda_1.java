package Consumer;

import java.lang.reflect.Array;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Consumer_Lambda_1 {

	public static void main(String[] args) {
          List<Integer> list =List.of(12, 13, 121, 46, 48, 90, 15,87, 98, 112);
          
          Predicate<Integer> lst =(i)->{System.out.println(i>2);
		  return i>i;};
          
          System.out.println(lst);
         // list.forEach(lst);
	}

}
