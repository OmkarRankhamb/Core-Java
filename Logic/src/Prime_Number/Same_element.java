package Prime_Number;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
/*
 * print unique element
 */
public class Same_element {

	public static void main(String[] args) {
		List<Integer>list=List.of(12,32,45,56,56,67,23,34,34,67,12);
		list.stream()
		.filter(i->Collections.frequency(list, i)==1).forEach(System.out::println);

	}

}
