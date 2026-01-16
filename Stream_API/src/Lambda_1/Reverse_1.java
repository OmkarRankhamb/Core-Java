package Lambda_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse_1 {

	public static void main(String[] args) {
		List.of("Please turn off")
		.stream()
		.map(i->Arrays.stream(i.split(" "))
		.map(w-> new StringBuffer(w).reverse().toString())
		.collect(Collectors.joining(" ")))
		.forEach(System.out::println);
			

	}

}
