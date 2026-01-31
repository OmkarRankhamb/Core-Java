package Prime_Number;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Min_Number {

	public static void main(String[] args) {
		/*
		 * Min number
		 */
		List<Integer> list = List.of(35, 34, 45, 546, 56, 767, 78);
		Optional<Integer> min = list.stream().reduce((i, j) -> Integer.min(i, j));
		System.out.println(min);

		/*
		 * String Length
		 */
		List<String> list1 = List.of("rohan", "mahi", "sahara", "pratik");
		Map<String, Integer> map = list1.stream()
				.collect(Collectors.toMap(s ->s, String::length));
				
				
				System.out.println(map);

		/*
		 * String lenght & max Length
		 */
				
		List<String> list2 =List.of("man","shami","oputnjgeewqwq","ygfwurwer");
Optional<Integer> m1=list2.stream()
		.map(String::length)
		.filter(i->i>=9)
		.peek(System.out::println)
		.reduce((i,j)->Integer.max(i, j));
System.out.println(m1);
	}

}
