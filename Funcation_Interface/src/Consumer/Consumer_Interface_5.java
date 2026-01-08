package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_Interface_5 {

	public static void main(String[] args) {
      List<Integer> list = List.of(12, 23, 67, 11, 87, 98, 10, 43, 90, 65);
      
      Consumer<Integer> rtc =(i)->System.out.println(i+2);
      
      list.forEach(rtc);
     // System.out.println("===========================");
      
      System.out.println(list);
	}

}

