package Lambda_1;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Sum_1 {
	public static void main(String[] args) {
		List<Integer> list = List.of(12, 22, 34, 56, 324, 22, 12, 45, 2323, 56);
//	int[] sum = {0};
//	list.stream().forEach(i-> sum[0]+=i);
//	System.out.println(sum[0]);
		/*
		 * Addition the List i+2;
		 * 
		 */
		Consumer<Integer> pre = (i) -> System.out.println(i + 2);
		list.forEach(pre);
		System.out.println("=======================");

		/*
		 * i*2
		 *   
		 */

		list.stream().map(i -> i * 2).forEach(System.out::println);

//		int sum = list.stream().mapToInt(Integer::intValue).sum();
//		System.out.println(sum);

		// Predicate<Integer> pre = (p)->p% 2==0;

//	

//		int sum=
//		list.stream().mapToInt(Integer::intValue).sum();
//		System.out.println(sum);

		// list.stream().map(i->i+2).forEach(System.out::println);

	}
}
