package Prime_Number;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


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
				
		List<?> list2 =List.of("man","shami","oputnjgeew","ygfwurwer");
		Optional<String,Integer> min = list2.stream()
				.map((i,j)->String(i)
	}

}
