package Prime_Number;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Same_element_2 {

	public static void main(String[] args) {
		/*
		 *  same Element print
		 */

		List<Integer> list4 = List.of(12, 34, 56, 78, 12, 34);

	//	Integer sum =
				list4.stream()
				// .peek(System.out::println)
				.filter(i -> Collections.frequency(list4, i) == 1).peek(System.out::println).forEach(System.out::println);
				// .toList();
				//.reduce(0, (i, j) -> i + j);
	//	System.out.println(sum);

		
		/*
		 * two list print same element 
		 */
		List<Integer> list = List.of(10, 20, 30, 40, 50);
		List<Integer> list1 = List.of(10, 30, 50, 90, 100);

		List<Integer> list3 = list.stream()
		.filter(list1::contains).toList();
		System.out.println(list3);
	}

}
