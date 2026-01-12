package Lambda_1;

import java.util.List;
import java.util.function.Consumer;

public class First {
 public static void main(String [] srgs) {
		List<Integer> list = List.of(12, 22, 34, 56, 324, 22, 12, 45, 2323, 56);

		
		Consumer<Integer> csr=(i)->{System.out.println(i/2);};
		list.forEach(csr);
		System.out.println("==========================");
		list.stream().map(i-> i-2).forEach(System.out::println);
 }
}
